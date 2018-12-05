import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateTest {

	@Test
	void test() {
			Calculate calculation = new Calculate();
			assertEquals(calculation.sum(2, 5), 7);
		}

}


