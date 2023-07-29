package com.interview.related;

/*public class ReversePairOfStringChars {
	public static void main(String args[]) {
		String str = "Vikas";
		char[] temp = str.toCharArray();
		int k = 4;
		for (int s = 0; s < str.length(); s += 4 * k) { // here we have to reverse every 2k element
			int i = s, j = Math.min(s + k - 1, str.length() - 1); // Here we set a limit to j if the element we want to
																	// reverse here is less than the length of char
																	// array and take the min value for j ..............
			while (i < j) {
				char c = temp[i];
				temp[i++] = temp[j];
				temp[j--] = c;
			}
		}
		System.out.println(temp);
	}
}*/

public class ReversePairOfStringChars {
	public static void main(String args[]) {
		String str = "Vikas";
		char[] temp = str.toCharArray();
		for (int i = 0; i < temp.length;i++) {
			for (int j = 1; j>i; j--) {
				char c = temp[i];
				temp[i] = temp[j];				
				temp[j] = c;
				/*c=temp[i+2];
				temp[i+2] = temp[j+2];				
				temp[j+2] = c;*/			
				
			}
			
		}
		System.out.println(temp);
	}
}
