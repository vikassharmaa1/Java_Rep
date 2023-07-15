package com.interview.related;

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
