package hackerRank;

import java.util.Scanner;

public class GetSmallest_Largest_Lexicographically {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		smallest = s.substring(0, k);
		largest = s.substring(0, k);
		for (int i = 0; i <= s.length() - k; i++) {
			String str = s.substring(i, k + i);
			// 'smallest' must be the lexicographically smallest substring of length 'k'
			if (smallest.compareTo(str) > 0) {

				smallest = str;
			}
			// 'largest' must be the lexicographically largest substring of length 'k'
			if (largest.compareTo(str) < 0) {
			}
			largest = str;
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

}
