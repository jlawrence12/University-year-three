
/* Author: Jovanie Lawrence                          *
 * Student number: M00577156 						 *
 * Module: CSD3202 – Correctness in Computer Systems *
 * Coursework Project 1 							 */

import java.util.ArrayList;
import java.util.List;

public class Profile {
	// Your additions/changes below this line

	private List<Grade> gradeList = new ArrayList<Grade>();

	public Profile(List<Grade> gradeList) {

		if (null == gradeList || gradeList.isEmpty()) {
			throw new IllegalArgumentException();
		}

		for (int i = 0; i < gradeList.size(); i++) {

			if (gradeList.get(i).classify() == Classification.Fail) {
				throw new IllegalArgumentException();
			} else {

				this.gradeList.add(gradeList.get(i));
			}
		}

	}

	public Classification classify() {

		if (calculateClassPercentage(Classification.First) >= 50) {
			return Classification.First;

		} else if ((calculateClassPercentage(Classification.UpperSecond)
				+ calculateClassPercentage(Classification.First)) >= 50) {
			return Classification.UpperSecond;

		} else if ((calculateClassPercentage(Classification.LowerSecond)
				+ calculateClassPercentage(Classification.UpperSecond)
				+ calculateClassPercentage(Classification.First)) >= 50) {
			return Classification.LowerSecond;

		} else
			return Classification.Third;

	}

	public boolean isClear() {

		if (this.classify() == Classification.First || this.classify() == Classification.UpperSecond) {

			if (calculateClassPercentage(Classification.Third) > 25) {
				return false;
			}
		}
		return true;

	}

	/**
	 * private class which calculates a classification percentage
	 */
	private int calculateClassPercentage(Classification classification) {
		int classGradeCount = 0;

		for (Grade grade : gradeList) {

			if (grade.classify() == classification) {
				classGradeCount++;
			}
		}

		int classGradePercentage = classGradeCount * 100 / gradeList.size();

		return classGradePercentage;
	}
}
