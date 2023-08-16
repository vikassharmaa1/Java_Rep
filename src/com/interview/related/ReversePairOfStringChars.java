package com.interview.related;

public class ReversePairOfStringChars {
	public static void main(String args[]) {
		String str = "VikasSharma";
		String fChar = "";
		String sChar = "";
		String rStr = "";
		for (int i = 0; i < str.length() - 1; i += 2) {

			fChar = str.substring(i, i + 1);
			sChar = str.substring(i + 1, i + 2);
			rStr += sChar + fChar;

		}
		if (str.length() % 2 == 1)
			rStr += str.substring(str.length() - 1, str.length());
		System.out.println(rStr);
	}
}

class ReversePairOfStringCharsV1 {
	public static void main(String args[]) {

		String str = "HeLloJava";
		String out = "";
		for (int i = 0; i < str.length(); i += 2) {
			if (i + 1 < str.length()) {
				out += str.charAt(i + 1);
			}
			out += str.charAt(i);
		}
		System.out.print(out);
	}
}

class ReversePairOfStringCharsV2 {
	public static void main(String args[]) {
		String str = "HeLloJava";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length-1; i += 2) {
			char c = ch[i];
			ch[i] = ch[i + 1];
			ch[i + 1] = c;
		}
		System.out.println(String.valueOf(ch));
	}
}




