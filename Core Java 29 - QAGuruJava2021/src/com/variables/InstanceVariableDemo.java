package com.variables;

public class InstanceVariableDemo {
	// this instance variable is visible for any child class.
	public String name;

	// salary variable is visible in InstanceVariableDemo class only.
	private double salary;

	// The name variable is assigned in the constructor.
	public InstanceVariableDemo(String empName) {
		name = empName;
	}

	// The salary variable is assigned a value.
	public void setSalary(double setSalary) {
		salary = setSalary;
	}

	public void print() {
		System.out.println("Employee name:" + name);
		System.out.println("Employee salary:" + salary);
		System.out.println("=======================");
		}

	public static void main(String[] args) {

		InstanceVariableDemo emp1 = new InstanceVariableDemo("Roger");
		emp1.setSalary(1000);
		emp1.print();
		
		InstanceVariableDemo emp2 = new InstanceVariableDemo("Roni");
		
		emp2.setSalary(1020);
		emp2.print();
		
	}

}
