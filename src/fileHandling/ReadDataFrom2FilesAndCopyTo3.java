package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;


public class ReadDataFrom2FilesAndCopyTo3 {

	public static void main(String[] args) {

		String f1 = "C:/Users/VS0071652/Documents/temp1.txt";
		String f2 = "C:/Users/VS0071652/Documents/temp2.txt";

		String line = null;

		try {
			FileReader f1Reader = new FileReader(f1);
			FileReader f2Reader = new FileReader(f2);

			BufferedReader bfr1 = new BufferedReader(f1Reader);
			BufferedReader bfr2 = new BufferedReader(f2Reader);
			while ((line = bfr1.readLine()) != null) {
				System.out.println(line);
			}
			while ((line = bfr2.readLine()) != null) {
				System.out.println(line);
			}
			bfr1.close();
			bfr2.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
