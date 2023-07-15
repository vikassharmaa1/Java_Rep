package com.interview.related;

public class ReverSeNumber {	
	    public static void main(String[] args) {
	        int a = 456;
	        int r = 0;
	        int sum = 0;
	        while(a>0){
	            int b = a/10; 
	            int c = a%10; 
	            r=c+(r*10); 
	            sum= sum+c;
	            a=b;
	        }
	        System.out.println("Reverse of the given number: "+r);
	        //System.out.println("Sum Of the given number: "+sum);
	    }
	}


