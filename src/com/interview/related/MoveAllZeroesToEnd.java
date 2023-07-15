package com.interview.related;

public class MoveAllZeroesToEnd {
	public static void main(String args[]) {
		int ele[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int count = 0;

		// loops through the elements i in ele array and assigns (ele[i] Or value at index i) to the ele array
		// at index count.
		for (int i = 0; i < ele.length; i++) {
			if (ele[i] != 0) {
				ele[count] = ele[i];
				count ++;				
			}
		}
		while (count < ele.length) {
			ele[count] = 0;
			count ++;
		}
		System.out.println("After appending zeroes to the end of array");
		for (int i = 0; i < ele.length; i++) {
			System.out.print(ele[i] + " ");
		}
	}
}
