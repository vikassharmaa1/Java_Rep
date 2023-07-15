package com.interview.related;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringIterationUsingMap {
	public static void main(String[] args) {
		Map<String, Integer> m = new LinkedHashMap<>();
		m.put("Potatoes", 30);
		m.put("Tomatoes", 20);
		m.put("Onion", 10);
		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
