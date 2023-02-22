package com.constructor;

public class Parent {
	String name;
	public Parent() {
		System.out.println("Parent default");
	}
	
	public Parent(String name) {
		this.name = name;
		System.out.println("Parent parameterised constructor");
	}
	
	public void print() {
		System.out.println(name);
	}

	

}
