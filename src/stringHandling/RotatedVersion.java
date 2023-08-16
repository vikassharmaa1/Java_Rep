package stringHandling;

public class RotatedVersion {

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";	

		if (s1.length() != s2.length()) {
			System.out.println("s2 is not rotated version of s1");
		} else {
			String s1s1 = s1 + s1;			
			if (s1s1.contains(s2)) {
				System.out.println("s2 is a rotated version of s1");
			} else {
				System.out.println("s2 is not rotated version of s1");
			}
		}
	}
}
