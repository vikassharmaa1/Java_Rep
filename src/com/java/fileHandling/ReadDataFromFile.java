package com.java.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) {

		String fileName = "C:/HCL/temp.txt";

		String line = null;

		try {

			FileReader fr = new FileReader(fileName);

			BufferedReader br = new BufferedReader(fr);

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");

		}
	}

}
