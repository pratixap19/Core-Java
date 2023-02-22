package com.string.string;

public class StringExample3 {

	public static void main(String[] args) {
		
		
		
		String name1 = "QA";
        String name2 = "  QA   ";
        String name3 = new String("QA");
        System.out.println("name1 == name2");
		System.out.println(name1.equals(name2));
		
		System.out.println("name1 == name3");
		System.out.println(name1.equals(name3));
		
		System.out.println(name2.trim());

		

	}

}
