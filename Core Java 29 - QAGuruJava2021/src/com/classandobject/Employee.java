package com.classandobject;

public class Employee {

	String name;
	int age;
	String designation;
	double salary;

	// This is the constructor of the class Employee
	public Employee(String name) {
		this.name = name;
	}

	// The age variable is assigned a value.
	public void empAge(int empAge) {
		age = empAge;
	}

	// The designation variable is assigned a value.
	public void empDesignation(String empDesignation) {
		designation = empDesignation;
	}

	// The salary variable is assigned a value.
	public void empSalary(double empSalary) {
		salary = empSalary;
	}

	// This method prints the employee details.
	public void empPrint() {

		System.out.println("Name:" + name);
		System.out.println("Age is:" + age);
		System.out.println("Designation is:" + designation);
		System.out.println("Salary is:" + salary);
		System.out.println("............................................");

	}

	public static void main(String[] args) {

		// Create two objects using constructor

		Employee emp1 = new Employee("John");
		Employee emp2 = new Employee("Michael");
		Employee emp3 = new Employee("Mary");

		// Invoking methods for each object created
		emp1.empAge(24);
		emp1.empDesignation("Senior Softward Engineer");
		emp1.empSalary(3000);
		emp1.empPrint();

		emp2.empAge(32);
		emp2.empDesignation("Senior Softward QA Engineer");
		emp2.empSalary(2000);
		emp2.empPrint();

		emp3.empAge(28);
		emp3.empDesignation("Project Manager");
		emp3.empSalary(2000);
		emp3.empPrint();

	}

}
