package com.interview.related;

class ImmutableString {
	public static void main(String args[]) {

		String str1 = "Java";
		String str2 = "With Selenium";
		System.out.println("Before concatenation: " + str1);
		str1.concat(str2);
		System.out.print("After concatenation: " + str1);

		/*
		 * StringBuffer string = new StringBuffer("firstName"); StringBuffer string1 =
		 * new StringBuffer("lastName"); string.append(string1);
		 * System.out.print(string);
		 */

	}
}
