package com.interview.related;

public class RemoveSpecialCharEx {

	public static void main(String[] args) {
		String str = "He!llo#Ja%v*a& Pr!ogr#am%m*in&g Lan?#guag(e";		
		char[] charArray = str.toCharArray();		
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 65 && charArray[i] <= 122) {
				if (charArray[i] >= 65 && charArray[i] <= 90) {
					charArray[i] = (char) (charArray[i]);
					if (i != 0) {
						System.out.print(" ");
					}
					System.out.print(charArray[i]);
				} else
					System.out.print(charArray[i]);
			}
		}
	}
}
