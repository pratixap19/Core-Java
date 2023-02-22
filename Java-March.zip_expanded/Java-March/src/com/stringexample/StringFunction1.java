package com.stringexample;

public class StringFunction1 {

	public static void main(String[] args) {
		String name1 = "QA";
		String name2 = "QA";
		String name5 = new String("QA");
		System.out.println(name1 == name5);
		System.out.println(name1.equals(name5));
		System.out.println(name1 == name2);
		
		System.out.println(name1.hashCode());
		System.out.println(name5.hashCode());
		String name4 = "  This is java session for selenium webdriver       ";
		
		boolean result = name1.equals(name2);
		
		//boolean result = name1.equalsIgnoreCase(name2);
		System.out.println(result);
		
		System.out.println(name4);
		System.out.println(name4.trim());
		
		
		
		System.out.println(name4.contains("selenium"));
		
		System.out.println(name4.startsWith("This"));
		
		boolean status = name4.startsWith("This");
		
		System.out.println(name4.endsWith("webdriver"));
		
		String name3 = name1.concat(" Guru").concat(" ").concat("Test");
		System.out.println(name3);
				
		System.out.println(name4.toLowerCase());
		System.out.println(name4.toUpperCase());
	}

}
