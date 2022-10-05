package stringHandling;

public class StringReverse {

	public static String reverse(String str) {
		char[] a = str.toCharArray();
		int i = 0;
		int j = a.length - 1;
		char temp;
		while (j > i) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
			i++;
		}
		return new String(a);
	}
	
	public static void main(String[] args){
		String revString = StringReverse.reverse("Vikas Sharma");
		System.out.println(revString);
	}

}
