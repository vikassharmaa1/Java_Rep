package arrayHandling;

public class AlternateElemEx {

	public static void main(String[] args) {
		int i;
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (i = 0; i < a.length; i = i + 2) {

			System.out.println(a[i]);

		}
	}
}
