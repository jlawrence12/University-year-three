
/* Author: Jovanie Lawrence                          *
 * Student number: M00577156 						 *
 * Module: CSD3202 – Correctness in Computer Systems *
 * Coursework Project 1 							 */

import java.util.ArrayList;
import java.util.List;

public class Degree {
	// Your additions/changes below this line

	private List<Grade> gradeListYearTwo = new ArrayList<Grade>();
	private List<Grade> gradeListYearThree = new ArrayList<Grade>();

	public Degree(List<Grade> gradeListYearTwo, List<Grade> gradeListYearThree) {

		if (null == gradeListYearTwo || null == gradeListYearThree) {
			throw new IllegalArgumentException();
		}

		if (gradeListYearTwo.size() != 4 || gradeListYearThree.size() != 4) {
			throw new IllegalArgumentException();
		}

		for (int i = 0; i < gradeListYearTwo.size(); i++) {

			if (gradeListYearTwo.get(i).classify() == Classification.Fail) {
				throw new IllegalArgumentException();
			} else {

				this.gradeListYearTwo.add(gradeListYearTwo.get(i));
			}
		}

		for (int i = 0; i < gradeListYearThree.size(); i++) {

			if (gradeListYearThree.get(i).classify() == Classification.Fail) {
				throw new IllegalArgumentException();
			} else {

				this.gradeListYearThree.add(gradeListYearThree.get(i));
			}
		}

	}

	public Classification classify() {

		return Classification.Third;
	}

}
