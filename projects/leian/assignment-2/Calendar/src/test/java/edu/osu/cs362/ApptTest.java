package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {

	int startHour=13;
	int startMinute=30;
	int startDay=10;
	int startMonth=4;
	int startYear=2017;
	String title="Birthday Party";
	String description="This is my birthday party.";
	//Construct a new Appointment object with the initial data	 
	Appt appt = new Appt(startHour,
			startMinute ,
			startDay ,
			startMonth ,
			startYear ,
			title,
			description);
	
	/**
	 * Test that the gets methods work as expected.
	 */
	@Test
	public void test01()  throws Throwable  {
		// assertions
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());         		
	}

	@Test
	public void test_set_methods() throws Throwable {
		appt.setStartHour(12);
		appt.setStartMinute(29);
		appt.setStartDay(9);
		appt.setStartMonth(03);
		appt.setStartYear(2016);
		appt.setTitle("Big Lunch");
		appt.setDescription("This is my Big Lunch.");

		assertTrue(appt.getValid());
		assertEquals(12, appt.getStartHour());
		assertEquals(29, appt.getStartMinute());
		assertEquals(9, appt.getStartDay());
		assertEquals(03, appt.getStartMonth());
		assertEquals(2016, appt.getStartYear());
		assertEquals("Big Lunch", appt.getTitle());
		assertEquals("This is my Big Lunch.", appt.getDescription());

		appt.setTitle(null);
		appt.setDescription(null);

		assertEquals("", appt.getTitle());
		assertEquals("", appt.getDescription());
	}

	@Test
	public void test_appt_is_invalid() throws Throwable {
		// case: bad hour:
		Appt hourUnderZero = new Appt(-1, startMinute, startDay, startMonth,
									  startYear, title, description);
		assertFalse(hourUnderZero.getValid());

		Appt hourOver23 = new Appt(24, startMinute, startDay, startMonth,
								   startYear, title, description);
		assertFalse(hourOver23.getValid());

		// case: bad minute:
		Appt minUnderZero = new Appt(startHour, -1, startDay, startMonth,
									 startYear, title, description);
		assertFalse(minUnderZero.getValid());

		Appt minOver59 = new Appt(startHour, 60, startDay, startMonth,
								  startYear, title, description);
		assertFalse(minOver59.getValid());

		// case: bad day:
		Appt dayUnderOne = new Appt(startHour, startMinute, 0, startMonth,
									startYear, title, description);
		assertFalse(dayUnderOne.getValid());
		Appt dayOver31 = new Appt(startHour, startMinute, 32, startMonth,
								  startYear, title, description);
		assertFalse(dayOver31.getValid());

		// case: bad month:
		Appt mnthUnderOne = new Appt(startHour, startMinute, startDay, 0,
									 startYear, title, description);
		assertFalse(mnthUnderOne.getValid());
		Appt mnthOver12 = new Appt(startHour, startMinute, startDay, 13,
								   startYear, title, description);
		assertFalse(mnthOver12.getValid());
	}
}
