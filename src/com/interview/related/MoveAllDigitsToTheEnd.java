package com.interview.related;

public class MoveAllDigitsToTheEnd {
	public static void main(String[] args) {
		String a = "a2%b3&c!4";
		String alp = "";
		String num = "";
		String special = "";
		for (int i = 0; i < a.length(); i++) {
			if (Character.isAlphabetic(a.charAt(i))) {
				alp += a.charAt(i);
			} else if (Character.isDigit(a.charAt(i))) {
				num += a.charAt(i);
			} else {
				special += a.charAt(i);

			}
		}
		System.out.println(alp + special + num);
	}

}
