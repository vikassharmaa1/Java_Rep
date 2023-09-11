package com.interview.related;

public class EquilibriumIndex {
	public static int equilibrium(int[] a) {		
		int sum = 0, lSum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];			
		}
		//System.out.println(sum);
		for (int i = 0; i < a.length; i++) {
			sum -= a[i];
			//System.out.println(sum);
			if (lSum == sum) {
				return i;
			}
			lSum += a[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = { -7, 1, 5, 2, -4, 3, 0 };
		System.out.println(equilibrium(a));
	}

}
