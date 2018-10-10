package Sorting;

import java.util.Arrays;

public class SolutionMergeSortCrackingCodingInterview {

	public static void main(String[] args) {
		int[] arr = new int[]{5,4,3,2,1};
		int[] helperarr = new int[arr.length];
		mergesort(arr, helperarr, 0, arr.length-1);
		printarr(arr);
	}
	
	private static void printarr(int[] arr) {
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
	}

	private static void mergesort(int[] arr, int[] helper, int low, int high){
		if(low<high){
			int middle = (low+high)/2;
			mergesort(arr, helper, low, middle);
			mergesort(arr, helper, middle+1, high);
			merge(arr, helper, low, middle, high);
		}
	}
	
	private static void merge(int[] arr, int[] helper, int low, int middle, int high){
		
		for(int lowerIndex = low; lowerIndex<=high; lowerIndex++){
			helper[lowerIndex]  = arr[lowerIndex];
		}
		
		int helperLeft = low;
		int helperRight = middle+1;
		int current = low;
		
		while(helperLeft <= middle && helperRight <= high){
			if(helper[helperLeft] <= helper[helperRight]){
				arr[current] = helper[helperLeft];
				helperLeft++;
			} else{
				arr[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		printarrinline(arr);
		
		int remaining = middle-helperLeft;
		for(int i=0; i<=remaining;i++){
			arr[current+i]= helper[helperLeft+i];
		}
		printarrinline(arr);
	}

	private static void printarrinline(int[] is) {
		for(int i=0; i<is.length; i++){
			System.out.print(is[i]);
		}
		System.out.println("#####");
	}
}
