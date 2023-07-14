package stringHandling;

import java.util.Scanner;

public class ReverseWordByWord {

	public static String rString(String str) {
		String[] words = str.split("\\s");

		String str1 = "";

		for (int i = words.length - 1; i >= 0; i--) {
			str1 = str1 + words[i] + " ";
		}

		return str1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Input String :");

		String str = sc.nextLine();

		String str1 = rString(str);

		System.out.println("Input String : " + str);

		System.out.println("Output String : " + str1);

		sc.close();
	}
}
