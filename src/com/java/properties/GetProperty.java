package com.java.properties;

import java.io.FileReader;
import java.util.Properties;

public class GetProperty {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("./src/com/java/properties/info.properties");

		Properties p = new Properties();
		p.load(reader);

		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("email"));

	}

}
