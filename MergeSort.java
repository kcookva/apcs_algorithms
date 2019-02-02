// Turns out the merge sort algorithms is really efficient, even though it's difficult to program.

public class MergeSort {

	public void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create new temporary arrrays
		int L[] = new int[n1];
		int R[] = new int[n2];

		//Copy data to temp arrays
		for(int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		for(int j = 0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}


		// Merge the temp arrays

		int i = 0, j = 0;

		int k = l;
		while(i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;

		}

		while(i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
	}

	public void sort(int arr[], int l, int r) {
		if(l < r) {
			int m = (l + r) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);

      merge(arr, l, m, r);
		}
  }

    public static void printArray(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

	public static void main(String[] args) {
      int arr[] = {123, 43, 1234, 5, 775, 978};

      System.out.println("Given array: ");
      printArray(arr);

      MergeSort ms = new MergeSort();
      ms.sort(arr, 0, arr.length - 1);

      System.out.println("\nSorted Array: ");
      printArray(arr);

	}
}
