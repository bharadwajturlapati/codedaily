package binarytrees;

public class BinaryTree {
	public Node root;
	public int max_sum_result;

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
		if(node.left == null && node.right == null){
			return node.val;
		}
		//checking if i am regressing max _result;
		System.out.println(node.val);
		int left = maxsumPath(node.left);
		int right = maxsumPath(node.right);
		// check max of left or right
		int maxofleftright = left > right ? left : right;
		// check max of node 
		
		int maxofnodewithleftright = maxofleftright + node.val > node.val ? maxofleftright + node.val : node.val;
		
		return maxofnodewithleftright;
	}
}