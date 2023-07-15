package com.interview.related;

public class RemoveSpecialCharacterEx {

	public static void main(String[] args) {
		String str = "This#string%contains^special*characters&.";
		str = str.replaceAll("[^a-zA-Z]", " ");
		System.out.println(str);
		
		//print with spacing between chars
		str=String.join(" ", str.split(""));
		System.out.println(str);
	}

}
