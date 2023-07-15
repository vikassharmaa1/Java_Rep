package com.interview.related;

import java.util.Arrays;

public class RemoveDuplicateArrayEle {
	public static void main(String[] args) {
		int[] a = { 11, 13, 17, 21, 11, 21, 77, 56, 56 };
		Arrays.sort(a);
		if (a.length == 0 || a.length == 1) {
			System.out.print(a.length);
		}
		int[] b = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				b[j++] = a[i];
			}
		}
		b[j++] = a[a.length - 1];
		for (int i = 0; i < j; i++) {
			a[i] = b[i];
			System.out.print(a[i] + " ");
		}
	}
}
