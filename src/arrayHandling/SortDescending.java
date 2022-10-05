package arrayHandling;

public class SortDescending {

	public static void main(String[] args) {
		int i, j, n, temp;
		int a[] = { 102, 32, 6, 18, 12, 21, 91 };
		n = a.length;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Descending Order: ");
		for (i = 0; i < n - 1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n - 1]);

	}

}