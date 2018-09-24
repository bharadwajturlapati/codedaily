package HackerRank;

import org.junit.Test;

public class RotateArrayTest {

	@Test
	public void failedTest() {
		int[] array_inpt = new int[] { 41, 73, 89, 7, 
				10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51 };
		RotateArray.rotateArray(20, 10, array_inpt);

	}
}
