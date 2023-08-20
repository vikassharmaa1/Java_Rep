package com.interview.related;

import java.util.Arrays;

public class CheckPermutation {
	static String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}

	public static void main(String[] args) {
		String s1 = "course";
		String s2 = "rseouc";
		System.out.println("Ques: Is s2 a permutation of s1 ? " + "\nAns: " + permutation(s1, s2));
	}
}

class CheckPermutationV1 {

	static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		int[] letters = new int[128];   //Assumption
		char[] ch = s.toCharArray();
		for (char c : ch) {
			letters[c]++;		// count number of each character in s.	
		}

		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
			if (letters[c] < 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "course";
		String s2 = "rseouc";
		System.out.println("Ques: Is s2 a permutation of s1 ? " + "\nAns: " + permutation(s1, s2));
	}
}
