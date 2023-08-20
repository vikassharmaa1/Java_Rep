package com.java.collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Formatter;
import java.util.Iterator;

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

@SuppressWarnings("rawtypes")
class NameComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		return s1.name.compareTo(s2.name);
	}
}

@SuppressWarnings("rawtypes")
class AgeComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

public class SortingByNameOrAge {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {

		ArrayList al = new ArrayList();
		al.add(new Student(101, "Robert", 23));
		al.add(new Student(106, "Kyle", 27));
		al.add(new Student(105, "Margaret", 21));

		System.out.println("Sorting by Name");
		System.out.println("============================================");
		Formatter fmt = new Formatter();
		fmt.format("%15s%15s%15s\n", "Roll#", "Name ", "Age ");
		Collections.sort(al, new NameComparator());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			fmt.format("%14s%14s%14s\n", st.rollno, st.name, st.age);
		}
		System.out.println(fmt);

		System.out.println("\nSorting by Age");
		System.out.println("============================================");
		Formatter fmt1 = new Formatter();
		fmt1.format("%15s%15s%15s\n", "Roll#", "Name ", "Age ");
		Collections.sort(al, new AgeComparator());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			fmt1.format("%14s%14s%14s\n", st.rollno, st.name, st.age);
		}
		System.out.println(fmt1);		
	}
}
