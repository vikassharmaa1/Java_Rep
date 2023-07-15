package com.interview.related;

import java.util.*;

public class RemoveDuplicateElementsArray {
	public static void main(String[] args) {
		int[] a = { 11, 13, 17, 21, 11, 21, 77, 56, 56 };
		Set<Integer> s = new LinkedHashSet<>();
		for (int b : a) {
			s.add(b);
		}
		List<Integer> li = new ArrayList<>();
		for (int out : s) {
			li.add(out);
		}
		System.out.print(li + " ");
	}
}

// Program to remove duplicates using ArrayList
class RemoveDuplicateEleArray {
	public static void main(String[] args) {
		int[] a = { 10, 20, 40, 20, 80, 40, 77, 44, 66, 66 };
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (!li.contains(a[i])) {
				li.add(a[i]);
			}
		}
		System.out.print(li);
	}
}
