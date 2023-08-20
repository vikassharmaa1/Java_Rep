package com.java.moderate;

import java.util.HashMap;


//Single Query.

public class WordFrequencies {

	static int getFrequency(String[] book, String word) {
		word = word.trim().toLowerCase();
		int count = 0;
		for (String w : book) {
			if (w.trim().toLowerCase().equals(word)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] bString = { "China", "Australia", "India", "USA", "USSR", "UK", "China", "France", "Poland", "Austria",
				"India", "USA", "Egypt", "China" };
		int frequency = getFrequency(bString, "India");
		System.out.println(frequency);

	}
}

//Repetitive/Multiple Queries.

class WordFrequenciesRepQuery {

	static HashMap<String, Integer> setupDictionary(String[] book) {
		HashMap<String, Integer> table = new HashMap<String, Integer>();
		for (String word : book) {
			word = word.toLowerCase();
			if (word.trim() != "") {
				if (!table.containsKey(word)) {
					table.put(word, 0);
					//System.out.println(table);
				}
				table.put(word, table.get(word) + 1);
			}
		}
		return table;
	}

	static int getFrequency(HashMap<String, Integer> table, String word) {
		if (table == null || word == null)
			return -1;
		word = word.trim().toLowerCase();
		if (table.containsKey(word)) {
			return table.get(word);
		}
		return 0;
	}

	public static void main(String[] args) {
		String[] bString = { "China", "Australia", "India", "USA", "USSR", "UK", "China", "France", "Poland", "Austria",
				"India", "USA", "Egypt", "China" };
		HashMap<String, Integer> setupDictionary = setupDictionary(bString);
		int frequency = getFrequency(setupDictionary, "India");
		System.out.println(frequency);

	}
}