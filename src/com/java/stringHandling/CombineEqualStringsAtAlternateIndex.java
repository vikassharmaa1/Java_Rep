package com.java.stringHandling;

public class CombineEqualStringsAtAlternateIndex {

	    public static void main(String[] args) {
	            mergeStrings("hello", "worldometer");
	    }
	 
	    private static void mergeStrings(String s1, String s2) {
	        String result = "";
	        for (int i = 0; i < s1.length() | i < s2.length(); i++) {
	            if (i < s1.length())
	                result += s1.charAt(i);
	            if (i < s2.length())
	                result += s2.charAt(i);
	        }
	        System.out.println(result);
	    }
	}
