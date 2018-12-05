import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatenatorTest {

	@Test
		public void testGlueOneWord() {
			String word = "Word!";
			String[] args = new String[] {word};
			String result = Concatenator.glue(args);
			assertEquals(word, result);
		}

		@Test
		public void testGlueTwoWords() {
			String[] args = new String[] {"one", "two"};
			String result = Concatenator.glue(args);
			assertEquals("onetwo", result);
		}
		
		@Test
		public void testGlueEmpty() {
			String[] args = new String[] {};
			String result = Concatenator.glue(args);
			assertEquals("", result);
		}

}
