package com.javaprogram;

public class SecondJava {

	
	static String name = "QAGuru";
	
	public static void main(String[] args) {
		
		String name1 = "Java1";
		String name2 = "Java2";
		String name3 = "Java3";
		System.out.println(name1 + " " + name2 + " " + name3);
		FirstJava obj12 = new FirstJava();
		obj12.print();
		
		SecondJava secondObj1 = new SecondJava();
		secondObj1.printName();
		
		name = "QA";
		System.out.println(name);
	}
	
	public void printName() 
	{
		System.out.println(name);
	}

}
