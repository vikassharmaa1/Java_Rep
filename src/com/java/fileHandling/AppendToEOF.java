package com.java.fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class AppendToEOF {

	public static void main(String[] args) {
		try {
			

			File file = new File("C:/HCL/javaio-appendfile.txt");
			String data = " This content will append to the end of the file"+" And at the end"+"of the end"+" by the end";

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			// true = append file
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
