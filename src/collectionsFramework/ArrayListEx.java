package collectionsFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("object 1");
		myList.add("object 2");
		myList.add("object 3");
		myList.add("object 4");
		myList.add("object 5");

		ListIterator<String> Iterator = myList.listIterator();

		//Print Array list Using listIterator

		while (Iterator.hasNext()) {
			String next = Iterator.next();
			System.out.println(next);
		}

		//Print Array list Using Enhanced for Loop

		for (String next : myList) {
			System.out.println(next);
		}

		//Print Array list Using for Loop

		for (int i = 0; i < myList.size(); i++) {
			String next = myList.get(i);
			System.out.println(next);
		}

	}

}
