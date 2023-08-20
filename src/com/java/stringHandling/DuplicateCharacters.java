package com.java.stringHandling;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose";
		int count;

		// Converts the string into lowercase
		string = string.toLowerCase();
		char[] chars = string.toCharArray();

		System.out.println("Duplicate characters and their count in a given string : ");
		for (int i = 0; i < chars.length; i++) {
			count = 1;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					count++;
					// Set words[j] to 0 to avoid printing visited word
					chars[j] = '0';
				}
			}

			// Displays the duplicate word if count is greater than 1
			if (count > 1) {
				if (chars[i] != '0') {
					System.out.println(chars[i] + ":" + count);

				}

			}
			
		}System.out.println("Most repeated- char: " + chars[0]);
	}
}
