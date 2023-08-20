package com.java.arrayHandling;

public class Union {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };

		int[] array2 = { 3, 4, 5 };

		Union ui = new Union();
		int[] intersection = ui.getIntersection(array1, array2);
		System.out.println(intersection);
		
		int[] union = ui.getUnion(array1, array2);
		
		System.out.println(union);

	}

	public int[] getIntersection(int[] arrayOne, int[] arrayTwo) {

		int[] array1 = { 1, 2, 3 };

		int[] array2 = { 3, 4, 5 };

		for (int i = 0; i < array1.length; i++) {

			for (int t = 0; t < array2.length; t++) {

				if (array1[i] == array2[t]) {

				}

			}

		}

		return array1;

	}

	public int[] getUnion(int[] arrayOne, int[] arrayTwo) {

		int[] array1 = { 1, 2, 3 };

		int[] array2 = { 3, 4, 5 };

		for (int i = 0; i < array1.length; i++) {

			for (int t = 0; t < array2.length; t++) {

			}

		}
return array1;
	}

}