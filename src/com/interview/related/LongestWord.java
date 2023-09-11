package com.interview.related;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

//longest word made of other words in a string array of words

class LengthComparator implements Comparator<String> {
	public int compare(String o1, String o2) {
		if (o1.length() < o2.length()) {
			return -1;
		} else if (o1.length() > o2.length()) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class LongestWord {
	static String getLongestWord(String[] list) {
		HashMap<String, Boolean> map = new HashMap<String, Boolean>();
		for (String str : list) {
			map.put(str, true);
		}
		Arrays.sort(list, new LengthComparator());
		//System.out.println(Arrays.toString(list));
		for (String s : list) {
			if (canBuildWord(s, true, map)==false) {
				System.out.println(s);
				return s;
			}

		}
		return "";

	}

	static boolean canBuildWord(String str, boolean isOriginalWord, HashMap<String, Boolean> map) {
		if (map.containsKey(str) && !isOriginalWord) {
			return map.get(str);

		}
		for (int i = 1; i < str.length(); i++) {
			String left = str.substring(0, i);
			String right = str.substring(i);
			if (map.containsKey(left) && map.get(left) == true && canBuildWord(right, false, map)) {
				return true;

			}

		}
		map.put(str, false);
		return false;
	}

	public static void main(String[] args) {
		String[] list = { "Vikas", "Kumaresan", "Ramani", "Gomthi", "Magesh", "Leela", "Suresh", "Reddy" };
		String longestWord = getLongestWord(list);
		System.out.println(longestWord);
	}

}
