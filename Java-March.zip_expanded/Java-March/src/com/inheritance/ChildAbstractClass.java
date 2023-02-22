package com.inheritance;

public class ChildAbstractClass extends AbstractClassA implements InterfaceA {

	public void sum() {
		System.out.println(10 + 20);
	}

	public void test() {
		System.out.println("Test");
	}
	
	public void print1() {	
		System.out.println("print method");
	}
	
	public void log() {
		System.out.println("Logs");
	}

}
