package com.interview.related;

import java.util.ArrayList;
import java.util.List;

public class SortStringAlphabetically_Numerically_SpecialChars {

	public static void main(String[] args) {
		String s = "He!llo#Ja%v*a& Pr!ogr#am%m*in&g Lan?#guag(e";
		String alp = "";
		String num = "";
		String spe = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				alp = alp + s.charAt(i);

			} else if (Character.isDigit(s.charAt(i))) {
				num = num + s.charAt(i);
			} else {
				spe = spe + s.charAt(i);
			}
		}
		System.out.println(alp);
	}

}

class SortStringAlphabetically_Numerically_SpecialCharsV1 {

	public static void main(String[] args) {
		String s = "He!llo#Ja%v*a&12 Pr!ogr#am%m*in456&g Lan?#gu8921ag(e";
		String letters = "", digits = "", symbols = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 122) {
				letters += s.charAt(i);
			} else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				digits += s.charAt(i);
			} else if (s.charAt(i) != ' ') {
				symbols += s.charAt(i);
			} 
		}
		System.out.println(letters + digits + symbols);
	}
}
