package com.java.mathematical;

import java.util.Scanner;

public class primeNaive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if (n < 2) {
			System.out.println("Not a prime");
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("Not a prime");
			} else {

				System.out.println("Prime");
			}

		}

	}

}

class isPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if (n < 2) {
			System.out.println("Not a prime Number");
		}
		int sqrt = (int) Math.sqrt(n);
		for (int i = 2; i <= sqrt; i++) {
			if (n % i == 0) {
				System.out.println("Not a prime Number");
			} else {

				System.out.println("prime Number");
			}

		}

	}

}
