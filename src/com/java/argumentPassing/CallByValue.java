package com.java.argumentPassing;

//Simple types are passed by value.
class Test {

	void math(int i, int j) {
		i *= 2;
		j /= 2;
	}
}

 class CallByValue {

	public static void main(String[] args) {
		Test ob = new Test();
		int a = 15, b = 20;
		System.out.println("a and b before routine call: " + a + " " + b);
		ob.math(a, b);
		System.out.println("a and b after routine call: " + a + " " + b);

	}

}
