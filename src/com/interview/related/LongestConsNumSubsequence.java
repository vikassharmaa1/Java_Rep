package com.interview.related;

import java.util.Arrays;

public class LongestConsNumSubsequence {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 7, 8, 9, 10, 11, 12, 13 };
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && (arr[i] == arr[i - 1] + 1)) {
				count++;
			} else if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			} else {
				count = 1;
			}
		}
		System.out.println(count);
	}
}
