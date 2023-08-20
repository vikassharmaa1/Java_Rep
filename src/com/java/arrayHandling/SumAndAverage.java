package com.java.arrayHandling;

public class SumAndAverage {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int i, sum = 0;
		float average;
		int n = a.length;
		for (i = 0; i < n; i++) {

			sum = sum + a[i];
		}
		System.out.println("Sum:" + sum);
		average = (float) sum / n;
		System.out.println("Average:" + average);

	}

}
