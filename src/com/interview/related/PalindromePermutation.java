package com.interview.related;

public class PalindromePermutation {

	static void permuteAndPrint(String str) {
		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("Empty or Null String");
		}
		str = str.toLowerCase().replace(" ", "");
		permutationPalindrome("", str);
	}

	static void permutationPalindrome(String prefix, String str) {
		if (str.length() == 0) {
			boolean equals = prefix.equals(new StringBuilder(prefix).reverse().toString());
			if (equals) {
				System.out.println(prefix + " is a palindrome permutation: " + equals);
			}
		} else {
			for (int i = 0; i < str.length(); i++) {
				permutationPalindrome(prefix + str.charAt(i), str.substring(i + 1, str.length()) + str.substring(0, i));
			}
		}
	}

	public static void main(String[] args) {
		String s = "CivIc";
		permuteAndPrint(s);
	}
}
