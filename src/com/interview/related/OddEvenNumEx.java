package com.interview.related;

import java.util.ArrayList;
import java.util.List;

public class OddEvenNumEx {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}

	}

}

class separateOddEvenStoreToList {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			/*
			 * if(!li.contains(a[i])){ li.add(a[i]); }
			 */
			if (a[i] % 2 == 0) {
				li.add(a[i]);
			}
		}
		for (int out : li) {
			System.out.print(out + " ");
		}
	}
}
