import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleClassifierTest {

	@Test(expected=IllegalArgumentException.class)
	void test() {
		TriangleClassifier.classify(3.0, 4.0, 5.0);
	}
	
	@Test()
	public void test1() {
		assertEquals(TriangleClassifier.classify(3.0, 4.0, 5.0),
				TriangleClassifier.Classification.Scalene);
	}


}
