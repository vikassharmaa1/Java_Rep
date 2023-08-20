package com.java.arrayHandling;

public class FirstnPrime {

	public static void main(String[] args) {
		int i, j;
		boolean prime = true;

		for (i = 1; i <= 100; i++) {
			prime = true;

			for (j = 2; j < i && prime == true; j++) {
				if (i % j == 0) {
					prime = false;
				}
			}
			if (prime == true) {
				System.out.print(i + "\t");
			}
		}

	}

}
