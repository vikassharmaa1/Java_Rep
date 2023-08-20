package com.java.arrayHandling;

public class Floor_Ceiling_Ex {

	public int floorSearch(int a[], int low, int high, int x) {
		if (low > high) {
			return low;
		}
		int mid = (low + high) / 2;
		if (a[mid] > x) {
			return floorSearch(a, low, mid - 1, x);
		} else if (a[mid] < x) {
			return floorSearch(a, mid + 1, high, x);
		} else {
			return mid;
		}
	}

	public int ceilSearch(int a[], int low, int high, int x) {
		if (low > high) {
			return high;
		}
		int mid = (low + high) / 2;
		if (a[mid] > x) {
			return ceilSearch(a, low, mid - 1, x);
		} else if (a[mid] < x) {
			return ceilSearch(a, mid + 1, high, x);
		} else {
			return mid;
		}
	}

}
