package arrayHandling;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int a[] = new int[8];
		a[0] = 25;
		a[1] = 35;
		a[2] = 45;
		a[3] = 55;
		a[4] = 65;
		int b[] = new int[3];
		b[0] = 30;
		b[1] = 25;
		b[2] = 40;
		Arrays.sort(a);
		Arrays.sort(b);
		int m = a.length, n = b.length;
		while (n > 0) {
			if (m <= 0 || a[m - 1] < b[n - 1])
				a[n + m - 1] = b[--n];
			else
				a[n + m - 1] = a[--m];
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
