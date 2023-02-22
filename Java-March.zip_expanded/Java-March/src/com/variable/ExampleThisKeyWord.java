package com.variable;

public class ExampleThisKeyWord {

	public static void main(String[] str) {
		Student1 obj = new Student1("Scott", 11);
		obj.print();		
	}
}

class Student1 {
	
	int number;
	String name;
	
	public Student1(String name, int number) {
		this("Raj");
		this.name = name;
		this.number = number;
	}
	
	public Student1(String fName) {
		System.out.println("Default constructor executed " +fName );
	}
	
	public Student1() {
		System.out.println("Default constructor executed");
	}
	
	public void print() {
		System.out.println(this.getName() + "  "+ number);
	}
	
	public String getName() {
		return name;
	}
	
}
