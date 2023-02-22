package com.variables;

public class StaticVariableDemo {
	
	private static double salary;
	
	// DEPARTMENT is a constant
	   public static final String DEPARTMENT = "Development ";

	public static void main(String[] args) {
		
		salary = 2000;
		System.out.println(DEPARTMENT + "avarage salary is " + salary);
		
	}

}
