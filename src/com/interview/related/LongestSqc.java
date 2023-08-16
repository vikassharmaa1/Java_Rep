package com.interview.related;

import java.util.Set;
import java.util.TreeSet;

public class LongestSqc {

	public static void main(String[] args) {
		int[] sqc = { 15, 14, 7, 8, 9, 21, 17, 3, 4, 5, 6, 19 };
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
		System.out.println("");
		System.out.println(lsqc);
	}
}
