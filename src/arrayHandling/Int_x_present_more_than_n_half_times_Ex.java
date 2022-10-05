package arrayHandling;

public class Int_x_present_more_than_n_half_times_Ex {

	public static void main(String[] args) {
		int i, j, n, temp, x = 2, count = 0;
		int a[] = { 2, 4, 6, 8, 2, 2, 2, 2 };
		n = a.length;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (i = 0; i < n; i++) {
			if (a[i] == x) {
				count++;
			}
		}
		if (count > (n / 2)) {
			System.out.println("Given Integer appears more than N/2 times");
		} else {
			System.out.println("Given Integer does not appear more than N/2 times");
		}
	}
}
