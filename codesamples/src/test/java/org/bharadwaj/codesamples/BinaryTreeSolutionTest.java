package org.bharadwaj.codesamples;

import org.junit.Test;

import binarytrees.BinaryTree;
import binarytrees.Node;

public class BinaryTreeSolutionTest {

	
	@Test
	public void testBinaryMaxSumPath(){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(10); 
        tree.root.left.left = new Node(20); 
        tree.root.left.right = new Node(1); 
        tree.root.right.right = new Node(-25); 
        tree.root.right.right.left = new Node(3); 
        tree.root.right.right.right = new Node(4); 
        int result = tree.maxsumPath(tree.root);
        System.out.println(result);
	}
}
