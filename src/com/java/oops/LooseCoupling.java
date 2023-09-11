package com.java.oops;

interface parent {
	void foo();
}

class C implements parent {	
	C(int x, int y) {
	}
	public void foo() {
		System.out.println("Inside the foo method of base class.");
	}
}

class D implements parent {
	public void foo() {
		System.out.println("Inside the foo method of derived class.");
	}
}

public class LooseCoupling {
	public static void main(String[] args) {		
		D obj = new D();
		obj.foo();
	}
}
