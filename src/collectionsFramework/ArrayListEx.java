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
		while(Iterator.hasNext())
		{
			String next = Iterator.next();
		}
		
		for(String next:myList)
		{
			
		}
		for(int i=0;i<myList.size();i++)
		{
			String next = myList.get(i);
		}

	}

}
