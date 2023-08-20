package com.java.argumentPassing;

//Objects are passed by reference.
class Test1 {
	int a, b;

	Test1(int i, int j) {
		a = i;
		b = j;
	}

	// pass an object
	void math(Test1 o) {
		o.a *= 2;
		o.b /= 2;
	}
}

class CallByReference {

	public static void main(String[] args) {
		Test1 ob = new Test1(15, 20);

		System.out.println("ob.a and ob.b before routine call: " + ob.a + " " + ob.b);
		ob.math(ob);
		System.out.println("ob.a and ob.b after routine call: " + ob.a + " " + ob.b);

	}

}
