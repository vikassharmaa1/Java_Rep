package arrayHandling;

import java.util.ArrayList;
import java.util.List;

public class RepeatedElemArray {

	public void printRepeating(int arr[], int size) {
		int i, j, k = 0;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					 k = arr[i];
				}
					System.out.print(+ k + " ");
			}
		}
	}

	public static void main(String[] args) {
		RepeatedElemArray repeat = new RepeatedElemArray();
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;		
		repeat.printRepeating(arr, arr_size);
	}
}
