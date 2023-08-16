package com.interview.related;

public class StringExpansion {
	// print the string in the given order String a = "a2b3c4" output = aabbbcccc

	public static void main(String args[]) {
		String a = "a2b3c4";
		for (int i = 0; i < a.length(); i++) {
			if (Character.isAlphabetic(a.charAt(i))) {
				System.out.print(a.charAt(i));
			} else {
				int b = Character.getNumericValue(a.charAt(i));
				System.out.println(b);
				for (int j = 1; j < b; j++) {
					System.out.print(a.charAt(i - 1));
				}
			}
		}
	}
}

// program to zip Alphabets

class StringCompression {

	public static void main(String[] args) {
		String str = "aaabbbbcca";
		String out = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (i == 0) {
				out += str.charAt(i);
				count++;
			}
			if ((i != 0) && (str.charAt(i) == str.charAt(i - 1))) {
				count++;
			} else if ((i != 0) && (str.charAt(i) != str.charAt(i - 1))) {
				out = out + count + str.charAt(i);
				count = 1;
			}
			if (i == str.length() - 1) {
				out += count;
			}
		}
		System.out.println(out);
	}
}
