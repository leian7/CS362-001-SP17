/*
 * This file was automatically generated by EvoSuite
 * Sun May 14 22:38:14 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.osu.cs362.CalendarMain;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CalendarMain_ESTest extends CalendarMain_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 212 covered goals:
   * Goal 1. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I91 Branch 1 IFEQ L56 - false
   * Goal 2. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I148 Branch 2 IFEQ L79 - false
   * Goal 3. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I205 Branch 3 IFEQ L100 - false
   * Goal 4. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I259 Branch 4 IFEQ L110 - false
   * Goal 5. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I340 Branch 5 IF_ICMPGE L119 - true
   * Goal 6. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I340 Branch 5 IF_ICMPGE L119 - false
   * Goal 7. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I357 Branch 6 IFEQ L123 - false
   * Goal 8. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I380 Branch 7 IFEQ L127 - false
   * Goal 9. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I389 Branch 8 IFNULL L130 - false
   * Goal 10. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I412 Branch 9 IF_ICMPGE L134 - true
   * Goal 11. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I412 Branch 9 IF_ICMPGE L134 - false
   * Goal 12. Branch edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I91 Branch 1 IFEQ L56 - false in context: edu.osu.cs362.CalendarMain:main([Ljava/lang/String;)V
   * Goal 13. Branch edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I148 Branch 2 IFEQ L79 - false in context: edu.osu.cs362.CalendarMain:main([Ljava/lang/String;)V
   * Goal 14. Branch edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I205 Branch 3 IFEQ L100 - false in context: edu.osu.cs362.CalendarMain:main([Ljava/lang/String;)V
   * Goal 15. Branch edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I259 Branch 4 IFEQ L110 - false in context: edu.osu.cs362.CalendarMain:main([Ljava/lang/String;)V
   * Goal 16. Branch edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I340 Branch 5 IF_ICMPGE L119 - false in context: edu.osu.cs362.CalendarMain:main([Ljava/lang/String;)V
   * Goal 17. Branch edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I340 Branch 5 IF_ICMPGE L119 - true in context: edu.osu.cs362.CalendarMain:main([Ljava/lang/String;)V
   * Goal 18. Branch edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I357 Branch 6 IFEQ L123 - false in context: edu.osu.cs362.CalendarMain:main([Ljava/lang/String;)V
   * Goal 19. Branch edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I380 Branch 7 IFEQ L127 - false in context: edu.osu.cs362.CalendarMain:main([Ljava/lang/String;)V
   * Goal 20. Branch edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I389 Branch 8 IFNULL L130 - false in context: edu.osu.cs362.CalendarMain:main([Ljava/lang/String;)V
   * Goal 21. Branch edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I412 Branch 9 IF_ICMPGE L134 - false in context: edu.osu.cs362.CalendarMain:main([Ljava/lang/String;)V
   * Goal 22. Branch edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: I412 Branch 9 IF_ICMPGE L134 - true in context: edu.osu.cs362.CalendarMain:main([Ljava/lang/String;)V
   * Goal 23. main([Ljava/lang/String;)V_org.evosuite.runtime.System$SystemExitException_IMPLICIT
   * Goal 24. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 16
   * Goal 25. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 19
   * Goal 26. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 20
   * Goal 27. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 33
   * Goal 28. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 35
   * Goal 29. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 36
   * Goal 30. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 37
   * Goal 31. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 40
   * Goal 32. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 41
   * Goal 33. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 42
   * Goal 34. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 43
   * Goal 35. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 44
   * Goal 36. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 45
   * Goal 37. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 46
   * Goal 38. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 48
   * Goal 39. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 56
   * Goal 40. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 57
   * Goal 41. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 60
   * Goal 42. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 63
   * Goal 43. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 64
   * Goal 44. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 65
   * Goal 45. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 66
   * Goal 46. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 67
   * Goal 47. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 68
   * Goal 48. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 69
   * Goal 49. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 71
   * Goal 50. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 79
   * Goal 51. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 80
   * Goal 52. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 82
   * Goal 53. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 84
   * Goal 54. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 85
   * Goal 55. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 86
   * Goal 56. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 87
   * Goal 57. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 88
   * Goal 58. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 89
   * Goal 59. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 90
   * Goal 60. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 92
   * Goal 61. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 100
   * Goal 62. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 101
   * Goal 63. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 103
   * Goal 64. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 107
   * Goal 65. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 108
   * Goal 66. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 109
   * Goal 67. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 110
   * Goal 68. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 111
   * Goal 69. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 112
   * Goal 70. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 115
   * Goal 71. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 117
   * Goal 72. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 118
   * Goal 73. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 119
   * Goal 74. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 120
   * Goal 75. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 123
   * Goal 76. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 124
   * Goal 77. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 126
   * Goal 78. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 127
   * Goal 79. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 128
   * Goal 80. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 130
   * Goal 81. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 132
   * Goal 82. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 133
   * Goal 83. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 134
   * Goal 84. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 135
   * Goal 85. edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V: Line 137
   * Goal 86. [METHOD] edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V
   * Goal 87. Weak Mutation 0: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:16 - ReplaceConstant - 1 -> 0
   * Goal 88. Weak Mutation 1: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:20 - ReplaceConstant - Calendar Main: 
 -> 
   * Goal 89. Weak Mutation 2: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:33 - ReplaceComparisonOperator == -> !=
   * Goal 90. Weak Mutation 3: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:35 - ReplaceConstant - 2 -> 0
   * Goal 91. Weak Mutation 4: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:35 - ReplaceConstant - 2 -> 1
   * Goal 92. Weak Mutation 5: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:35 - ReplaceConstant - 2 -> -1
   * Goal 93. Weak Mutation 6: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:35 - ReplaceConstant - 2 -> 3
   * Goal 94. Weak Mutation 7: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:35 - ReplaceConstant - 1 -> 0
   * Goal 95. Weak Mutation 8: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:35 - ReplaceArithmeticOperator + -> %
   * Goal 96. Weak Mutation 9: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:35 - ReplaceArithmeticOperator + -> -
   * Goal 97. Weak Mutation 10: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:35 - ReplaceArithmeticOperator + -> *
   * Goal 98. Weak Mutation 11: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:35 - ReplaceArithmeticOperator + -> /
   * Goal 99. Weak Mutation 12: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:36 - ReplaceConstant - 1 -> 0
   * Goal 100. Weak Mutation 13: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:37 - ReplaceConstant - 5 -> 0
   * Goal 101. Weak Mutation 14: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:37 - ReplaceConstant - 5 -> 1
   * Goal 102. Weak Mutation 15: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:37 - ReplaceConstant - 5 -> -1
   * Goal 103. Weak Mutation 16: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:37 - ReplaceConstant - 5 -> 4
   * Goal 104. Weak Mutation 17: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:37 - ReplaceConstant - 5 -> 6
   * Goal 105. Weak Mutation 18: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:40 - ReplaceConstant - 15 -> 0
   * Goal 106. Weak Mutation 19: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:40 - ReplaceConstant - 15 -> 1
   * Goal 107. Weak Mutation 20: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:40 - ReplaceConstant - 15 -> -1
   * Goal 108. Weak Mutation 21: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:40 - ReplaceConstant - 15 -> 14
   * Goal 109. Weak Mutation 22: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:40 - ReplaceConstant - 15 -> 16
   * Goal 110. Weak Mutation 23: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:41 - ReplaceConstant - 30 -> 0
   * Goal 111. Weak Mutation 24: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:41 - ReplaceConstant - 30 -> 1
   * Goal 112. Weak Mutation 25: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:41 - ReplaceConstant - 30 -> -1
   * Goal 113. Weak Mutation 26: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:41 - ReplaceConstant - 30 -> 29
   * Goal 114. Weak Mutation 27: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:41 - ReplaceConstant - 30 -> 31
   * Goal 115. Weak Mutation 28: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:42 - ReplaceVariable thisDay -> thisYear
   * Goal 116. Weak Mutation 29: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:42 - ReplaceVariable thisDay -> thisMonth
   * Goal 117. Weak Mutation 30: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:42 - ReplaceVariable thisDay -> startMinute
   * Goal 118. Weak Mutation 31: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:42 - ReplaceVariable thisDay -> startHour
   * Goal 119. Weak Mutation 32: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:42 - InsertUnaryOp Negation of thisDay
   * Goal 120. Weak Mutation 33: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:42 - InsertUnaryOp IINC 1 thisDay
   * Goal 121. Weak Mutation 34: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:42 - InsertUnaryOp IINC -1 thisDay
   * Goal 122. Weak Mutation 35: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:43 - ReplaceVariable thisMonth -> thisYear
   * Goal 123. Weak Mutation 36: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:43 - ReplaceVariable thisMonth -> thisDay
   * Goal 124. Weak Mutation 37: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:43 - ReplaceVariable thisMonth -> startMinute
   * Goal 125. Weak Mutation 38: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:43 - ReplaceVariable thisMonth -> startHour
   * Goal 126. Weak Mutation 39: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:43 - ReplaceVariable thisMonth -> startDay
   * Goal 127. Weak Mutation 40: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:43 - InsertUnaryOp Negation of thisMonth
   * Goal 128. Weak Mutation 41: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:43 - InsertUnaryOp IINC 1 thisMonth
   * Goal 129. Weak Mutation 42: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:43 - InsertUnaryOp IINC -1 thisMonth
   * Goal 130. Weak Mutation 43: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:44 - ReplaceVariable thisYear -> startMonth
   * Goal 131. Weak Mutation 44: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:44 - ReplaceVariable thisYear -> startHour
   * Goal 132. Weak Mutation 45: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:44 - ReplaceVariable thisYear -> startDay
   * Goal 133. Weak Mutation 46: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:44 - ReplaceVariable thisYear -> thisDay
   * Goal 134. Weak Mutation 47: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:44 - ReplaceVariable thisYear -> thisMonth
   * Goal 135. Weak Mutation 48: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:44 - ReplaceVariable thisYear -> startMinute
   * Goal 136. Weak Mutation 49: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:44 - InsertUnaryOp Negation of thisYear
   * Goal 137. Weak Mutation 50: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:44 - InsertUnaryOp IINC 1 thisYear
   * Goal 138. Weak Mutation 51: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:44 - InsertUnaryOp IINC -1 thisYear
   * Goal 139. Weak Mutation 52: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:45 - ReplaceConstant - Birthday Party -> 
   * Goal 140. Weak Mutation 53: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:46 - ReplaceConstant - This is my birthday party. -> 
   * Goal 141. Weak Mutation 54: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startHour -> thisYear
   * Goal 142. Weak Mutation 55: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startHour -> startMonth
   * Goal 143. Weak Mutation 56: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startHour -> startDay
   * Goal 144. Weak Mutation 57: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startHour -> startYear
   * Goal 145. Weak Mutation 58: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startHour -> thisDay
   * Goal 146. Weak Mutation 59: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startHour -> thisMonth
   * Goal 147. Weak Mutation 60: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startHour -> startMinute
   * Goal 148. Weak Mutation 61: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp Negation of startHour
   * Goal 149. Weak Mutation 62: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp IINC 1 startHour
   * Goal 150. Weak Mutation 63: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp IINC -1 startHour
   * Goal 151. Weak Mutation 64: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMinute -> thisYear
   * Goal 152. Weak Mutation 65: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMinute -> startMonth
   * Goal 153. Weak Mutation 66: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMinute -> startHour
   * Goal 154. Weak Mutation 67: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMinute -> startDay
   * Goal 155. Weak Mutation 68: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMinute -> startYear
   * Goal 156. Weak Mutation 69: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMinute -> thisDay
   * Goal 157. Weak Mutation 70: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMinute -> thisMonth
   * Goal 158. Weak Mutation 71: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp Negation of startMinute
   * Goal 159. Weak Mutation 72: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp IINC 1 startMinute
   * Goal 160. Weak Mutation 73: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp IINC -1 startMinute
   * Goal 161. Weak Mutation 74: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startDay -> thisYear
   * Goal 162. Weak Mutation 75: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startDay -> startMonth
   * Goal 163. Weak Mutation 76: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startDay -> startHour
   * Goal 164. Weak Mutation 77: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startDay -> startYear
   * Goal 165. Weak Mutation 79: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startDay -> thisMonth
   * Goal 166. Weak Mutation 80: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startDay -> startMinute
   * Goal 167. Weak Mutation 81: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp Negation of startDay
   * Goal 168. Weak Mutation 82: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp IINC 1 startDay
   * Goal 169. Weak Mutation 83: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp IINC -1 startDay
   * Goal 170. Weak Mutation 84: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMonth -> thisYear
   * Goal 171. Weak Mutation 85: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMonth -> startHour
   * Goal 172. Weak Mutation 86: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMonth -> startDay
   * Goal 173. Weak Mutation 87: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMonth -> startYear
   * Goal 174. Weak Mutation 88: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMonth -> thisDay
   * Goal 175. Weak Mutation 90: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startMonth -> startMinute
   * Goal 176. Weak Mutation 91: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp Negation of startMonth
   * Goal 177. Weak Mutation 92: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp IINC 1 startMonth
   * Goal 178. Weak Mutation 93: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp IINC -1 startMonth
   * Goal 179. Weak Mutation 95: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startYear -> startMonth
   * Goal 180. Weak Mutation 96: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startYear -> startHour
   * Goal 181. Weak Mutation 97: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startYear -> startDay
   * Goal 182. Weak Mutation 98: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startYear -> thisDay
   * Goal 183. Weak Mutation 99: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startYear -> thisMonth
   * Goal 184. Weak Mutation 100: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable startYear -> startMinute
   * Goal 185. Weak Mutation 101: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp Negation of startYear
   * Goal 186. Weak Mutation 102: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp IINC 1 startYear
   * Goal 187. Weak Mutation 103: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - InsertUnaryOp IINC -1 startYear
   * Goal 188. Weak Mutation 104: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable title -> description
   * Goal 189. Weak Mutation 105: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:48 - ReplaceVariable description -> title
   * Goal 190. Weak Mutation 106: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:56 - InsertUnaryOp Negation of diagnose
   * Goal 191. Weak Mutation 107: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:56 - InsertUnaryOp IINC 1 diagnose
   * Goal 192. Weak Mutation 108: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:56 - InsertUnaryOp IINC -1 diagnose
   * Goal 193. Weak Mutation 109: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:56 - ReplaceComparisonOperator == -> !=
   * Goal 194. Weak Mutation 110: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:63 - ReplaceConstant - 14 -> 0
   * Goal 195. Weak Mutation 111: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:63 - ReplaceConstant - 14 -> 1
   * Goal 196. Weak Mutation 112: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:63 - ReplaceConstant - 14 -> -1
   * Goal 197. Weak Mutation 113: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:63 - ReplaceConstant - 14 -> 13
   * Goal 198. Weak Mutation 114: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:63 - ReplaceConstant - 14 -> 15
   * Goal 199. Weak Mutation 115: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:64 - ReplaceConstant - 30 -> 0
   * Goal 200. Weak Mutation 116: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:64 - ReplaceConstant - 30 -> 1
   * Goal 201. Weak Mutation 117: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:64 - ReplaceConstant - 30 -> -1
   * Goal 202. Weak Mutation 118: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:64 - ReplaceConstant - 30 -> 29
   * Goal 203. Weak Mutation 119: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:64 - ReplaceConstant - 30 -> 31
   * Goal 204. Weak Mutation 120: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:65 - ReplaceVariable thisDay -> thisYear
   * Goal 205. Weak Mutation 121: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:65 - ReplaceVariable thisDay -> startMonth
   * Goal 206. Weak Mutation 122: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:65 - ReplaceVariable thisDay -> startHour
   * Goal 207. Weak Mutation 124: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:65 - ReplaceVariable thisDay -> startYear
   * Goal 208. Weak Mutation 125: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:65 - ReplaceVariable thisDay -> thisMonth
   * Goal 209. Weak Mutation 126: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:65 - ReplaceVariable thisDay -> startMinute
   * Goal 210. Weak Mutation 127: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:65 - InsertUnaryOp Negation of thisDay
   * Goal 211. Weak Mutation 128: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:65 - InsertUnaryOp IINC 1 thisDay
   * Goal 212. Weak Mutation 129: edu.osu.cs362.CalendarMain.main([Ljava/lang/String;)V:65 - InsertUnaryOp IINC -1 thisDay
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      System.setCurrentTimeMillis((-1L));
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        CalendarMain.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. edu.osu.cs362.CalendarMain.<init>()V: root-Branch
   * Goal 2. Branch edu.osu.cs362.CalendarMain.<init>()V: root-Branch in context: edu.osu.cs362.CalendarMain:<init>()V
   * Goal 3. [METHOD] edu.osu.cs362.CalendarMain.<init>()V
   * Goal 4. [METHODNOEX] edu.osu.cs362.CalendarMain.<init>()V
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CalendarMain calendarMain0 = new CalendarMain();
  }
}
