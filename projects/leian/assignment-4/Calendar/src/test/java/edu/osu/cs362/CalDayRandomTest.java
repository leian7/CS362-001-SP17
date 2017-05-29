package edu.osu.cs362;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Random;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Random Test Generator for CalDay class.
 */
public class CalDayRandomTest {

	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 s */
	private static final int NUM_TESTS=100;

	/**
	 *  Generate random tests that test the CalDay class
	 */
	@Test
	public void randomCalDayTest() throws Throwable {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		System.out.println("Start testing...");

		for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			long randomseed = System.currentTimeMillis();
			//			System.out.println(" Seed:"+randomseed );
			Random random = new Random(randomseed);

			int gregCalYear = ValuesGenerator.getRandomIntBetween(
					random, 1000, 3000);
			int gregCalMonth = ValuesGenerator.getRandomIntBetween(
					random, -1, 13);
			int gregCalDay = ValuesGenerator.getRandomIntBetween(
					random, -1, 32);

			GregorianCalendar gregCal = new GregorianCalendar(
					gregCalYear,
					gregCalMonth,
					gregCalDay);

			CalDay special_cal = new CalDay(gregCal);

			for (int i = 0; i < NUM_TESTS; i++) {
				// generate random Appt to feed addAppt
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

				//Construct new Appointment object with the random data
				Appt appt = new Appt(
						startHour,
						startMinute,
						startDay,
						startMonth,
						startYear,
						title,
						description);

				special_cal.addAppt(appt);
			}
			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if ((iteration%10000)==0 && iteration!=0 )
				System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
		System.out.println("Done testing...");
	}
}
