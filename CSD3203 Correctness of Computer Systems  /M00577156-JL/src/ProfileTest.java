
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

class ProfileTest {

	private Profile profile;

	List<Grade> list1;

	// THREE tests for the constructor, one for each distinct way input can be
	// invalid.

	// Test if any grade in the list is a fail grade
	@Test
	void constructorInputTestFailGrade() {
		list1 = Arrays.asList(new Grade(1), new Grade(20), new Grade(15), new Grade(16));
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Profile(list1));
	}

	// Test if the list is null
	@Test
	void constructorInputTestNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Profile(list1));
	}

	// Test if the list is empty
	@Test
	void constructorInputTestEmpty() {
		list1 = Arrays.asList();
		Assertions.assertThrows(IllegalArgumentException.class, () -> new Profile(list1));
	}

	/*
	 * SIX tests, one for each possible combination of Classification and truth
	 * value (whether the profile is clear or not) as an equivalence class.
	 */

	// Test for clear first class classification
	@Test
	void classificationFirstAndClearTest() {
		list1 = new ArrayList<Grade>();
		list1.add(new Grade(1));
		list1.add(new Grade(2));
		list1.add(new Grade(15));
		list1.add(new Grade(1));
		profile = new Profile(list1);
		Classification classificationResult = profile.classify();
		assertEquals(Classification.First, classificationResult);

		boolean isClearExpectedResult = true;
		assertEquals(isClearExpectedResult, profile.isClear());
	}

	// Test for clear upper second class classification
	@Test
	void classificationUpperSecondAndClearTest() {
		list1 = new ArrayList<Grade>();
		list1.add(new Grade(5));
		list1.add(new Grade(6));
		list1.add(new Grade(15));
		list1.add(new Grade(1));
		profile = new Profile(list1);
		Classification classificationResult = profile.classify();
		assertEquals(Classification.UpperSecond, classificationResult);

		boolean isClearExpectedResult = true;
		assertEquals(isClearExpectedResult, profile.isClear());
	}

	// Test for lower second class classification
	@Test
	void classificationLowerSecondTest() {
		list1 = new ArrayList<Grade>();
		list1.add(new Grade(11));
		list1.add(new Grade(12));
		list1.add(new Grade(5));
		list1.add(new Grade(1));
		list1.add(new Grade(11));
		list1.add(new Grade(13));
		list1.add(new Grade(16));
		list1.add(new Grade(1));
		profile = new Profile(list1);
		Classification classificationResult = profile.classify();
		assertEquals(Classification.LowerSecond, classificationResult);
	}

	// Test for third class classification
	@Test
	void classificationThirdTest() {
		list1 = new ArrayList<Grade>();
		list1.add(new Grade(15));
		list1.add(new Grade(12));
		list1.add(new Grade(16));
		list1.add(new Grade(13));
		list1.add(new Grade(11));
		list1.add(new Grade(13));
		list1.add(new Grade(16));
		list1.add(new Grade(1));
		profile = new Profile(list1);
		Classification classificationResult = profile.classify();
		assertEquals(Classification.Third, classificationResult);
	}

	// Test for border line first class classification
	@Test
	void classificationFirstAndBorderlineTest() {
		list1 = new ArrayList<Grade>();
		list1.add(new Grade(1));
		list1.add(new Grade(2));
		list1.add(new Grade(13));
		list1.add(new Grade(14));
		profile = new Profile(list1);
		Classification classificationResult = profile.classify();
		assertEquals(Classification.First, classificationResult);

		boolean isClearExpectedResult = false;
		assertEquals(isClearExpectedResult, profile.isClear());
	}

	// Test for border line upper second class classification
	@Test
	void classificationUpperSecoundAndBorderlineTest() {
		list1 = new ArrayList<Grade>();
		list1.add(new Grade(1));
		list1.add(new Grade(5));
		list1.add(new Grade(6));
		list1.add(new Grade(7));
		list1.add(new Grade(8));
		list1.add(new Grade(13));
		list1.add(new Grade(16));
		list1.add(new Grade(14));
		profile = new Profile(list1);
		Classification classificationResult = profile.classify();
		assertEquals(Classification.UpperSecond, classificationResult);

		boolean isClearExpectedResult = false;
		assertEquals(isClearExpectedResult, profile.isClear());
	}

}
