import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AverageTest {

	@Test
	void test() {
		int result;

		@Before 
		public void setUp() throws Exception {
			result = 0;
		}
		
		@After 
		public void tearDown() throws Exception {
			// do nothing
		}
		
		@Test
		public void testTwoNumbers() {
			int[] array = new int[] {100,200};
			result = Average.calculate(array);
			assertEquals((100+200)/2, result);
		}

		@Test
		public void testThreeNumbers() {
			int[] array = new int[] {100,200,300};
			result = Average.calculate(array);
			assertEquals((100+200+300)/3, result);
		}
		
		@Test
		public void testBugOne() {
			// Find a bug in the code for calculate
			// and prove its existence by designing a test
			// that triggers it.
			
			// HINT: requirement implies array of ANY size
		}
		
		@Test
		public void testBugTwo() {
			// Find a different bug in the code for calculate
			// and prove its existence by designing a test
			// that triggers it.

			// HINT: requirement implies array with ANY integers
		}
	}

}
