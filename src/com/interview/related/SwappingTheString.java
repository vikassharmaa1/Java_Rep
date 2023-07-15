package com.interview.related;

public class SwappingTheString {	
	   public static void main(String args[]) {
	       String s ="Kumar";
	       String s1 = "Vikas";
	       s = s+s1;
	       s1=s.substring(0, s.length()-s1.length());
	       s=s.substring(s1.length());
	       System.out.println("s= "+s);
	       System.out.println("s1= "+s1);
	    }
	}


