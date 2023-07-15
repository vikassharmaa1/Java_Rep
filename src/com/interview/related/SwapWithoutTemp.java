package com.interview.related;

public class SwapWithoutTemp {

	public static void main(String[] args) {		
		// Swap Strings
		String s1 = "Hello";
		String s2 = "Java";
		System.out.println("Before Swapping :" + "s1 = " + s1 + ", " + "s2 = " + s2);
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After Swapping :" + "s1 = " + s1 + ", " + "s2 = " + s2);

		// Swap Numbers
		int x = 10;
		int y = 5;
		System.out.println("Before Swapping :" + "x = " + x + ", " + "y = " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping:" + " x = " + x + ", " + "y = " + y);
	}
}
