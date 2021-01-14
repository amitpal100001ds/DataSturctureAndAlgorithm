package array;

public class ReverseArray {
	public void reverseArray(int arr[], int start, int end) {

		while (start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public void swap(int arr[], int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static void main(String arg[]) {
		int arr[] = { 2, 5, 2, 80, 6, 7, 6 };

		// Reverse array program
		ReverseArray reverseArray = new ReverseArray();
		reverseArray.reverseArray(arr, 0, arr.length - 1);
	}
}
