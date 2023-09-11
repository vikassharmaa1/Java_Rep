package com.java.constructor;

public class ThisBox {
	double width;
	double height;
	double depth;

	ThisBox(double w, double h, double d) {
		this.width = w;
		this.height = h;
		this.depth = d;
	}

	double volume() {
		return width * height * depth;
	}

	public static void main(String[] args) {
		ThisBox myBox1 = new ThisBox(5, 10, 10); // new Box() is an object or instance of class Box and it is calling the
											// Box()
											// constructor to initialize itself..
		ThisBox myBox2 = new ThisBox(15, 5, 10); // new Box() is an object or instance of class Box and it is calling the
											// Box()
											// constructor to initialize itself..
		System.out.println(myBox1.volume());
		System.out.println(myBox2.volume());
	}
}
