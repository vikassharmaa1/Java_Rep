package arrayHandling;

import java.util.Scanner;

public class PrimeUsingScannerInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to be checked");
		int n = scan.nextInt();

		int i, flag = 0, m;
		m = n / 2;
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println("Number is not a Prime");
				flag = 1;
				break;
			}
		}
		if (flag == 0)

			System.out.println("Number is Prime");

	}

}
