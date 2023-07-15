package com.interview.related;

public class NumberOfOccurencesAllChar {
	//static final int MAX_CHAR = 256;

	public static void main(String args[]) {
		 String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		//String str = "aabbbcccc";
		// creating an array of size 256 (ASCII_SIZE)
		int count[] = new int[256];
		// initialize count array index
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
		// create an array of given String size
		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			int search = 0;
			for (int j = 0; j <= i; j++) {
				// if any matches found
				if (str.charAt(i) == ch[j])
					search++;
			}
			if (search == 1)
				// prints occurrence of the character
				// System.out.println("The occurrence of " + str.charAt(i) + " is: " +
				// count[str.charAt(i)]);
				System.out.println(str.charAt(i) + ":" + count[str.charAt(i)]);
		}
	}

}
