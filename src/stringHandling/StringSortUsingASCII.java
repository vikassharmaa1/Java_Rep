package stringHandling;

class StringSortUsingASCII {

	static void sorting(String str) {
		
		int[] occur = new int[256];			

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int j = (int) ch;
			occur[j]++;
		}

		for (int i = 0; i < 256; i++) {
			for (int k = 0; k < occur[i]; k++)
				// s = s + (char)i;
				System.out.print((char) i);
		}
	}

	public static void main(String[] args) {
		String string = "Es%234#thsy6";
		sorting(string);
	}
}