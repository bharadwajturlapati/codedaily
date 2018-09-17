package binarytrees;

public class BinaryTree {

	Node root;

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(10);
		binaryTree.root.left = new Node(1);
		binaryTree.root.right = new Node(15);
		binaryTree.inorderTraversal(binaryTree.root);
	}

	public void inorderTraversal(Node node) {
		if(node != null){
			inorderTraversal(node.left);
			System.out.println(node.data);
			inorderTraversal(node.right);
		}
		
	}

}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}
