package com.statickeyword;

public class StaticKeyword {
	
	static {
		System.out.println("I am static block");
	}

	public static void main(String[] args) {
		Student student1 = new Student("Pratixa", 1);
		Student student2 = new Student("Alam", 2);
		Student student3 = new Student("Pranathi", 3);
		
		System.out.println(Student.collegeName);
		Student.sum(10,20);
		
}
	
}

class Student{
	
	public static String collegeName = "UF";
	public String name;
	public int rollNumber;
	
	public Student(String name, int rollNumber) {
		this.name=name;
		this.rollNumber = rollNumber;
		
	}
	
	public static int sum(int a, int b) {
		int c = a+b;
		System.out.println(c);
		Student obj=new Student("Zak", 4);
		obj.print();
		return c;
	}
	
	public void print() {
		System.out.println("College name is " + Student.collegeName);
		
	}
	
}
