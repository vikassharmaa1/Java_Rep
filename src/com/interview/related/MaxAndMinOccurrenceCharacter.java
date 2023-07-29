package com.interview.related;

public class MaxAndMinOccurrenceCharacter {
	public static void main(String[] args) {
		String str = "Grass is greener on the other side";
		str=str.toLowerCase();
		int[] occur = new int[str.length()];
		char least = str.charAt(0), most = str.charAt(0);
		int i, j, min, max;		
		char string[] = str.toCharArray();		
		for (i = 0; i < string.length; i++) {
			occur[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					occur[i]++;
					string[j] = '0';
				}
			}
		}		
		min = max = occur[0];
		for (i = 0; i < occur.length; i++) {			
			if (min > occur[i] && occur[i] != '0') {
				min = occur[i];
				least = string[i];
			}		
			if (max < occur[i]) {
				max = occur[i];
				most = string[i];
			}
		}
		System.out.println("Least repeated character: " + least+"="+min+" times.");
		System.out.println("Most repeated character: " + most+"="+max+" times.");
	}
}
