package com.java.stringHandling;

import java.util.Scanner;

public class SumAllStringDigits {
	
	

	public static void main(String[] args) {
		
		char string[] = {80};
		int count, nc = 0, sum = 0;
		
		Scanner input = new Scanner(System.in);
		String next = input.next();
		
	    for (count = 0; string[count] != '\0'; count++)

	    {

	        if ((string[count] >= '0') && (string[count] <= '9'))

	        {

	            nc += 1;

	            sum += (string[count] - '0');

	        }

	    }

	}

}
