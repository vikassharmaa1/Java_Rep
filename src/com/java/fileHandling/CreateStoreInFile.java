package com.java.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class CreateStoreInFile {

	public void createStroreObject(String emp) {
		OutputStream ops = null;
		ObjectOutputStream objops = null;

		try {
			ops = new FileOutputStream("Java.txt");
			objops = new ObjectOutputStream(ops);
			objops.writeObject(emp);
			objops.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (objops != null)
			try {
				objops.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	public static void main(String[] args) {
		CreateStoreInFile csf = new CreateStoreInFile();
		csf.createStroreObject("This is Java");

	}

}
