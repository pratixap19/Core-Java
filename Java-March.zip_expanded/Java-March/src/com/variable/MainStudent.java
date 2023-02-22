// this is package
package com.variable;

public class MainStudent {
	
	static int count;
	
	int rollNum;
	String studentName = "Default Name";
	String fname;
	String address;
	
			
	public static void main(String[] args) {
		
		MainStudent obj = new MainStudent(); 
		obj.studentName = "Test1";
		obj.fname = "F Name1";
		obj.address = "Sector 1";
		
		
		System.out.println(obj.studentName + " " + obj.fname + " " +obj.address);
		System.out.println(MainStudent.count);
		//obj.print();
		System.out.println(count);
		
		
		MainStudent obj1 = new MainStudent(); 
		MainStudent.count = 10;
		System.out.println(obj1.studentName + " " + obj1.fname + " " +obj1.address);
		System.out.println(MainStudent.count);
		
		MainStudent obj2 = new MainStudent(); 
		System.out.println(obj2.studentName + " " + obj2.fname + " " +obj2.address);
		System.out.println(MainStudent.count);	
	}
	
	
	public void print() {
		String name = "QA";
		System.out.println(name);
		System.out.println("First user define method");
		System.out.println(count);
		System.out.println(studentName);
	}
	
	// local variable
	// instance variable
	// static variable

}





