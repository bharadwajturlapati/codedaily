package linkedlistalgo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListAlgoTest {
	
	
	@Test
	public void testLinkedListAlgoisNull(){
		List<Integer> list = SolutionSkipSizeDeleteSize.processLinkedList(null, 10, 10);
		Assert.assertEquals(list, null);
	}
	
	@Test
	public void testLinkedListAlgo(){
		List<Integer> inputlist = Arrays.asList(1,2,3,4,5);
		List<Integer> outputlist = SolutionSkipSizeDeleteSize.processLinkedList(inputlist, 10, 10);
		Assert.assertEquals(outputlist, null);
	}

}
