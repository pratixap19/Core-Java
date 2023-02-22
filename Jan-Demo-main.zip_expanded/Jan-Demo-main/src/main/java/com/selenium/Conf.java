package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Conf {

	public static String getConfig(String key) throws IOException {
		Properties pro = new Properties();
		File file = new File("config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		pro.load(fileInput);
		return pro.getProperty(key);
	}
}
