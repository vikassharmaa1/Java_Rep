package exceptionHandling;

import java.util.*;

public class Out_Of_MemoryError {
	static List<String> ls = new ArrayList<String>();

	public static void main(String[] args) throws Exception {
		Integer[] a = new Integer[100000 * 100000];
		System.out.println(a[1000]);
	}
}
