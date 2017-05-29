package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;


/*	2. Identify all the dependencies (parameters)
	3. Identify All methods, constructors, fields: isValid, setDescription
	5. Write code to generate random inputs for the constructors
	6. Write code to randomly choose a method of the CUT: either isValid or setDescription
	7. Write code to generate random inputs for the chosen
method: "if isValid, these kinds of inputs. else if setDescription, these kinds of inputs..."
8. Invoke the method (execute the method)
9. Check if stopping criterion is not satisfied go to step 4.
● Note: steps 5 and 7:
● If the input is a primitive data type,
● generate a random primitive value
● If the input is a reference, choose randomly among:
● The null value
● The constructor with no arguments (if it exists) */

/* Constructor params:
 * int startHour, int startMinute, int startDay, int startMonth, int startYear, String title, String description. Just ints and strings */
/* isValid params: None, but always called by constructor */
/* setDescription params: String description */

/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Generate Random Tests that tests Appt Class.
	 */
	@Test
	public void randomApptTest()  throws Throwable  {

		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		System.out.println("Start testing...");

		for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			long randomseed = System.currentTimeMillis();
			//			System.out.println(" Seed:"+randomseed );
			Random random = new Random(randomseed);

			// generate random inputs to feed the constructor
			int startHour = ValuesGenerator.getRandomIntBetween(
					random, -1, 24);
			int startMinute = ValuesGenerator.getRandomIntBetween(
					random, -1, 60);
			int startDay = ValuesGenerator.getRandomIntBetween(
					random, -1, 32);
			int startMonth = ValuesGenerator.getRandomIntBetween(
					random, -1, 13);
			int startYear = ValuesGenerator.getRandomIntBetween(
					random, -1, 3000);

			String title = ValuesGenerator.getString(random);
			String description = ValuesGenerator.getString(random);

			//Construct a new Appointment object with the initial data	 
			Appt appt = new Appt(
					startHour,
					startMinute,
					startDay,
					startMonth,
					startYear,
					title,
					description);

			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if((iteration%10000)==0 && iteration!=0 )
				System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
		System.out.println("Done testing...");
	}
}
