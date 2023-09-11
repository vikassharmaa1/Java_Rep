package com.interview.related;

public class PalindromePermutation {

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			/*
			 * while (s.charAt(i) == ' ') { i++; } while (s.charAt(j) == ' ') { j--; }
			 */
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			} else {
				i++;
				j--;
				return true;
			}
		}
		return false;
	}

	static void permuteAndPrint(String str) {
		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("Empty or Null String");
		}
		permutationPalindrome("", str);
	}

	static void permutationPalindrome(String prefix, String str) {
	
		if (str.length() == 0) {
			if (prefix.equalsIgnoreCase(new StringBuilder(prefix).reverse().toString())) {
				// if (isPalindrome(prefix)) {
				System.out.println(prefix);
			}
		} else {			
				for (int i = 0; i < str.length(); i++) {					
					permutationPalindrome(prefix + str.charAt(i),
							str.substring(i + 1, str.length()) + str.substring(0, i));
				}
			}
		}
	

	public static void main(String[] args) {
		String s = "Tact Cao";
		permuteAndPrint(s);
	}
}
