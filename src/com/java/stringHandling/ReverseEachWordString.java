package com.java.stringHandling;

public class ReverseEachWordString {

	static void reverseEachWordOfString(String str) {
		String[] words = str.split(" ");
		String rString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String rWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				rWord = rWord + word.charAt(j);
			}
			rString = rString + rWord + " ";
		}
		System.out.println(str);
		System.out.println(rString+"\n");		
	}

	public static void main(String[] args) {
		reverseEachWordOfString("Java Concept Of The Day");
		reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");
		reverseEachWordOfString("I am string not reversed");
		reverseEachWordOfString("Reverse Me");
	}
}
