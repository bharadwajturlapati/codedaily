package algorithms;

public class TreeNode {
	
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val){
		this.data = val;
		this.left = null;
		this.right = null;
	}

	
	public void preOrder(TreeNode node) { 
        if (node == null) { 
            return; 
        } 
        System.out.print(node.data + " "); 
        preOrder(node.left); 
        preOrder(node.right); 
    }
	
	public void inOrder(TreeNode node) { 
        if (node == null) { 
            return; 
        } 
        preOrder(node.left); 
        System.out.print(node.data + " "); 
        preOrder(node.right); 
    } 
}
