package algorithms;

import org.junit.Test;

public class SortedArrayToBSTTest {
	
	@Test
	public void sortedArrayTest(){
		int[] inpt_arr = new int[]{1,2,3,4,5};
		SortedArrayToBST algo = new SortedArrayToBST();
		TreeNode node = algo.buildBSTFromSortedArray(inpt_arr, 0, inpt_arr.length-1);
		node.preOrder(node);
		System.out.println("");
		node.inOrder(node);
	}

}
