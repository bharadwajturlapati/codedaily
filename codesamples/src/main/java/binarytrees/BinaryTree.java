package binarytrees;

public class BinaryTree {
	public Node root;

	public void inordertraversal(Node node) {
		if (node != null) {
			inordertraversal(node.left);
			System.out.println(node.val);
			inordertraversal(node.right);
		}
	}

	public int maxsumPath(Node node) {
		/*if (node == null) {
			return 0;
		}*/
		System.out.println(node.val);
		if(node.left == null && node.right == null){
			return node.val;
		}
		int left = maxsumPath(node.left);
		int right = maxsumPath(node.right);
		int maxofleftright = left > right ? left : right;
		int maxofnodewithleftright = maxofleftright + node.val > node.val ? maxofleftright + node.val : node.val;
		return maxofnodewithleftright;
	}
}