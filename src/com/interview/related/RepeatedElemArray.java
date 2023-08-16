package com.interview.related;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedElemArray {

	public static int[] printRepeatingV1(int[] arr) {

		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("The given array cannot be null or empty");
		}
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					output[i] = arr[i];
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 4, 5, 2, 3, 1, 12, 45, 66, 45, 77, 89, 89 };

		int[] result = RepeatedElemArray.printRepeatingV1(arr);
		for (int i = 0; i < result.length; i++) {
			if (result[i] != 0) {
				System.out.print(result[i] + " ");
			}

		}
	}

	// Program Version 2

	static class PrintRepeatingV2 {
		public static List<Integer> printRepeatingV2(int[] arr) {

			if (arr == null || arr.length == 0) {
				throw new IllegalArgumentException("The given array cannot be null or empty");
			}
			Set<Integer> set = new HashSet<>();
			List<Integer> li = new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				if (set.contains(arr[i])) {
					li.add(arr[i]);
				} else {
					set.add(arr[i]);
				}
			}

			return li;
		}

		public static void main(String[] args) {
			int arr[] = { 4, 2, 4, 5, 2, 3, 1, 12, 45, 66, 45, 77, 89, 89 };

			List<Integer> r3 = PrintRepeatingV2.printRepeatingV2(arr);
			System.out.println("r3: " + r3);

		}
	}
}

// Program Version 3

class PrintRepeatingV3 {
	public static void main(String[] args) {
		int arr[] = { 4, 2, 4, 5, 2, 3, 1, 12, 45, 66, 45, 77, 89, 89 };
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("The given array cannot be null or empty");
		}		
		Set<Integer> set = new HashSet<>();
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				li.add(arr[i]);
			} else {
				set.add(arr[i]);
			}
		}
		System.out.println(li);
	}
}
