package arrayHandling;

public class MatchSubstring {

	private static int length;

	public static void main(String[] args) {
		String arr[] = { "abcdeffgh", "dfga", "bfga", "abbca", "bbddaa", "abcdee" };
		length = arr.length;
		for (int i = 0; i < length - 1; i++) {

			if (arr[i].contains("bbd")) {

				System.out.println(arr[i]);
			}

		}

	}

}
