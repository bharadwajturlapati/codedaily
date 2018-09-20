package practisebinarytree;

import binarytrees.BinaryTree;
import binarytrees.Node;

public class BinaryTreeSolution {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
		tree.root.left = new Node(10);
		tree.root.right = new Node(30);
		tree.inordertraversal(tree.root);
		System.out.println(tree.maxsumPath(tree.root));
	}

}
