package com.interview.related;

import java.util.Scanner;

public class Palindrome_1 {
	public static void main(String args[]) {
		int a = 56765;
		int r = a;
		int out = 0;
		while (a > 0) {
			int b = a / 10;
			int c = a % 10;
			out = c + (out * 10);
			a = b;
		}
		if (out == r) {
			System.out.println("Given Number is Palindrome");
		} else {
			System.out.println("Given Number is not an Palindrome");
		}
	}
}

class Palindrome_2 {
	public static void main(String args[]) {
		String s = "Abba";
		String s1 = s;
		String out = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			out += s.charAt(i);
		}
		if (out.equals(s1)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not an Palindrome");
		}
	}
}

class Palindrome_3 {

	public static void main(String args[]) {
		String inputString;
		Scanner in = new Scanner(System.in);
		System.out.println("Input a string");
		inputString = in.nextLine();
		int length = inputString.length();
		int i, begin, end, middle;
		begin = 0;
		end = length - 1;
		middle = (begin + end) / 2;

		for (i = begin; i <= middle; i++) {
			if (inputString.charAt(begin) == inputString.charAt(end)) {
				begin++;
				end--;
			} else {
				break;
			}
		}
		if (i == middle + 1) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
