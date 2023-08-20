package com.interview.related;

public class PalindromicSubstrings {
	public static boolean palindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
			//System.out.println(s);
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
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		String s = "gsishijmadamcivicracecar";
		isPalindromeString(s);
	}
}
