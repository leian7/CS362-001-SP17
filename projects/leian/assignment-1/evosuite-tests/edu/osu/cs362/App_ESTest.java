/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 16 02:45:15 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.App;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class App_ESTest extends App_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 7 covered goals:
   * Goal 1. edu.osu.cs362.App.main([Ljava/lang/String;)V: root-Branch
   * Goal 2. Branch edu.osu.cs362.App.main([Ljava/lang/String;)V: root-Branch in context: edu.osu.cs362.App:main([Ljava/lang/String;)V
   * Goal 3. edu.osu.cs362.App.main([Ljava/lang/String;)V: Line 11
   * Goal 4. edu.osu.cs362.App.main([Ljava/lang/String;)V: Line 12
   * Goal 5. [METHOD] edu.osu.cs362.App.main([Ljava/lang/String;)V
   * Goal 6. [METHODNOEX] edu.osu.cs362.App.main([Ljava/lang/String;)V
   * Goal 7. Weak Mutation 0: edu.osu.cs362.App.main([Ljava/lang/String;)V:11 - ReplaceConstant - Hello World! -> 
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[5];
      App.main(stringArray0);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. edu.osu.cs362.App.<init>()V: root-Branch
   * Goal 2. Branch edu.osu.cs362.App.<init>()V: root-Branch in context: edu.osu.cs362.App:<init>()V
   * Goal 3. [METHOD] edu.osu.cs362.App.<init>()V
   * Goal 4. [METHODNOEX] edu.osu.cs362.App.<init>()V
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      App app0 = new App();
  }
}