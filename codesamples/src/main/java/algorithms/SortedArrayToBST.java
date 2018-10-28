package algorithms;

public class SortedArrayToBST {
	
	public TreeNode buildBSTFromSortedArray(int[] arr, int left, int right){
		if(left > right){
			return null;
		}
		
		int mid = (left+right)/2;
		TreeNode node = new TreeNode(arr[mid]);
		
		node.left = buildBSTFromSortedArray(arr, left, mid-1);
		node.right = buildBSTFromSortedArray(arr, mid+1, right);
		
		return node;
	}
	
}