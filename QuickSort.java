//QuickSort sorting algorithm -- Kaiden Cook -- 2019



public class QuickSort {

	// Partition will split the array into two smaller arrays (using a pivot number)

	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // Index of smaller element
		for(int j = low; j < high; j++) {
			// If current element is equal to or smaller than pivot
			if(arr[j] <= pivot) {
				i++;

				// Swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Swap arr[i + 1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;

	}

	public void sort(int[] arr, int low, int high) {
		if(low < high) {
			// pi is partitioning index
			int pi = partition(arr, low, high);


			sort(arr, low, pi - 1); // First subarray
			sort(arr, pi + 1, high); // Second subarray
		}
	}

	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}


	public static void main(String[] args) {
		int[] arr = {12, 45, 66, 9187, 94, 4, 12, 445, 1234};
		int n = arr.length;
		QuickSort quicksrt = new QuickSort();
		quicksrt.sort(arr, 0, n - 1);
		quicksrt.printArray(arr);
	}
}