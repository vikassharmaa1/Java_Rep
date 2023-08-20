package com.java.arrayHandling;

public class LargestTwo {

	public static void main(String[] args) {
		int i, j, n, temp;
		int a[] = { 1, 12, 13, 14, 15, 16, 21, 3, 4, 5, 6 };
		n = a.length;

		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Largest two numbers are:" + a[0] + " and " + a[1]);

		
		{

			System.out.println("Enter number greater than 1");
		}

	}
}
