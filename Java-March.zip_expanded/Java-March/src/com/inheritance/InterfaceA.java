package com.inheritance;

public interface InterfaceA extends InterfaceB{
	
	int a = 10;
	
	abstract public void test();
	
	public void print1();
	
	private void get() {
		System.out.println("Private method");
	}

	default void test1(){
		get();
		System.out.println("Default method");
	}
	
	static void print2() {
		System.out.println("Static method");
	}
}
