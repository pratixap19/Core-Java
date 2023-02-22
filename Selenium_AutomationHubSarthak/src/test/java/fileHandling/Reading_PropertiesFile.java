package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reading_PropertiesFile {

	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("user.dir"));
		//Create the object of the Properties class
		Properties prop = new Properties();
		String path = System.getProperty("user.dir") +  "\\src\\test\\java\\fileHandling\\rediffLogin.properties";
		
		//Create object of FileInputStream class
		FileInputStream ip = new FileInputStream(path);
		
		//from the FileInputStream object we are loading everything into the Properties object
		prop.load(ip);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("url"));
		

	}

}
