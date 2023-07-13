package collectionsFramework;

import java.io.FileInputStream;
import java.util.HashMap;

public class sortingString {
	public static void main(String[] args) throws Exception {
		String filename = args[0];
		FileInputStream inputStream = new FileInputStream(filename);
		HashMap<Character, Integer> count = new HashMap<>();
		while (inputStream.available() > 0) {
			int i = inputStream.read();
			if (!count.containsKey((char) i))
				count.put((char) i, 1);
			else {
				int num = count.get((char) i);
				num++;
				count.put((char) i, num);
			}
		}
		inputStream.close();
		HashMap<Character, Integer> sorted = new HashMap<>();
		for (int i = 1; i < 500; i++) {
			char c = (char) i;
			if (count.containsKey(c))
				sorted.put(c, count.get(c));
		}
		for (HashMap.Entry<Character, Integer> entry : sorted.entrySet()) {
			if (entry.getValue() != 0) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}
}