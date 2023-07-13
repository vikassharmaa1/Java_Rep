package com.interview.related;

public class NumberOfOccurencesAllChar {

	static final int MAX_CHAR = 256;

	static void getOccuringChar(String str) {
		// creating an array of size 256 (ASCII_SIZE)
		int count[] = new int[MAX_CHAR];
		// finds the length of the string
		int length = str.length();
		// initialize count array index
		for (int i = 0; i < length; i++)
			count[str.charAt(i)]++;
		// create an array of given String size
		char ch[] = new char[str.length()];
		for (int i = 0; i < length; i++) {
			ch[i] = str.charAt(i);
			int search = 0;
			for (int j = 0; j <= i; j++) {
				// if any matches found
				if (str.charAt(i) == ch[j])
					search++;
			}
			if (search == 1)
				// prints occurrence of the character
				System.out.println("The occurrence of " + str.charAt(i) + " is: " + count[str.charAt(i)]);
		}
	}

	// driver Code
	public static void main(String args[]) {
		String str = "Pneumonoultramicroscopicsilicovolcanoconiosis"; // lung disease
		// function calling
		getOccuringChar(str);
	}
}
