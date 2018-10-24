package algorithms;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class MaxSumInNonContigiousArrayTest {
	
	@Test
	public void testMethodWithNullArray() {
		MaxSumInNonContigiousArray arr = new MaxSumInNonContigiousArray();
		assertThat(arr.getMaxSum(null)).isEqualTo(0);
	}
	
	@Test
	public void testMethodWithZeroLength() {
		MaxSumInNonContigiousArray arr = new MaxSumInNonContigiousArray();
		int[] input_arr = new int[] {};
		assertThat(arr.getMaxSum(input_arr)).isEqualTo(0);
	}
	
	@Test
	public void testMethodWithOneLength() {
		MaxSumInNonContigiousArray arr = new MaxSumInNonContigiousArray();
		int[] input_arr = new int[] {-15};
		assertThat(arr.getMaxSum(input_arr)).isEqualTo(-15);
	}
	
	@Test
	public void testMethodWith1() {
		MaxSumInNonContigiousArray arr = new MaxSumInNonContigiousArray();
		int[] input_arr = new int[] {-15, 5, 3};
		assertThat(arr.getMaxSum(input_arr)).isEqualTo(5);
	}

}
