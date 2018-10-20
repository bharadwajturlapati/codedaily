package algorithms;


public class SolutionCheckBalancedTree {

	public boolean istreebst(node root) {
		return checkBST(root, null, null);
	}

	private boolean checkBST(node root, Integer min, Integer max){
		if(root == null){
			return true;
		}
		// hacker earth needs this fix for the input 7
		// which is value of the current node
		// cannot be greater than equal to max
		if((min != null && root.val<=min) ||(max !=null && root.val>= max)){
			return false;
		}
		if(!checkBST(root.left, min, root.val) || !checkBST(root.right, root.val,max)){
			return false;
		}
		return true;
	}
}

class node {
	int val;
	node left;
	node right;
}
