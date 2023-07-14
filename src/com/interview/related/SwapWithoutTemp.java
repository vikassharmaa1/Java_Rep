package com.interview.related;

import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter First String :"); String s1 = sc.next();
		 * System.out.println("Enter Second String :"); String s2 = sc.next();
		 * System.out.println("Before Swapping :"); System.out.println("s1 : " + s1);
		 * System.out.println("s2 : " + s2);
		 */
		//Swap Strings
		String s1 = "Hello";
		String s2 = "Java";
		// Swapping starts
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		// Swapping ends
		System.out.println("After Swapping :");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		// Swap Numbers
		int x = 10;
		int y = 5;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping:" + " x = " + x);
		System.out.println("After swapping:" + " y = " + y);

	}
}
