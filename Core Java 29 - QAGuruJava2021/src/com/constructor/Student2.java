//If instance variable are assigned value then it will print same value for all objects.
package com.constructor;

public class Student2 {
	int id=10;
	String name="Nayan";
	
	public void print() {
		System.out.println("Id:" + id + " " + "Name:" + name );
	}

	public static void main(String[] args) {
		Student2 obj1 = new Student2();
        obj1.print();
        
        Student2 obj2 = new Student2();
        obj2.print();
	}

}
