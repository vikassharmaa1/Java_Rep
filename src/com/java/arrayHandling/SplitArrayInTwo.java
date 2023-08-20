package com.java.arrayHandling;

import java.util.Arrays;

public class SplitArrayInTwo {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5 };
		int n = input.length;

		int[] a = new int[(n + 1) / 2];
		int[] b = new int[n - a.length];

		for (int i = 0; i < n; i++) {

			if (i < a.length) {
				a[i] = input[i];

			} else {

				b[i - a.length] = input[i];
			}

		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
