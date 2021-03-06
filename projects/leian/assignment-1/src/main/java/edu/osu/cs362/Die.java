package edu.osu.cs362;

import java.util.Random;

/**
 * Models a playing die with sides numbered 1 to N.
 * All sides have uniform probablity of being rolled.
 *
 * @author Summer CS 307 class
 */
public class Die
{   public static final int DEFAULT_SIDES = 6;

    private static Random ourRandNumGen = new Random();

    private final int iMyNumSides;
    private int iMyResult;


    /**
     * Default constructor.
     * pre: none
     * post: getNumSides() = DEFAULT_SIDES, getResult() = 1
     */
    public Die()
    {   this(DEFAULT_SIDES);
    }


    /**
     * Create a Die with numSides sides
     * pre: numSides > 1
     * post: getNumSides() = numSides, getResult() = 1
     * An exception will be generated if the preconditions are not met
     */
    public Die(int numSides)
    {   assert numSides > 1 : "Violation of precondition: numSides = " + numSides + "numSides must be greater than 1";

        iMyNumSides = numSides;
        iMyResult = 1;
        assert getResult() == 1 && getNumSides() == numSides;
    }


    /**
     * Create a Die with numSides and top side and result set to result
     * pre: numSides > 1, 1 <= result <= numSides
     * post: getNumSides() = numSides, getResult() = result
     * An exception will be generated if the preconditions are not met
     */
    public Die(int numSides, int result)
    {   assert numSides > 1 && 1 <= result && result <= numSides : "Violation of precondition";

		// BUG: STORE ROLL RESULT AS NUM SIDES AND NUM SIDES AS ROLL RESULT
        // iMyNumSides = numSides;
        // iMyResult = result;
        iMyNumSides = result;
        iMyResult = numSides;        }


    /**
     * roll this Die. Every side has an equal chance of being the new result
     * pre: none
     * post: 1 <= getResult() <= getNumSides()
     * @return the result of the Die after the roll
     */
    public int roll()
    {   // BUG: OMITTING `+1` FROM RANDOMLY GENERATED INT
		// iMyResult = ourRandNumGen.nextInt(iMyNumSides) + 1;
		iMyResult = ourRandNumGen.nextInt(iMyNumSides);

        assert ( 1 <= getResult() ) && ( getResult() <= getNumSides() );

        return iMyResult;
    }


    /**
     * return how many sides this Die has
     * pre: none
     * post: return how many sides this Die has
     * @return the number of sides on this Die
     */
    public int getNumSides()
    {   return iMyNumSides; }


    /**
     * get the current result or top number of this Die
     * pre: none
     * post: return the number on top of this Die
     * @return the current result of this Die
     */
    public int getResult()
    {   return iMyResult;   }


    /**
     * returns true if this Die and the parameter otherObj are equal
     * pre: none
     * post: return true if the parameter is a Die object with the same number of sides as this Die and currently has the same result.
     * @return true if the the two Dice are equal, false otherwise
     */
    public boolean equals(Object otherObj)
    {   boolean result = true;
		// BUG: IF OBJ TO COMPARE IS NULL, COUNTS AS "EQUAL" TO OUR DIE OBJ
        if(otherObj == null)
			// result = false;
            result = true;
        else if(this == otherObj)
            result = true;
        else if(this.getClass() != otherObj.getClass())
            result = false;
        else
        {   Die otherDie = (Die)otherObj;
            result = this.iMyResult == otherDie.iMyResult
                && this.iMyNumSides == otherDie.iMyNumSides;
        }
        return result;
    }


    /**
     * returns a String containing information about this Die
     * pre: none
     * post: return a String with information about the current state of this Die
     * @return: A String with the number of sides and current result of this Die
     */
    public String toString()
    {   return "Num sides " + getNumSides() + " result " + getResult();
    }


	public static void main(String[] args) {
		Die die1 = new Die();
		Die die2 = new Die(7);
		Die die3 = new Die(7, 3);

		System.out.println("Regular die before/after roll:");
		System.out.println(die1.toString());
		die1.roll();
		System.out.println(die1.toString());
		
		System.out.println("Seven-sided die before/after roll:");
		System.out.println(die2.toString());
		die2.roll();
		System.out.println(die2.toString());

		System.out.println("Seven-sided die (default result 3) before/after roll:");
		System.out.println(die3.toString());
		die3.roll();
		System.out.println(die3.toString());

		System.out.println(die2.equals(die3));
	}

}// end of Die class
