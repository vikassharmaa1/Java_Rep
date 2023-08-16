package com.interview.related;

import java.util.*;
import java.util.Map.Entry;

public class RepeatedOccurenceDuplicateCharsOnly {

	public static void main(String[] args) {

		String abc = "aaaabbbccwertyu";

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

		for (int i = 0; i < abc.length(); i++) {
			if (hs.containsKey(abc.charAt(i))) {
				int count = hs.get(abc.charAt(i));

				hs.put(abc.charAt(i), count + 1);
			} else {
				hs.put(abc.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
			if (entry.getValue() >= 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}
}

class IIndLargestRepeatedOccurenceDuplicateCharV1 {

	public static void main(String args[]) {

		String abc = "aaaabbbcc";

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

		for (int i = 0; i < abc.length(); i++) {
			if (hs.containsKey(abc.charAt(i))) {
				int count = hs.get(abc.charAt(i));

				hs.put(abc.charAt(i), count + 1);
			} else {
				hs.put(abc.charAt(i), 1);
			}
		}
		Object[] ob = hs.values().toArray();
		Arrays.sort(ob, Collections.reverseOrder());
		for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
			if (entry.getValue() == ob[1]) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}
}

class MinAndMaxRepeatedOccurenceDuplicateCharV2 {

	public static void main(String args[]) {

		String abc = "aaaabbbcc";

		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		for (int i = 0; i < abc.length(); i++) {
			if (tm.containsKey(abc.charAt(i))) {
				int count = tm.get(abc.charAt(i));
				tm.put(abc.charAt(i), count + 1);
			} else {
				tm.put(abc.charAt(i), 1);
			}
		}
		Object[] ob = tm.values().toArray();
		Arrays.sort(ob, Collections.reverseOrder());
		for (Map.Entry<Character, Integer> entry : tm.entrySet()) {
			if (entry.getValue() == ob[0]) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			if (entry.getValue() == ob[ob.length - 1]) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}

	}

}
