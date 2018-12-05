
/* Author: Jovanie Lawrence                          *
 * Student number: M00577156 						 *
 * Module: CSD3202 – Correctness in Computer Systems *
 * Coursework Project 1 							 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GradeTest {

	private Grade grade;

	private Grade getGrade(int i) {
		Grade obj = new Grade(i);
		return obj;
	}

	// Two tests for inputs below and above the valid range for the constructor.
	@Test
	void testBelowValidRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> getGrade(0));
	}

	@Test
	void testAbovteValidRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> getGrade(21));
	}

	// ONE test for a valid input, checking that getPoints returns the right value.
	@Test
	void givenVaildInputGetPointReturnCorrect() {
		grade = new Grade(4);
		assertEquals(grade.getPoints(), 4);
	}

	// FIVE tests for classify, using Classifications as equivalence classes.
	@Test
	void givenGradeClassifyFail() {
		grade = new Grade(20);

		Classification classification = grade.classify();
		assertEquals(Classification.Fail, classification);
	}

	@Test
	void givenGradeClassifyFirst() {
		grade = new Grade(2);

		Classification classification = grade.classify();
		assertEquals(Classification.First, classification);
	}

	@Test
	void givenGradeClassifyUpperSecound() {
		grade = new Grade(8);

		Classification classification = grade.classify();
		assertEquals(Classification.UpperSecond, classification);
	}

	@Test
	void givenGradeClassifyLowerSecound() {
		grade = new Grade(11);

		Classification classification = grade.classify();
		assertEquals(Classification.LowerSecond, classification);
	}

	@Test
	void givenGradeClassifyThird() {
		grade = new Grade(13);

		Classification classification = grade.classify();
		assertEquals(Classification.Third, classification);
	}

	// TWO tests for inputs below and above the valid range for fromPercentage.
	@Test
	void fromPercentageBelowValidRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> Grade.fromPercentage(-22));
	}

	@Test
	void fromPercentageAboveValidRange() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> Grade.fromPercentage(700));

	}

	/*
	 * TWENTY tests for fromPercentage, using each point in the 20-point scale as an
	 * equivalence class.
	 */
	@Test
	void pointsScaleMinus1() {
		Grade grade = Grade.fromPercentage(-1);

		int acutalResult = grade.getPoints();
		int expectedResult = 20;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale1() {
		Grade grade = Grade.fromPercentage(99);

		int acutalResult = grade.getPoints();
		int expectedResult = 1;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale2() {
		Grade grade = Grade.fromPercentage(76);

		int acutalResult = grade.getPoints();
		int expectedResult = 2;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale3() {
		Grade grade = Grade.fromPercentage(73);

		int acutalResult = grade.getPoints();
		int expectedResult = 3;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale4() {
		Grade grade = Grade.fromPercentage(71);

		int acutalResult = grade.getPoints();
		int expectedResult = 4;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale5() {
		Grade grade = Grade.fromPercentage(69);

		int acutalResult = grade.getPoints();
		int expectedResult = 5;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale6() {
		Grade grade = Grade.fromPercentage(65);

		int acutalResult = grade.getPoints();
		int expectedResult = 6;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale7() {
		Grade grade = Grade.fromPercentage(64);

		int acutalResult = grade.getPoints();
		int expectedResult = 7;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale8() {
		Grade grade = Grade.fromPercentage(61);

		int acutalResult = grade.getPoints();
		int expectedResult = 8;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale9() {
		Grade grade = Grade.fromPercentage(57);

		int acutalResult = grade.getPoints();
		int expectedResult = 9;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale10() {
		Grade grade = Grade.fromPercentage(55);

		int acutalResult = grade.getPoints();
		int expectedResult = 10;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale11() {
		Grade grade = Grade.fromPercentage(53);

		int acutalResult = grade.getPoints();
		int expectedResult = 11;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale12() {
		Grade grade = Grade.fromPercentage(50);

		int acutalResult = grade.getPoints();
		int expectedResult = 12;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale13() {
		Grade grade = Grade.fromPercentage(47);

		int acutalResult = grade.getPoints();
		int expectedResult = 13;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale14() {
		Grade grade = Grade.fromPercentage(46);

		int acutalResult = grade.getPoints();
		int expectedResult = 14;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale15() {
		Grade grade = Grade.fromPercentage(42);

		int acutalResult = grade.getPoints();
		int expectedResult = 15;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale16() {
		Grade grade = Grade.fromPercentage(41);

		int acutalResult = grade.getPoints();
		int expectedResult = 16;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale17() {
		Grade grade = Grade.fromPercentage(37);

		int acutalResult = grade.getPoints();
		int expectedResult = 17;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale18() {
		Grade grade = Grade.fromPercentage(32);

		int acutalResult = grade.getPoints();
		int expectedResult = 18;
		assertEquals(expectedResult, acutalResult);
	}

	@Test
	void pointsScale19() {
		Grade grade = Grade.fromPercentage(14);

		int acutalResult = grade.getPoints();
		int expectedResult = 19;
		assertEquals(expectedResult, acutalResult);
	}

}
