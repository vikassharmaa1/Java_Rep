package exceptionHandling;

public class Stack_OverflowError {
	public static int factorial(int n) {

		if (n == 1) {

			return 1;
		} else {

			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		int result = factorial(-1);
		System.out.println("Result: " + result);

	}

}
