package com.java.properties;

import java.io.FileWriter;
import java.util.Properties;

public class CreatePropertiesFile {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		p.setProperty("name", "Robert Justice");
		p.setProperty("email", "rober.justice@judge.com");

		p.store(new FileWriter("./src/com/java/properties/info.properties"), "Configurations");

	}

}
