package arrayHandling;

public class Find2Elem_Largest_DiffEx {

	public static void main(String[] args) {
		int i, j, n;
		int a[] = {1,10,20,30,40,50};
		n = a.length;
		int diff, greatest_diff;
		greatest_diff = 0;
		int a1 = 0, a2 = 0;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				diff = Math.abs(a[i] - a[j]);
				if (diff > greatest_diff) {
					greatest_diff = diff;
					a1 = i;
					a2 = j;
				}
			}
		}
		System.out.println("Greatest Difference:" + greatest_diff);
		System.out.println("Two elements with largest difference:" + a[a1] + " and " + a[a2]);
	}

}
