package com.interview.related;

public class ArmstrongNumEx {

	public static void main(String[] args) {
		int c = 0, a, temp;
		int n = 153;// It is the number to check armstrong
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c += (a * a * a);				
		}
		if (temp == c){
			System.out.println("Armstrong number");
		    
		}
		else
			System.out.println("Not an Armstrong number");

	}

}

