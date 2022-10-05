package arrayHandling;

public class Find2Elem_Sum_Closest_0_Ex {

	public static void main(String[] args) {
		int i, j, min1=0, min2=0, sum, minimum;
		int a[] = { 6, 4, 2, 8, 10 };
		int n = a.length;
		minimum = Math.abs(a[0] + a[1]);
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				sum = Math.abs(a[i] + a[j]);
				if (sum < minimum) {
					min1 = i;
					min2 = j;
					minimum = sum;
				}
			}
		}
		System.out.println("Element 1:" + a[min1]);
		System.out.println("Element 2:" + a[min2]);
	}
}
