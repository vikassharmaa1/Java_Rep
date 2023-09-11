package com.interview.related;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class LongestSqc {

	public static void main(String[] args) {
		int[] sqc = { 15, 14, 7, 8, 9, 21, 17, 3, 4, 5, 6, 19};
		Set<Integer> sqcSet = new TreeSet<Integer>();
		for (Integer set : sqc) {
			sqcSet.add(set);
		}
		int lsqc = 1;
		for (int i : sqc) {
			if (!sqcSet.contains(i - 1)) {
				int len = 1;
				while (sqcSet.contains(i + len)) {
					len++;
				}
				lsqc = Math.max(lsqc, len);
			}
		}
		System.out.println(lsqc);
		Object[] lcs = sqcSet.toArray();
		for (int i = 0; i < lsqc; i++) {
			System.out.print(lcs[i] + " ");
		}
	}
}

class LongestIncreasingSubsqcV1 {

	public static void main(String[] args) {
		int[] a = { 5, 6, 2, 3, 4, 1, 9, 9, 8, 9, 5 };
		int[] sqc = new int[a.length + 1];
		int i, j, max = 0;
		for (i = 0; i < a.length; i++)
			sqc[i] = 1;
		for (i = a.length - 1; i >= 0; i--) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] < a[j] && sqc[i] < sqc[j] + 1)
					sqc[i] = sqc[j] + 1;
			}
		}
		for (i = 0; i < a.length; i++) {
			if (max < sqc[i]) {
				max = sqc[i];
			}
		}
		System.out.println(max);
	}
}
