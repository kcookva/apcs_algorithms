
public class SelectionSort {

	public void sort(int[] arr) {
		int n = arr.length; 
		for(int i = 0; i <= n - 1; i++) {
			int min_idx = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			// Swapping the found minimum element with the first
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		SelectionSort ob = new SelectionSort();
		int[] arr = {34, 124, 4, 67, 818};
		ob.sort(arr);
		System.out.println("Sorted array...");
		ob.printArray(arr);
	}

}