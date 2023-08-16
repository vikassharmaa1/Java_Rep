package com.interview.related;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsNumSubsequence {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 7, 8, 9, 10, 11, 12, 13 };
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && (arr[i] == arr[i - 1] + 1)) {
				count++;
			} else if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			} else {
				count = 1;
			}
		}
		System.out.println(count);
	}
}

final class Sequences {

	private Sequences() {
		throw new AssertionError("Cannot be instantiated");
	}

	public static int findLongestConsecutive(int[] sequence) {

		if (sequence == null) {
			throw new IllegalArgumentException("The given sequence cannot be empty");
		}
		Set<Integer> sequenceSet = new HashSet<Integer>();
		for (Integer set : sequence) {
			sequenceSet.add(set);
		}

		int longestSequence = 1;

		for (int elem : sequence) {

			// if 'elem-1' is not in the set then start a new sequence
			if (!sequenceSet.contains(elem - 1)) {

				int sequenceLength = 1;

				// lookup in the set for elements 'elem + 1', 'elem + 2', 'elem + 3' ...
				while (sequenceSet.contains(elem + sequenceLength)) {
					sequenceLength++;
				}
				// update the longest consecutive subsequence
				longestSequence = Math.max(longestSequence, sequenceLength);
			}
		}

		return longestSequence;
	}

	public static class Main {

		public static void main(String[] args) {

			int[] sequence = { 15, 14, 7, 8, 9, 21, 17, 3, 4, 5, 6, 19 };

			int longestSequence = Sequences.findLongestConsecutive(sequence);
			System.out.println("Longest sequence has " + longestSequence + " element(s)");

		}
	}

}
