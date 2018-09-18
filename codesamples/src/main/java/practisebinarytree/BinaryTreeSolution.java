package practisebinarytree;

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

class BinaryTree {
	Node root;

	public void inordertraversal(Node node) {
		if (node != null) {
			inordertraversal(node.left);
			System.out.println(node.val);
			inordertraversal(node.right);
		}
	}

	public int maxsumPath(Node node) {
		if (node == null) {
			return 0;
		}
		int left = maxsumPath(node.left);
		int right = maxsumPath(node.right);
		int maxofleftright = left > right ? left : right;
		int maxofnodewithleftright = maxofleftright + node.val > node.val ? maxofleftright + node.val : node.val;
		return maxofnodewithleftright;
	}
}

class Node {
	int val;
	Node left;
	Node right;

	public Node(int data) {
		this.val = data;
	}
}
