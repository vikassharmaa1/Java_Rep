package com.interview.related;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class StringToSetToMap {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		Set<Integer> s = new LinkedHashSet<>();
		for (Integer c : a) {
			s.add(c);
		}
		Map<Integer, String> m = new LinkedHashMap<>();
		for (Integer i : s) {
			m.put(i, "Set to Map");
		}
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}