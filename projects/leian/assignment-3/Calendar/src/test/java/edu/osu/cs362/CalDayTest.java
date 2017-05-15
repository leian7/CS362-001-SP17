package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	@Test
	public void test_add_appt() throws Throwable {
		// case: appt is valid
		// Existing appt starts later than the appt to add:
		Appt old_appt = new Appt(14, 30, 10, 04, 2017, "Old", "This appt already exists for this CalDay");
		// New appt to add:
		Appt new_appt = new Appt(13, 30, 10, 04, 2017, "New", "I want to add this appt to this CalDay");

		GregorianCalendar day = new GregorianCalendar(2017, 04, 10);
		CalDay good_cal = new CalDay(day);
		good_cal.getAppts().add(old_appt);		// place "existing" appt

		// Now add the new appt using addAppt...
		// If existing appt starts later than appt to add...!!
		good_cal.addAppt(new_appt);
		assertNotEquals(good_cal.getAppts(), null);
		assertEquals(good_cal.getAppts().get(0).getTitle(), "New");
	}

	@Test
	public void test_add_appt_order() throws Throwable {
		// case: appt is valid
		// Existing appt does not start later than the appt to add
		Appt new_appt = new Appt(14, 30, 10, 04, 2017, "New", "Want to add this new appt to this CalDay");
		Appt old_appt = new Appt(13, 30, 10, 04, 2017, "Old", "This appt is already in the appt masterlist");

		GregorianCalendar day = new GregorianCalendar(2017, 04, 10);
		CalDay good_cal = new CalDay(day);
		good_cal.getAppts().add(old_appt);		// place "existing" appt

		// Now add the new appt using addAppt...
		// If existing appt starts later than appt to add...!!
		good_cal.addAppt(new_appt);
		assertNotEquals(good_cal.getAppts(), null);
		assertEquals(good_cal.getAppts().get(1).getTitle(), "New");
	}

	@Test
	public void test_add_appt_same_hour() throws Throwable {
		// case: appt is valid
		// Existing appt starts during same hour as the appt to add:
		Appt new_appt = new Appt(14, 30, 10, 04, 2017, "New", "Want to add this new appt to this CalDay");
		Appt old_appt = new Appt(14, 30, 10, 04, 2017, "Old", "This appt is already in the appt masterlist");
		GregorianCalendar day = new GregorianCalendar(2017, 04, 10);
		CalDay good_cal = new CalDay(day);
		good_cal.getAppts().add(old_appt);		// place "existing" appt

		// Now add the new appt using addAppt...
		// If existing appt starts same time as appt to add...!!
		good_cal.addAppt(new_appt);
		assertNotEquals(good_cal.getAppts(), null);
		assertEquals(good_cal.getAppts().get(1).getTitle(), "New");
	}

	@Test
	public void test_add_invalid_appt() throws Throwable {
		// case: appt is invalid
		GregorianCalendar day2 = new GregorianCalendar(2017, 04, 11);
		CalDay bad_cal = new CalDay(day2);
		Appt bad_appt = new Appt(-1, 30, 10, 04, 2017, "Bad", "This appt is invalid");
		bad_cal.addAppt(bad_appt);
		assertFalse(bad_cal.getAppts().contains(bad_appt));
	}

	@Test
	public void test_good_CalDay() throws Throwable {
		/* Tests that the standard constructor produces valid CalDay objets
		 * when given valid arguments. */
		GregorianCalendar good_day = new GregorianCalendar(2017, 04, 11);
		CalDay good_cal = new CalDay(good_day);
		assertEquals(good_cal.getDay(), 11);
		assertEquals(good_cal.getMonth(), 04);
		assertEquals(good_cal.getYear(), 2017);
	}

	@Test
	public void test_iterator() throws Throwable {
		// case: the given CalDay is valid
		GregorianCalendar day2 = new GregorianCalendar(2017, 04, 11);
		CalDay good_cal = new CalDay(day2);
		assertEquals((good_cal.iterator().getClass()).toString(), "class java.util.LinkedList$ListItr");

		// case: the given CalDay is invalid
		CalDay bad_cal = new CalDay();
		assertEquals(bad_cal.iterator(), null);
	}

	@Test
	public void test_to_string()  throws Throwable  {
		// case: the CalDay is invalid
		CalDay bad_cal = new CalDay();	// default: invalid
		assertEquals(bad_cal.toString(), "");

		// case: the CalDay is valid
		GregorianCalendar day = new GregorianCalendar(2017, 04, 10);
		CalDay good_cal = new CalDay(day);
		Appt appt = new Appt(13, 30, 10, 04, 2017, "Dentist", "Regular cleaning");
		good_cal.getAppts().add(appt);
		assertTrue(good_cal.isValid());
		assertNotEquals(good_cal.toString(), "");
	}
}
