package com.interview.related;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str = "IndiaindiaA";
		if (str == null || str.isEmpty()) {
			throw new IllegalArgumentException("Empty Or Null String");
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j) && i != j) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(ch);
			}
		}
		System.out.println(Character.MIN_VALUE);
	}
}
