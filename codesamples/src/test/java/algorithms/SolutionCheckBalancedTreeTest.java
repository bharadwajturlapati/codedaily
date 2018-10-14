package algorithms;

import org.junit.Test;

import junit.framework.Assert;

public class SolutionCheckBalancedTreeTest {

	@Test
	public void testCheckNullRootisBst() {
		SolutionCheckBalancedTree ds = new SolutionCheckBalancedTree();
		boolean actual = ds.istreebst(null);
		Assert.assertEquals(true, actual);
	}

	@Test
	public void testBSTisBST() {
		SolutionCheckBalancedTree ds = new SolutionCheckBalancedTree();
		boolean actual = ds.istreebst(buildtree());
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void testBSTisNotBST() {
		SolutionCheckBalancedTree ds = new SolutionCheckBalancedTree();
		boolean actual = ds.istreebst(buildNonBsttree());
		Assert.assertEquals(false, actual);
	}

	private static node returnNewNode() {
		return new node();
	}

	private static node buildtree() {
		node root = returnNewNode();
		root.val = 10;
		root.left = returnNewNode();
		root.left.val = 5;
		root.right = returnNewNode();
		root.right.val = 30;
		return root;
	}
	
	private static node buildNonBsttree() {
		node root = returnNewNode();
		root.val = 10;
		root.left = returnNewNode();
		root.left.val = 25;
		root.right = returnNewNode();
		root.right.val = 30;
		return root;
	}
}
