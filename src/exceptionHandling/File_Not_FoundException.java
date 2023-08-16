package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;

public class File_Not_FoundException {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./src/exceptionHandling/FileNotFoundException.txt");		
		if (file.exists()) {
			throw new FileNotFoundException();
		}
	}
}
