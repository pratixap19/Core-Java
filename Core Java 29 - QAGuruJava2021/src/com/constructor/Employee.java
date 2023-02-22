// We are reducing number of lines in code by using constructor.
// Constructor is used to initialize instance variable.
package com.constructor;

public class Employee {

	int id;
	String name;
	int age;

	public Employee(int id1, String name1, int age1) {

		id = id1;
		name = name1;
		age = age1;
	}

	public void print() {

		System.out.println("ID:" + id + " " + "Name:" + name + " " + "Age:" + age);
	}

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(21, "Rahul", 30);
		emp1.print();
		
		Employee emp2 = new Employee(23, "Reena", 35);
		emp2.print();
		
		Employee emp3 = new Employee(27, "Robert", 30);
		emp3.print();

	}

}
