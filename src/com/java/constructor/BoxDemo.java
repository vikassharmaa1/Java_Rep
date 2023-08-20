package com.java.constructor;

class Box {

	double width;
	double height;
	double depth;

	Box(double w, double h, double d) {
		System.out.println("Constructing Box"); //to display that constructor is called to initialize object of its own class..
		this.width = w;  // this keyword is used to refer to the current object, and can also be used to resolve any name space collisions (if local variable names and instance variable names are same.)
		this.height = h;
		this.depth = d;

	}

	double volume() {
		return width * height * depth;

	}

}

public class BoxDemo {

	public static void main(String[] args) {
		Box myBox1 = new Box(5, 10, 10); //new Box() is an object or instance of class Box and it is calling the Box() constructor to initialize itself..
		Box myBox2 = new Box(15, 5, 10); //new Box() is an object or instance of class Box and it is calling the Box() constructor to initialize itself..
		System.out.println(myBox1.volume());
		System.out.println(myBox2.volume());
	}

}
