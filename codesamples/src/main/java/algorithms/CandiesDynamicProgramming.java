package algorithms;

import HackerRank.HackerRankMeta;

public class CandiesDynamicProgramming extends HackerRankMeta{
	
	public static long candies(int n, int[] arr) {
        int prev = arr[0];
        int sum = 1;
        arr[0] = 1;
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            if(arr[i] > prev){
                arr[i] = arr[i-1] + 1;
            } else{
                arr[i] = 1;
            }
            sum += arr[i];
            prev = temp;
        }
        return sum;
    }

	@Override
	public String getURL() {
		return "https://www.hackerrank.com/challenges/candies/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dynamic-programming";
	}
}
