package com.interview.related;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PowerSet {
	static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index) {
		ArrayList<ArrayList<Integer>> allsubsets;
		if (set.size() == index) {
			allsubsets = new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());
		} else {
			allsubsets = getSubsets(set, index + 1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();

			for (ArrayList<Integer> subset : allsubsets) {
				ArrayList<Integer> newsubset = new ArrayList<Integer>();

				newsubset.addAll(subset);
				newsubset.add(item);
				System.out.println(newsubset);
				moresubsets.add(newsubset);
			}
			allsubsets.addAll(moresubsets);
		}
		return allsubsets;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 13, 15, 12, 19 };
		ArrayList<Integer> set = new ArrayList<>();
		for (int s : arr) {
			set.add(s);
		}

		ArrayList<ArrayList<Integer>> subsets = getSubsets(set, 0);
		Collections.sort(subsets, new Comparator<ArrayList<Integer>>() {
			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				StringBuilder temp = new StringBuilder();
				StringBuilder temp2 = new StringBuilder();
				for (Integer i2 : o1) {
					temp.append(i2);
				}
				for (Integer i2 : o2) {
					temp2.append(i2);
				}

				if (temp.length() == temp2.length())
					return Integer.parseInt(temp.toString()) - Integer.parseInt(temp2.toString());
				else
					return temp.length() - temp2.length();
			}
		});
		System.out.println(subsets);
	}
}
