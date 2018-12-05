
/* Author: Jovanie Lawrence                          *
 * Student number: M00577156 						 *
 * Module: CSD3202 – Correctness in Computer Systems *
 * Coursework Project 1 							 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DegreeTest {

	private Degree degree;

	List<Grade> list1;
	List<Grade> list2;

	// THREE tests for the constructor, one for each distinct way input can be
	// invalid.
	@Test
	void constructorInputTestFailGrade() {
		list1 = Arrays.asList(new Grade(7), new Grade(12), new Grade(13), new Grade(14));
		list2 = Arrays.asList(new Grade(9), new Grade(15), new Grade(16), new Grade(20));
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Degree(list1, list2));
	}

	@Test
	void contructorInputTestDoesNotContainFourGrades() {
		list1 = Arrays.asList(new Grade(7), new Grade(12), new Grade(13));
		list2 = Arrays.asList(new Grade(9), new Grade(5), new Grade(3), new Grade(1));
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Degree(list1, list2));
	}

	@Test
	void constructorInputTestNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Degree(list1, list2));

	}

	// FIVE tests, using Classifications as equivalence classes.

	@Test
	void classificationFirstTest() {
		list1 = new ArrayList<Grade>();
		list2 = new ArrayList<Grade>();

		list1.add(new Grade(1));
		list1.add(new Grade(2));
		list1.add(new Grade(3));
		list1.add(new Grade(4));

		list2.add(new Grade(4));
		list2.add(new Grade(3));
		list2.add(new Grade(2));
		list2.add(new Grade(1));
		list2.add(new Grade(1));
		list2.add(new Grade(2));
		list2.add(new Grade(3));
		list2.add(new Grade(4));
		degree = new Degree(list1, list2);
		Classification classificationResult = degree.classify();
		assertEquals(Classification.First, classificationResult);
	}

	@Test
	void classificationUpperSecondTest() {
		list1 = new ArrayList<Grade>();
		list2 = new ArrayList<Grade>();
		list1.add(new Grade(5));
		list1.add(new Grade(6));
		list1.add(new Grade(7));
		list1.add(new Grade(8));

		list2.add(new Grade(8));
		list2.add(new Grade(7));
		list2.add(new Grade(6));
		list2.add(new Grade(5));
		degree = new Degree(list1, list2);
		Classification classificationResult = degree.classify();
		assertEquals(Classification.UpperSecond, classificationResult);
	}

	@Test
	void classificationLowerSecondTest() {
		list1 = new ArrayList<Grade>();
		list2 = new ArrayList<Grade>();
		list1.add(new Grade(9));
		list1.add(new Grade(10));
		list1.add(new Grade(11));
		list1.add(new Grade(12));
		list2.add(new Grade(12));
		list2.add(new Grade(11));
		list2.add(new Grade(10));
		list2.add(new Grade(9));
		degree = new Degree(list1, list2);
		Classification classificationResult = degree.classify();
		assertEquals(Classification.LowerSecond, classificationResult);
	}

	@Test
	void classificationThirdTest() {
		list1 = new ArrayList<Grade>();
		list2 = new ArrayList<Grade>();
		list1.add(new Grade(13));
		list1.add(new Grade(14));
		list1.add(new Grade(15));
		list1.add(new Grade(16));
		list2.add(new Grade(16));
		list2.add(new Grade(15));
		list2.add(new Grade(14));
		list2.add(new Grade(13));
		degree = new Degree(list1, list2);
		Classification classificationResult = degree.classify();
		assertEquals(Classification.Third, classificationResult);

	}

	@Test
	void classificationDiscretionTest() {
		list1 = new ArrayList<Grade>();
		list2 = new ArrayList<Grade>();
		list1.add(new Grade(17));
		list1.add(new Grade(18));
		list1.add(new Grade(19));
		list1.add(new Grade(20));
		list2.add(new Grade(20));
		list2.add(new Grade(19));
		list2.add(new Grade(18));
		list2.add(new Grade(17));
		degree = new Degree(list1, list2);
		Classification classificationResult = degree.classify();
		assertEquals(Classification.Discretion, classificationResult);
	}

}
