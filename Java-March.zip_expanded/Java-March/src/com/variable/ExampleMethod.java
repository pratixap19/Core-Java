package com.variable;

public class ExampleMethod {

	public static void main(String[] args) {
		ExampleMethod abc = new ExampleMethod();
		abc.add();
		
		int result = abc.add(10, 5);
		System.out.println(result);
		
		String fullName = abc.getFullName("Scott", "Tiger");
		System.out.println(fullName);
		
		print();		
		int result1 = Math.max(10, 20);
		System.out.println(result1);		
	}
	
	public void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public int add(int a, int b) {		
		int c = a+b;
		return c;
	}
	
	public String getFullName(String fname, String lName) {		
		String fullName = fname + " " + lName;
		return fullName;		
	}
	
	public static void print() {
		System.out.println("Static method");
	}

}
