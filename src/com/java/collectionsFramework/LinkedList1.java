package com.java.collectionsFramework;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("ketan");
		al.add("Manoj");

		ListIterator<String> iterator = al.listIterator();
		System.out.println("Original LinkedList");
		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}
		System.out.println("Reversed LinkedList");
		while (iterator.hasPrevious()) {

			System.out.println(iterator.previous());
		}

	}

}
