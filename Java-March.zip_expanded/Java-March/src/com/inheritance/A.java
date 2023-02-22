package com.inheritance;

public class A {
	
	protected String name = "QA";
	
	protected void print() {
		System.out.println("Printed A class");
		
		sum(19, 20);
	}
	
	protected int sum(int a, int b) {
		return a+b;
	}
	
}
