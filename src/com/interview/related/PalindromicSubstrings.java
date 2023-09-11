package com.interview.related;

public class PalindromicSubstrings {
	public static boolean palindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void isPalindromeString(String s) {
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String ss = s.substring(i, j);
				if (palindrome(ss)) {
					if (ss.length() > 2) {
						System.out.println(ss);
						// i=j;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		String s = "civiclevelracecar";
		isPalindromeString(s);
	}
}

class PalindromicSubstringsV1 {
	public static void isPalindromeString(String s) {
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String ss = s.substring(i, j);
				if (ss.equals(new StringBuilder(ss).reverse().toString())) {
					if (ss.length() > 2) {
						System.out.println(ss);
						//i=j;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		String s = "civiclevelracecar";
		isPalindromeString(s);
	}
}
