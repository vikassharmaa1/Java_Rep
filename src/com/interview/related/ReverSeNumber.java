package com.interview.related;

public class ReverSeNumber {
	public static void main(String[] args) {
		int num = 456, r = 0, sum = 0;
		while (num > 0) {
			int a = num / 10;
			int b = num % 10;
			r = b + (r * 10);
			sum += b;
			num = a;
		}
		System.out.println("Reverse of the given number: " + r);
		System.out.println("Sum Of the given number: " + sum);
	}
}
