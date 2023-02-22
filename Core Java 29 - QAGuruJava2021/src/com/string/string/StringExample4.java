package com.string.string;

public class StringExample4 {

	public static void main(String[] args) {

		String name1 = "QA Automation";
		System.out.println(name1.startsWith("QA1"));
		System.out.println(name1.contains("Auto"));
		System.out.println(name1.endsWith("ion"));
		
		char array[] = name1.toCharArray();
		
		for(char ch:array) {
			
			System.out.print(ch);
		}

	}

}
