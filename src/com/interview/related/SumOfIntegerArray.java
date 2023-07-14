package com.interview.related;

import java.util.Scanner;

public class SumOfIntegerArray {

	public int sum() {

		int n, sum = 0; // initialize sum
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size of the array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.print("Enter array elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			sum = sum + a[i];
		}
		
		s.close();
		return sum;
	}

	public static void main(String[] args) {

		SumOfIntegerArray add = new SumOfIntegerArray();

		System.out.println("Sum of the array is:" + add.sum());
	}

}
