package com.java.stringHandling;

public class AnagramUsingLoopOnly {

	public static void main(String[] args) {
		String str1 = "Brag";
		String str2 = "Grab";

		char arr1 = 0, arr2 = 0;

		// Converting both the string to lower case.
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Checking for the length of strings
		if (str1.length() != str2.length()) {
			System.out.println("Both the strings are not anagram");
		} else {
			// Converting both the arrays to character array
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();

			for (int k = 0; k < string1.length; k++) {

				for (int l = k + 1; l < string1.length; l++) {

					char temp = 0;
					if (string1[k] > string1[l]) {
						temp = string1[k];
						string1[k] = string1[l];
						string1[l] = temp;

					}
				}
				arr1 = string1[k];
				System.out.print(string1[k]);
			}

			System.out.print(", ");

			for (int m = 0; m < string2.length; m++) {

				for (int n = m + 1; n < string2.length; n++) {

					char temp = 0;
					if (string2[m] > string2[n]) {
						temp = string2[m];
						string2[m] = string2[n];
						string2[n] = temp;

					}
				}
				arr2 = string2[m];

				System.out.print(string2[m]);
			}
			System.out.println();

			if (arr1 == arr2) {
				System.out.println("Both the strings are anagram");
			} else {
				System.out.println("Both the strings are not anagram");
			}
		}

	}

}
