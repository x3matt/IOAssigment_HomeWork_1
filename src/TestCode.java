import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCode {

	@Test
	public void SumDigitsFromFiletest() throws Exception {
		//"Digits.txt"
		Integer sum = 1+2+5+45+54;
		assertEquals(sum, Main.sumDigitsFromFile("Digits.txt"));
	}
}
