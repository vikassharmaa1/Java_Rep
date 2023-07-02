package hackerRank;

import java.util.Scanner;

public class RegexIPValidator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		in.close();

	}
}

class MyRegex {

	String ip_0To255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
	String pattern = ip_0To255 + "\\." + ip_0To255 + "\\." + ip_0To255 + "\\." + ip_0To255;
}
