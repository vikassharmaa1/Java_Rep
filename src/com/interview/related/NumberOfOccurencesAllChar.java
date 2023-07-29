package com.interview.related;

import java.util.Arrays;
import java.util.Collections;

public class NumberOfOccurencesAllChar {
	static final int MAX_CHAR = 256;

	public static void main(String args[]) {
		String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";		
		str = str.toLowerCase();
		int i;
		int[] count = new int[MAX_CHAR];
		// initialize count array index
		for (i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		// create an array of given String size
		char ch[] = new char[str.length()];
		
		for (i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			int search = 0;
			for (int j = 0; j <= i; j++) {
				// if any matches found
				if (str.charAt(i) == ch[j])
					search++;
			}
			
			if (search == 1) {
				if (str.charAt(i) != ' ') {
					System.out.println(str.charAt(i) + "=" + count[str.charAt(i)]);	

				}
			}
		}
	}
}
