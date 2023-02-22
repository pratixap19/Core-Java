package com.exception.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Arith {

	private static String str;

	public static void main(String[] args) throws Exception {
		
		System.out.println("Before Exception");
		
		readFile();
		sum();
		try {
			// int a = 10/0;
			String a = "xyz";
			int a1 = Integer.parseInt(a);
			System.out.println(a1);
			// System.out.println(str.length());
			System.out.println("Testing");
		}

		catch (NumberFormatException ex) {
			System.out.println("Handled by Exception");
		} catch (IllegalArgumentException ex) {

		} finally {
			System.out.println("Finally Block");
		}
		// int a = 10/0;
		// System.out.println(a);
		System.out.println("After Exception");
	}
	
	public static void readFile() throws FileNotFoundException {
		File file = new File("File1.txt");
		FileReader fr = new FileReader(file);
		
	}
	
	public static void sum() throws Exception {
		int a = 10+20;
		throw new Exception("Throw exception");

	}

}
