//If there are 100 students and if we write program this way then it will be too long. 
//To avoid this issue we use Constructor to shorten the code. Next program will be created by using constructor.

package com.constructor;

public class Student {
	
	int id;
	String name;
	int age;
	
	public void setDetails(int id1, String name1, int age1) {
		
		id=id1;
		name=name1;
		age=age1;
	}
	
	public void print() {
		
		System.out.println("ID:" + id + " "+ "Name:" + name + " "+ "Age:"+ age) ;
	}

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setDetails(23, "Aasef", 35);
		student1.print();
		
		Student student2 = new Student();
		student2.setDetails(20, "Sadiq", 35);
		student2.print();
	}

}
