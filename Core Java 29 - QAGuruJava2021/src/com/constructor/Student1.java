//This is the proper way to initialize the object.
package com.constructor;

public class Student1 {
	
	int id;
	String name;
	int age;
	
	public Student1(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public void print() {
		System.out.println("Id:" + id + " " + "Name:" + name + " " + "Age:" + age);
	}
	public static void main(String[] args) {
		
    Student1 obj1 = new Student1(12, "Pratixa", 51);
    obj1.print();
    
    Student1 obj2 = new Student1(13, "Nitin", 52);
    obj2.print();
    

	}

}
