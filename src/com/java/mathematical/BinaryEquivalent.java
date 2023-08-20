package com.java.mathematical;

public class BinaryEquivalent {

	public void decimalBinary(int n) {
		int bin[] = new int[40];
		int index = 0;

		while (n > 0) {
			bin[index++] = n % 2;
			n = n / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(bin[i]);
		}
	}

	public static void main(String[] args) {
		BinaryEquivalent obj = new BinaryEquivalent();
		System.out.println("\nBinaryEquivalent of 7: ");
		obj.decimalBinary(17);
		System.out.println("\nBinaryEquivalent of 9: ");
		obj.decimalBinary(19);

	}

}
