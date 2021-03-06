package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {
	LinkedList<Appt> listAppts = new LinkedList<Appt>();
	Appt dentist = new Appt(13, 30, 10, 04, 2017, "Dentist",
			"Regular cleaning");
	Appt hair = new Appt(13, 30, 11, 04, 2017, "Hair cut",
			"Trim at Great Clips");
	Appt doctor = new Appt(13, 30, 12, 04, 2017, "Doctor",
			"Complain about foot");
	TimeTable table = new TimeTable();

	@Test
	public void test_default_constructor()  throws Throwable  {
		TimeTable table = new TimeTable();
		assertNotEquals(table, null);
	}

	@Test
	public void test_getApptRange() throws Throwable {
		// Create greg first day and last day
		// pass all ^^^ to getApptRange
		listAppts.add(dentist);
		listAppts.add(hair);
		listAppts.add(doctor);

		GregorianCalendar day1 = new GregorianCalendar(2017, 04, 10);
		GregorianCalendar day2 = new GregorianCalendar(2017, 04, 12);

		LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		calDays = table.getApptRange(listAppts, day1, day2);
		assertNotEquals(calDays, null);
	}

	@Test
	public void test_del_appts() throws Throwable {
		// case: both appts and appt are null
		LinkedList<Appt> appts = new LinkedList<Appt>(); // null
		LinkedList<Appt> updated = table.deleteAppt(appts, null);
		assertEquals(updated, null);

		// case: appts is not null but appt to del is null
		listAppts.add(dentist);
		listAppts.add(doctor);
		updated = table.deleteAppt(listAppts, null);
		assertEquals(updated, null);
		
		// case: appts is null but appt to del is not null
		updated = table.deleteAppt(appts, doctor);
		assertEquals(updated, null);

		// case: neither appts nor appt is null, but appt is not valid
		Appt bad_appt = new Appt(-1, 30, 11, 04, 2017, "invalid appt",
								 "this is invalid appt");
		updated = table.deleteAppt(listAppts, bad_appt);
		assertEquals(updated, null);

		// case: good appts and good appt. Remove appt from appts:
		updated = table.deleteAppt(listAppts, doctor);
		assertNotEquals(updated, null);
	}
}
