package com.selfpractice.Javaprograms;

public class PrintDefaultValues {
	
	int a;
	
	boolean flag;
	
	char ch;
	
	String name;

	public static void main(String[] args) {
		
		PrintDefaultValues value = new PrintDefaultValues();
		
		System.out.println("The default value of int is:" + value.a);
		
		System.out.println("The default value of boolean is:" + value.flag);
		
		System.out.println("The default value of char is:" + value.ch);
		
		System.out.println("The default value of String is:" + value.name);
		
	}

}
