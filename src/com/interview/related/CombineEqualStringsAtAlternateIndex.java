package com.interview.related;

public class CombineEqualStringsAtAlternateIndex {

	private static void combineStrings(String s1, String s2) {
		String result = "";
		for (int i = 0; i < s1.length() | i < s2.length(); i++) {
			if (i < s1.length())
				result += s1.charAt(i);
			if (i < s2.length())
				result += s2.charAt(i);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		combineStrings("hello", "worldometer");
	}

}
