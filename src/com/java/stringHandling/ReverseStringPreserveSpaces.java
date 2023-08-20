package com.java.stringHandling;

public class ReverseStringPreserveSpaces {
	static void rString(String str) {
		// Converting inputString to char array 'inputStringArray'

		char[] arr = str.toCharArray();

		// Defining a new char array 'resultArray' with same size as inputStringArray

		char[] arr1 = new char[arr.length];

		// First for loop :
		// For every space in the 'inputStringArray',
		// we insert spaces in the 'resultArray' at the corresponding positions

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				arr1[i] = ' ';
			}
		}

		// Initializing 'j' with length of resultArray

		int j = arr1.length - 1;

		// Second for loop :
		// we copy every non-space character of inputStringArray
		// from first to last at 'j' position of resultArray

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				// If resultArray already has space at index j then decrementing 'j'

				if (arr1[j] == ' ') {
					j--;
				}

				arr1[j] = arr[i];

				j--;
			}
		}

		System.out.println(str + " ---> " + String.valueOf(arr1));
	}

	public static void main(String[] args) {
		rString("I Am Not String");

		rString("JAVA JSP ANDROID");

		rString("1 22 333 4444 55555");
	}

}
