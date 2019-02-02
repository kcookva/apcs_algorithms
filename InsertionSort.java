

public class InsertionSort {


	public static void sort(int arr[]) {
		int n = arr.length;
		for(int j = 1; j < n; j++) {
			int key = arr[j];
			int i = j - 1;


			while(i >= 0 && arr[i] > key) {
				arr[i + 1] = arr[i];
				i--;
			}

			arr[i + 1] = key;
		}
	}

	public static void main(String[] args) {
		int arr[] = {32, 12, 4433, 56, 6, 109};
		System.out.println("Array before insertion sort: ");
		for(int i : arr) {
			System.out.println(i + " ");
		}

		sort(arr);
		System.out.println("Array after insertion sort: ");
		for(int i : arr) {
			System.out.println(i + " ");
		}
	}
}