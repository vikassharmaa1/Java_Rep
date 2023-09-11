package com.java.arrayHandling;

public class PairwiseSort {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 2, 4, 6, 8 };
		if (a.length == 0 || a.length == 1)
			System.exit(0);
		for (int i = 0; i < a.length - 1; i += 2) {
			int temp = a[i + 1];
			a[i + 1] = a[i];
			a[i] = temp;
			if (a[i] < a[i + 1])
			System.out.print(a[i] + " ");
		}
	}
}
