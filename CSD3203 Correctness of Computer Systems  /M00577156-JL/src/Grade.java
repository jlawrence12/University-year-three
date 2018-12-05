/* Author: Jovanie Lawrence                          *
 * Student number: M00577156 						 *
 * Module: CSD3202 – Correctness in Computer Systems *
 * Coursework Project 1 							 */

public class Grade {
	private final int points;

	public int getPoints() {
		return points;
	}

	public Grade(int input) throws IllegalArgumentException {
		if (input < 1 || input > 20) {
			throw new IllegalArgumentException();
		} else {
			points = input;
		}
	}

	// Your additions/changes below this line

	public Classification classify() {

		switch (points) {
		case 1:
		case 2:
		case 3:
		case 4:
			return Classification.First;

		case 5:
		case 6:
		case 7:
		case 8:
			return Classification.UpperSecond;

		case 9:
		case 10:
		case 11:
		case 12:
			return Classification.LowerSecond;

		case 13:
		case 14:
		case 15:
		case 16:
			return Classification.Third;

		case 17:
		case 18:
		case 19:
		case 20:
			return Classification.Fail;

		}
		return Classification.Fail;

	}

	public static Grade fromPercentage(int input) throws IllegalArgumentException {
		Grade grade = null;

		if (input < 0 || input > 100) {
			if (input == -1) {
				grade = new Grade(20);
			} else {
				throw new IllegalArgumentException();
			}
		}

		if (input >= 79) {
			grade = new Grade(1);
		} else if (input >= 76) {
			grade = new Grade(2);
		} else if (input >= 73) {
			grade = new Grade(3);
		} else if (input >= 70) {
			grade = new Grade(4);
		} else if (input >= 67) {
			grade = new Grade(5);
		} else if (input >= 65) {
			grade = new Grade(6);
		} else if (input >= 62) {
			grade = new Grade(7);
		} else if (input >= 60) {
			grade = new Grade(8);
		} else if (input >= 57) {
			grade = new Grade(9);
		} else if (input >= 55) {
			grade = new Grade(10);
		} else if (input >= 52) {
			grade = new Grade(11);
		} else if (input >= 50) {
			grade = new Grade(12);
		} else if (input >= 47) {
			grade = new Grade(13);
		} else if (input >= 45) {
			grade = new Grade(14);
		} else if (input >= 42) {
			grade = new Grade(15);
		} else if (input >= 40) {
			grade = new Grade(16);
		} else if (input >= 35) {
			grade = new Grade(17);
		} else if (input >= 30) {
			grade = new Grade(18);
		} else if (input >= 0) {
			grade = new Grade(19);
		}

		return grade;

	}
}
