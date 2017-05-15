/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 09:38:53 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Appt_ESTest extends Appt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 12, 12, "a0t}*6Fp_'vE", "");
      assertEquals(0, appt0.getStartDay());
      
      appt0.setStartDay(12);
      assertEquals(12, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(23, 23, 23, 0, 0, "YH", (String) null);
      assertEquals(23, appt0.getStartMinute());
      assertEquals("YH", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(23, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMonth());
      assertEquals("", appt0.getDescription());
      assertEquals(23, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(1, 11, 11, 2753, 1, "\n", "\n");
      assertEquals(2753, appt0.getStartMonth());
      
      appt0.setStartMonth(11);
      boolean boolean0 = appt0.getValid();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 12, 12, "a0t}*6Fp_'vE", "");
      int int0 = appt0.getStartYear();
      assertEquals(12, int0);
      assertEquals("a0t}*6Fp_'vE", appt0.getTitle());
      assertEquals("", appt0.getDescription());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartHour());
      assertEquals(12, appt0.getStartMonth());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt(0, (-1), 133, (-3751), (-3751), (String) null, "");
      int int0 = appt0.getStartYear();
      assertEquals(-1, appt0.getStartMinute());
      assertEquals(0, appt0.getStartHour());
      assertEquals((-3751), int0);
      assertEquals(133, appt0.getStartDay());
      assertEquals(-3751, appt0.getStartMonth());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "", "");
      int int0 = appt0.getStartMonth();
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, int0);
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt((-727), (-4425), 971, 971, (-884), "c_gw>==VEcD>y{v;R", "c_gw>==VEcD>y{v;R");
      appt0.setStartMonth((-1));
      int int0 = appt0.getStartMonth();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-515), (-515), (-515), "l<w9:x24S", "");
      appt0.setStartMinute(59);
      int int0 = appt0.getStartMinute();
      assertEquals(59, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt((-192), (-192), (-192), (-192), (-192), "", "");
      int int0 = appt0.getStartMinute();
      assertEquals(-192, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(-192, appt0.getStartYear());
      assertEquals(-192, appt0.getStartDay());
      assertEquals((-192), int0);
      assertEquals(-192, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt((-88), (-88), 0, (-88), 0, "2~>#!nIx", (String) null);
      assertEquals(-88, appt0.getStartHour());
      
      appt0.setStartHour(0);
      int int0 = appt0.getStartHour();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(1312, 1312, 1312, 1312, 12, "Fz`DDf^U", "Fz`DDf^U");
      int int0 = appt0.getStartHour();
      assertEquals(1312, int0);
      assertEquals(12, appt0.getStartYear());
      assertEquals("Fz`DDf^U", appt0.getTitle());
      assertEquals("Fz`DDf^U", appt0.getDescription());
      assertEquals(1312, appt0.getStartDay());
      assertEquals(1312, appt0.getStartMinute());
      assertEquals(1312, appt0.getStartMonth());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt((-88), (-88), 0, (-88), 0, "2~>#!nIx", (String) null);
      int int0 = appt0.getStartDay();
      assertEquals(-88, appt0.getStartHour());
      assertEquals("2~>#!nIx", appt0.getTitle());
      assertEquals(-88, appt0.getStartMonth());
      assertEquals("", appt0.getDescription());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(-88, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(1312, 1312, 1312, 1312, 12, "Fz`DDf^U", "Fz`DDf^U");
      int int0 = appt0.getStartDay();
      assertEquals(1312, appt0.getStartMinute());
      assertEquals("Fz`DDf^U", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals("Fz`DDf^U", appt0.getTitle());
      assertEquals(12, appt0.getStartYear());
      assertEquals(1312, appt0.getStartHour());
      assertEquals(1312, int0);
      assertEquals(1312, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt((-727), (-4425), 971, 971, (-884), "c_gw>==VEcD>y{v;R", "c_gw>==VEcD>y{v;R");
      String string0 = appt0.getDescription();
      assertEquals(-727, appt0.getStartHour());
      assertEquals("c_gw>==VEcD>y{v;R", string0);
      assertEquals(-4425, appt0.getStartMinute());
      assertEquals("c_gw>==VEcD>y{v;R", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(971, appt0.getStartDay());
      assertEquals(971, appt0.getStartMonth());
      assertEquals(-884, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt((-1426), (-1426), (-1426), 1, 1, ")cqxFMBC\"n<tV", ")cqxFMBC\"n<tV");
      appt0.setDescription(")cqxFMBC\"n<tV");
      assertEquals(-1426, appt0.getStartDay());
      assertEquals(1, appt0.getStartMonth());
      assertEquals(1, appt0.getStartYear());
      assertEquals(-1426, appt0.getStartMinute());
      assertEquals(")cqxFMBC\"n<tV", appt0.getDescription());
      assertEquals(")cqxFMBC\"n<tV", appt0.getTitle());
      assertEquals(-1426, appt0.getStartHour());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "", "");
      appt0.setDescription((String) null);
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt((-2308), 0, (-2308), 0, 0, "", "\n");
      assertEquals("", appt0.getTitle());
      
      appt0.setTitle("");
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(-2308, appt0.getStartHour());
      assertEquals(-2308, appt0.getStartDay());
      assertEquals("\n", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt((-727), (-4425), 971, 971, (-884), "c_gw>==VEcD>y{v;R", "c_gw>==VEcD>y{v;R");
      assertEquals("c_gw>==VEcD>y{v;R", appt0.getTitle());
      
      appt0.setTitle((String) null);
      assertEquals(-4425, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, (-62), (-62), "&4N1", "&4N1");
      String string0 = appt0.getTitle();
      assertEquals(-62, appt0.getStartYear());
      assertEquals(1, appt0.getStartHour());
      assertEquals("&4N1", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(-62, appt0.getStartMonth());
      assertEquals(1, appt0.getStartDay());
      assertEquals(1, appt0.getStartMinute());
      assertEquals("&4N1", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt((-665), (-665), (-665), 0, 0, "Z-v? ynZ_hYSqe", "Z-v? ynZ_hYSqe");
      int int0 = appt0.getStartDay();
      assertEquals(0, appt0.getStartYear());
      assertEquals("Z-v? ynZ_hYSqe", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals((-665), int0);
      assertEquals("Z-v? ynZ_hYSqe", appt0.getDescription());
      assertEquals(-665, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(-665, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "", "");
      boolean boolean0 = appt0.getValid();
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(boolean0);
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt((-88), (-88), 0, (-88), 0, "2~>#!nIx", (String) null);
      int int0 = appt0.getStartHour();
      assertEquals((-88), int0);
      assertEquals(0, appt0.getStartYear());
      assertEquals("2~>#!nIx", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
      assertEquals(-88, appt0.getStartMonth());
      assertEquals(-88, appt0.getStartMinute());
      assertEquals("", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt((-88), (-88), 0, (-88), 0, "2~>#!nIx", (String) null);
      int int0 = appt0.getStartYear();
      assertEquals("", appt0.getDescription());
      assertEquals(0, appt0.getStartDay());
      assertEquals("2~>#!nIx", appt0.getTitle());
      assertEquals(-88, appt0.getStartHour());
      assertEquals(-88, appt0.getStartMonth());
      assertEquals(-88, appt0.getStartMinute());
      assertEquals(0, int0);
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt((-88), (-88), 0, (-88), 0, "2~>#!nIx", (String) null);
      String string0 = appt0.getDescription();
      assertEquals(-88, appt0.getStartMonth());
      assertEquals(-88, appt0.getStartMinute());
      assertNotNull(string0);
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartYear());
      assertEquals("", string0);
      assertEquals(0, appt0.getStartDay());
      assertEquals("2~>#!nIx", appt0.getTitle());
      assertEquals(-88, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt((-727), (-4425), 971, 971, (-884), "c_gw>==VEcD>y{v;R", "c_gw>==VEcD>y{v;R");
      int int0 = appt0.getStartMonth();
      assertEquals(971, appt0.getStartDay());
      assertEquals(-884, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(-4425, appt0.getStartMinute());
      assertEquals(-727, appt0.getStartHour());
      assertEquals("c_gw>==VEcD>y{v;R", appt0.getDescription());
      assertEquals(971, int0);
      assertEquals("c_gw>==VEcD>y{v;R", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 1, 1, 0, "", "");
      String string0 = appt0.toString();
      assertEquals("\t1/1/0 at 12:0am ,, \n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(20, 20, 6, 6, 20, ".{u'A%h*3Uaul{pPn", ".{u'A%h*3Uaul{pPn");
      String string0 = appt0.toString();
      assertEquals("\t6/6/20 at 8:20pm ,.{u'A%h*3Uaul{pPn, .{u'A%h*3Uaul{pPn\n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1, 1, (String) null, (String) null);
      appt0.getTitle();
      assertTrue(appt0.getValid());
      assertEquals(1, appt0.getStartDay());
      assertEquals(1, appt0.getStartMinute());
      assertEquals(1, appt0.getStartMonth());
      assertEquals(1, appt0.getStartHour());
      assertEquals(1, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 3593, 1, 59, "fV_h", "fV_h");
      assertEquals(59, appt0.getStartYear());
      assertEquals("fV_h", appt0.getDescription());
      assertEquals("fV_h", appt0.getTitle());
      assertEquals(1, appt0.getStartMinute());
      assertEquals(1, appt0.getStartHour());
      assertEquals(3593, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(1, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(0, 31, 31, 31, 2945, "", "d!U{Leu+9s7}");
      assertEquals(31, appt0.getStartMinute());
      
      appt0.setStartMinute(2945);
      assertEquals(31, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 23, "iIN7", "Z:ev-6ifI)nmR(*`:");
      String string0 = appt0.toString();
      assertEquals("\t11/11/23 at 11:11am ,iIN7, Z:ev-6ifI)nmR(*`:\n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(0, 31, 31, 31, 2945, "", "d!U{Leu+9s7}");
      assertEquals(2945, appt0.getStartYear());
      
      appt0.setStartYear(0);
      assertEquals("", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt(0, 31, 31, 31, 2945, "", "d!U{Leu+9s7}");
      String string0 = appt0.toString();
      assertEquals("d!U{Leu+9s7}", appt0.getDescription());
      assertEquals("", appt0.getTitle());
      assertEquals(0, appt0.getStartHour());
      assertNull(string0);
      assertEquals(2945, appt0.getStartYear());
      assertEquals(31, appt0.getStartMonth());
      assertEquals(31, appt0.getStartMinute());
      assertEquals(31, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-515), (-515), (-515), "l<w9:x24S", "");
      int int0 = appt0.getStartMinute();
      assertEquals("l<w9:x24S", appt0.getTitle());
      assertEquals(-515, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(-515, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, int0);
      assertEquals(-515, appt0.getStartDay());
      assertEquals("", appt0.getDescription());
  }
}