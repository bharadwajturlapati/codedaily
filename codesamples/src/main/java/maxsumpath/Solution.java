package maxsumpath;

public class Solution {
	
	
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		System.out.println(tree.maxSumPath(tree.root));
	}

}


class Res{
	public static int val = Integer.MIN_VALUE;
}

class BinaryTree{
	Node root;
	
	
	public int maxSumPath(Node node) {
		if(node == null) {
			return 0;
		}
		
		int left = maxSumPath(node.left);
		int right = maxSumPath(node.right);
		int maxofleftright = left > right ? left : right;
		Res.val = maxofleftright + node.data > node.data ? maxofleftright+node.data : node.data;
		return maxofleftright;
	}
}


class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
	}
}
