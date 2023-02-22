package com.variable;

public class Example {
	
	public static void main(String[] str) {
		Student student1 = new Student("Scott" , 1);		
		student1.printStudentRecord();
		
		Student student2 = new Student("Peter" , 2);		
		student2.printStudentRecord();
		
		Student student3 = new Student("John" , 3);	
		student3.printStudentRecord();
	}

}

class Student {
		
	static String col = "KTU";
	int roll;
	String name;
		
	public Student(String studentName, int studentRoll) { 
		roll = 	studentRoll;
		name = studentName;
	}
	
	public void printStudentRecord() {
		System.out.println(col + " " + name + " " + roll);
	}
	
	public void add() {
		System.out.println(10+20);
	}
}
