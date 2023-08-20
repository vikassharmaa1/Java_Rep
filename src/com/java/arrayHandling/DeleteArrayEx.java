package com.java.arrayHandling;

public class DeleteArrayEx {

	public static void main(String[] args) {

		int i, pos = 0, x = 4, n, flag = 0;
		int a[] = { 2, 4, 6, 8, 10, 21, 11, 9, 7, 5 };
		n = a.length;

		for (i = 0; i < n; i++) {
			if (a[i] == x) {
				flag = 1;
				pos = i;
				break;
			} else {
				flag = 0;
			}
		}
		if (flag == 1) {
			for (i = pos + 1; i < n; i++) {
				a[i - 1] = a[i];
			}
			System.out.print("After Deleting:");
			for (i = 0; i < n - 2; i++) {
				System.out.print(a[i] + ",");
				
			}
			System.out.print(a[n - 2]);
			
		} else {
			System.out.println("Element not found");

		}
	}
}
