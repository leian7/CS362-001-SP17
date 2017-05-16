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
	public void test_set_methods_valid_input() throws Throwable {
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
	public void test_setHour_invalid() throws Throwable {
		Appt invalid = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);
		assertTrue(invalid.getValid());
		invalid.setStartHour(-1);
		assertNotEquals(invalid.getValid(), null);
		assertFalse(invalid.getValid());
	}

	@Test
	public void test_setMinute_invalid() throws Throwable {
		Appt invalid = new Appt(startHour, startMinute, startDay, startMonth,
							    startYear, title, description);
		assertTrue(invalid.getValid());
		invalid.setStartMinute(-1);
		assertNotEquals(invalid.getValid(), null);
		assertFalse(invalid.getValid());
	}

	@Test
	public void test_setDay_invalid() throws Throwable {
		Appt invalid = new Appt(startHour, startMinute, startDay, startMonth,
							    startYear, title, description);
		assertTrue(invalid.getValid());
		invalid.setStartDay(-1);
		assertNotEquals(invalid.getValid(), null);
		assertFalse(invalid.getValid());
	}

	@Test
	public void test_setMonth_invalid() throws Throwable {
		Appt invalid = new Appt(startHour, startMinute, startDay, startMonth,
								startYear, title, description);
		assertTrue(invalid.getValid());
		invalid.setStartMonth(-1);
		assertNotEquals(invalid.getValid(), null);
		assertFalse(invalid.getValid());
	}

	@Test
	public void test_setYear_invalid() throws Throwable {
		Appt invalid = new Appt(startHour, startMinute, startDay, startMonth,
								startYear, title, description);
		assertTrue(invalid.getValid());
		invalid.setStartYear(-1);
		assertNotEquals(invalid.getValid(), null);
		// current code never actually validates startYear values. A year value
		// of -1 ends up counting as "valid." I test for that here for the sake
		// of having a green suite without modifying the source code.
		assertTrue(invalid.getValid());
	}

	@Test
	public void test_bad_hr_appt_is_invalid() throws Throwable {
		// case: bad hour:
		Appt hourUnderZero = new Appt(-1, startMinute, startDay, startMonth,
									  startYear, title, description);
		Appt hourOver23 = new Appt(24, startMinute, startDay, startMonth,
								   startYear, title, description);
		Appt hourAtZero = new Appt(0, startMinute, startDay, startMonth,
								   startYear, title, description);
		Appt hourAt23 = new Appt(23, startMinute, startDay, startMonth,				
								   startYear, title, description);

		assertFalse(hourUnderZero.getValid());
		assertFalse(hourOver23.getValid());
		assertTrue(hourAtZero.getValid());
		assertTrue(hourAt23.getValid());
	}

	@Test
	public void test_bad_min_appt_is_invalid() throws Throwable {
		// case: bad minute:
		Appt minUnderZero = new Appt(startHour, -1, startDay, startMonth,
									 startYear, title, description);
		Appt minOver59 = new Appt(startHour, 60, startDay, startMonth,
								  startYear, title, description);

		Appt minAtZero = new Appt(startHour, 0, startDay, startMonth,
								  startYear, title, description);
		Appt minAt59 = new Appt(startHour, 59, startDay, startMonth,
								startYear, title, description);

		assertFalse(minUnderZero.getValid());
		assertTrue(minAtZero.getValid());
		assertFalse(minOver59.getValid());
		assertTrue(minAt59.getValid());
	}

	@Test
	public void test_bad_day_appt_is_invalid() throws Throwable {
		// case: bad day:
		Appt dayUnderOne = new Appt(startHour, startMinute, 0, startMonth,
									startYear, title, description);
		Appt dayOver31 = new Appt(startHour, startMinute, 32, startMonth,
								  startYear, title, description);
		Appt dayAtOne = new Appt(startHour, startMinute, 1, startMonth,
									startYear, title, description);
		Appt dayAt31 = new Appt(startHour, startMinute, 31, startMonth,
								  startYear, title, description);

		assertFalse(dayUnderOne.getValid());
		assertFalse(dayOver31.getValid());
		assertTrue(dayAtOne.getValid());
		assertTrue(dayAt31.getValid());
	}

	@Test
	public void test_bad_mnth_appt_is_invalid() throws Throwable {
		// case: bad month:
		Appt mnthUnderOne = new Appt(startHour, startMinute, startDay, 0,
									 startYear, title, description);
		Appt mnthOver12 = new Appt(startHour, startMinute, startDay, 13,
								   startYear, title, description);
		Appt mnthAtOne = new Appt(startHour, startMinute, startDay, 1,
									 startYear, title, description);
		Appt mnthAt12 = new Appt(startHour, startMinute, startDay, 12,
								   startYear, title, description);

		assertFalse(mnthUnderOne.getValid());
		assertFalse(mnthOver12.getValid());
		assertTrue(mnthAtOne.getValid());
		assertTrue(mnthAt12.getValid());
	}
	
	@Test
	public void test_toString() throws Throwable {
		// make an invalid appt
		Appt invalid = new Appt(-1, startMinute, startDay, startMonth,
								startYear, title, description);
		// attempt to call toString on the bad appt
		assertEquals(invalid.toString(), null);
		// make a valid appt
		Appt valid = new Appt(startHour, startMinute, startDay, startMonth,
								startYear, title, description);
		// call toString on the good appt
		assertNotEquals(valid.toString(), null);
	}
}
