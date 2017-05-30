package edu.osu.cs362;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Random;
import java.util.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Random Test Generator  for TimeTable class.
 */
public class TimeTableRandomTest {

	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 s */
	private static final int NUM_TESTS=100;

	/**
	 * Generate Random Tests that tests TimeTable Class.
	 */
	@Test
	public void randomTimeTableTest()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		System.out.println("Start testing TimeTable...");

		for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			long randomseed = System.currentTimeMillis();
			//			System.out.println(" Seed:"+randomseed );
			Random random = new Random(randomseed);

			TimeTable table = new TimeTable();

			for (int i = 0; i < NUM_TESTS; i++) {
				// for each test, generate random masterlist of appts and
				// generate random appt to delete
				LinkedList<Appt> appts = new LinkedList<Appt>();

				// flip coin to decide whether appts masterlist is null
				boolean coinToss = ValuesGenerator.getBoolean(.5f, random);

				if (coinToss) {
					// randomly decide length of masterlist
					int num_appts = ValuesGenerator.getRandomIntBetween(
							random, 0, 10);
	
					// for each slot in masterlist, generate a random appt
					for (int n = 0; n < num_appts; n++) {
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
						String title;

						// coin toss: decide if appt to delete is in masterlist
						boolean apptIn = ValuesGenerator.getBoolean(
								.5f, random);

						if (apptIn) {
							title = "Delete me!";
						}
						else {
							title = ValuesGenerator.getString(random);
						}
						String description = ValuesGenerator.getString(random);
	
						// Construct new Appt object with the random data
						Appt appt_in_appts = new Appt(
							startHour,
							startMinute,
							startDay,
							startMonth,
							startYear,
							title,
							description);
	
						// add the new random appt to the appts list
						appts.add(appt_in_appts);
					}
				}
				else {
					appts = null;
				}
				
				// flip the coin again to decide if appt to delete is null
				coinToss = ValuesGenerator.getBoolean(.5f, random);

				if (coinToss) {
					// if apptIn created a "Delete me!" appt, delete that one
					int idx = -1;
					Appt appt_exists = null;
					if (appts != null) {
						for (int x = 0; x < appts.size(); x++) {
							if (appts.get(x).getTitle().equals("Delete me!")) {
								idx = x;
							}
						}
						if (idx != -1) {
							appt_exists = appts.get(idx);
						}
					}

					// Otherwise, generate a random appt to delete
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
	
					// Construct new Appointment object with the random data
					Appt random_appt = new Appt(
						startHour,
						startMinute,
						startDay,
						startMonth,
						startYear,
						title,
						description);
	
					// call deleteAppt with masterlist appts and appt to delete
					if (idx == -1) {
						table.deleteAppt(appts, random_appt);
					}
					else {
						table.deleteAppt(appts, appt_exists);
					}
				}
				else {
					table.deleteAppt(appts, null);
				}
			}
			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if ((iteration%10000)==0 && iteration!=0 )
				System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
		}
		System.out.println("Done testing TimeTable...");
	}
}
