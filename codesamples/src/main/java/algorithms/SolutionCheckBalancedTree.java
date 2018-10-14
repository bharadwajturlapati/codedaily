package algorithms;


public class SolutionCheckBalancedTree {

	public boolean istreebst(node root) {
		return checkBST(root, null, null);
	}

	private boolean checkBST(node root, Integer min, Integer max){
		if(root == null){
			return true;
		}
		if((min != null && root.val<=min) ||(max !=null && root.val> max)){
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
