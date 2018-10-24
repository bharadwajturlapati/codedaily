package algorithms;

public class MaxSumInNonContigiousArray {

	public int getMaxSum(int[] arr) {
		if (arr == null) {
			return 0;
		}
		int arr_size = arr.length;
		if (arr_size == 0) {
			return 0;
		}
		if (arr_size == 1) {
			return arr[0];
		}

		arr[0] = Math.max(0, arr[0]);
		arr[1] = Math.max(arr[0], arr[1]);

		for (int i = 2; i < arr_size; i++) {
			int local_max = Math.max(arr[i], arr[i - 1]);
			if (i+2 < arr_size) {
				arr[i] = Math.max(local_max, arr[i] + arr[i + 2]);
			} else {
				arr[i] = Math.max(local_max, arr[i]);
			}
		}
		return arr[arr_size - 1];
	}

}
