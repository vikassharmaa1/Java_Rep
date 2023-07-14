package collectionsFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListInt {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>(5);
		myList.add(1);
		myList.add(3);
		myList.add(4);
		myList.add(7);
		myList.add(7);

		ListIterator<Integer> Iterator = myList.listIterator();

		// Print Array list Using listIterator

		while (Iterator.hasNext()) {
			int next = Iterator.next();
			System.out.print(next);
		}
		    System.out.println();
		    
		// Print Array list Using Enhanced for Loop

		for (int next : myList) {
			System.out.print(next);

		}
		
		    System.out.println();
		// Print Array list Using for Loop

		for (int i = 0; i < myList.size(); i++) {
			int next = myList.get(i);
			System.out.print(next);
		}

	}

}
