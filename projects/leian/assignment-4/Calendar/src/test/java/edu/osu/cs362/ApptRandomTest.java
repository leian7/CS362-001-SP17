package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;

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
