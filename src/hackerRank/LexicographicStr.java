package hackerRank;

import java.util.Scanner;

public class LexicographicStr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String no. 1");
		String A = sc.next();
		System.out.println("Enter String no. 2");
		String B = sc.next();
		sc.close();
		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));

	}
}
