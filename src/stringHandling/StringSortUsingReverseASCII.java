package stringHandling;

public class StringSortUsingReverseASCII {

	// Function to sort the string based
	// on their ASCII values
	static void sortString(String s) {
		int N = s.length();

		// Stores the frequency of each
		// character of the string
		int[] freq = new int[256];
		for (int i = 0; i < 256; i++) {
			freq[i] = 0;
		}

		// Count and store the frequency
		for (int i = 0; i < N; i++) {
			char character = s.charAt(i);
			int val = (int) character;
			freq[val]++;
		}

		// Store the result
		for (int i = 0; i < 256; i++) {
			for (int j = 0; j < freq[i]; j++)
				/* s = s + (char) i; */

				System.out.print((char) i);

		}

	}

	// Driver Code
	public static void main(String[] args) {
		String S = "Es%234#thsy6";
		sortString(S);
	}

}
