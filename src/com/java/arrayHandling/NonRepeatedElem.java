package com.java.arrayHandling;

public class NonRepeatedElem {

	public static void main(String[] args) {
		int i, j, flag = 0, count = 0;
		int a[] = { 3, 4, 1, 3, 1, 7, 2, 2, 4 };

		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				if (i != j) {
					if (a[i] != a[j]) {
						flag = 1;
					} else {
						flag = 0;
						break;
					}
				}
			}
			if (flag == 1) {
				count++;
				System.out.print("Non repeated elements are:" + a[i] + " ");
			}
		}
		System.out.println("");
		System.out.println("Number of non repeated elements are:" + count);
	}
}