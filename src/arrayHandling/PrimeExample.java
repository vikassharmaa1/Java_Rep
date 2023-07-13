package arrayHandling;

public class PrimeExample {

	public static void main(String[] args) {
		int i, n = 1, flag = 0, m;
		m = n / 2;

		if (n <= 1) {
			flag = 1;
			System.out.println("Number is not a Prime number");
		}
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println("Number is not a Prime number");
				flag = 1;
				break;
			}
		}
		if (flag == 0)

			System.out.println("Number is Prime");

	}

}
