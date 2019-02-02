// Probably useless for the AP CompSci exam

public class HeapSort {

	public void heapSort(int[] arr) {
		int n = arr.length;

		for(int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		for(int i = n - 1; i >= 0; i--) {
			int temp = arr[0];

			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}
	}

	public void heapify(int[] arr, int n, int i) {
		int largest = i; // Init largest at root
		int l = 2 * i + 1; // left = 2 * i + 1
		int r = 2 * i + 2; // right = 2 * i + 2

		if(l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		if(r < n && arr[r] > arr[largest]) {
			largest = r;
		}

		if(largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			// Recursively heapify the affected sub-tree
			heapify(arr, n, largest);
		}
	}

	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		int[] arr = {12, 3, 145, 5432, 482};
		int n = arr.length;

		HeapSort heap = new HeapSort();
		heap.heapSort(arr);

		System.out.println("The Sorted Array is: ");
		heap.printArray(arr);

	}
}