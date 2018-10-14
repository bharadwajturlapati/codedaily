package algorithms;

public class SolutionCheckBalancedTree {

	private static node returnNewNode(){
		return new node();
	}
	
	public static node buildtree(){
		node root = returnNewNode();
		root.val = 10;
		root.left = returnNewNode();
		root.left.val = 5;
		root.right = returnNewNode();
		root.right.val = 30;
		return root;
	}
	
	boolean istreebst(node root){
		return checkBST(root, null, null);
	}
	
	boolean checkBST(node root, Integer min, Integer max){
		if(root == null){
			return true;
		}
		if((min != null && root.val<=min) ||(max !=null && root.val> max)){
			return false;
		}
		if
	}

}

class node{
	int val;
	node left;
	node right;
}
