package com.interview.related;

public class UnzipAlphabets {
	// print the string in the given order String a = "a2b3c4" output = aabbbcccc

	public static void main(String args[]) {

		String a = "a2b3c4";
		for (int i = 0; i < a.length(); i++) {

			if (Character.isAlphabetic(a.charAt(i))) {
				System.out.print(a.charAt(i));

			} else {

				int b = Character.getNumericValue(a.charAt(i));
				for (int j = 1; j < b; j++) {

					System.out.print(a.charAt(i - 1));
				}
			}
		}
	}

}
