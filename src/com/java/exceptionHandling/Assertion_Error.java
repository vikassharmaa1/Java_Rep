package com.java.exceptionHandling;

public class Assertion_Error {

	public static void main(String[] args) {
		int age = 11;
		assert age >= 18 : " Not valid";
		System.out.println("Age is " + age);
	}
}
