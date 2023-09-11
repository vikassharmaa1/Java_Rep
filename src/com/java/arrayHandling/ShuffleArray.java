package com.java.arrayHandling;

public class ShuffleArray {

	public static void main(String[] args) {
		int n = 4;
		int a[] = { 1, 3, 5, 7, 2, 4, 6, 8 };
		for (int i = 0, q = 1, k = n; i < n; i++, k++, q++) {
			for (int j = k; j > i + q; j--) {
				int tmp = a[j - 1];
				a[j - 1] = a[j];
				a[j] = tmp;
			}
		}
		for (int i = 0; i < 2 * n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}



 class ShuffleString {
	public static void main(String[] args) {		
		String str = "HelloWorld";
		char[] ch = str.toCharArray();
		int n = str.length()/2;
		for (int i = 0, q = 1, k = n; i < n; i++, k++, q++) {
			for (int j = k; j > i + q; j--) {
				char tmp = ch[j - 1];
				ch[j - 1] = ch[j];
				ch[j] = tmp;
			}
		}
		for (int i = 0; i < 2 * n; i++) {
			System.out.print(ch[i] + " ");
		}
	}
}
