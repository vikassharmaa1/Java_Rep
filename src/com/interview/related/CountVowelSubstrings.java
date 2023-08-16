package com.interview.related;

import java.util.HashSet;
import java.util.Set;

public class CountVowelSubstrings {
	public static void main(String args[]) {
		String s = "jhakjksaeiouu";
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				char c = s.charAt(j);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					set.add(c);
				} else {
					break;
				}
				if (set.size() == 5) {
					System.out.print(s.substring(i, j + 1) + " ");
				}
			}
			set.clear();
		}
	}
}

