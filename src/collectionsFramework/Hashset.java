package collectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		set.add("One");
		set.add("two");
		set.add("three");
		set.add("three");
		set.add(null);
		set.add(null);

		// Using Iterator
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);

			// Using for each

			for (String ele : set) {

				System.out.println(ele);
			}

			// Converting to Array to use for loop based on Index

			Object[] array = set.toArray();
			for (int i = 0; i < array.length; i++) {

				System.out.println(array[i]);
			}
		}
	}

}
