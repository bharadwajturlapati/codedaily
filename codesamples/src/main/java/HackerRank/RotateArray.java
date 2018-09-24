package HackerRank;

public class RotateArray {

	public static void rotateArray(int n, int d, int[] arr) {
		/*int currIndex = 0, newIndex = 0;
		int backupVal = arr[currIndex], newVal = arr[currIndex];
		int algorithmic_index = n - (d % n);
		int i = 0;
		while (i < n) {
			currIndex = newIndex;
			// compute the new index for current value
			newIndex = (algorithmic_index + currIndex) % n;
			// take backup of new index value
			backupVal = arr[newIndex];
			// assign the value to the new index
			arr[newIndex] = newVal;
			newVal = backupVal;
			i++;
		}
*/
		leftRotate(arr, d, n);
		String resultString = new String();
		for (int j = 0; j < n; j++) {
			resultString += (String.valueOf(arr[j]));
			if (j != n - 1) {
				resultString += (" ");
			}
		}
		System.out.println(resultString);
		// return resultString;
	}
	
	private static void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++){
            leftRotatebyOne(arr, n);
        }
    }
 
    private static void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }

}
