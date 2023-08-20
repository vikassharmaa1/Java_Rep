package com.java.arrayHandling;

public class SplitMergeTop_BottomEx {

	public static void main(String[] args) {

		int i, j, n = 0, a = 0;
		int number[] = {};
		int split[] = {};
		int merge[] = {};

		for (i = 0; i < a; ++i) {
			number[n] = number[0];
			for (j = 0; j < n; ++j) {
				number[j] = number[j + 1];
			}
		}
		System.out.println("The resultant array is : ");
		for (i = 0; i < n; ++i) {
			System.out.println(number[i]);
		}
	}

}
