package com.constructor;

public class Child extends Parent{
	
	public Child() {
		
		System.out.println("Default");
	}
	
	public Child(String name) {
		super(name);
		System.out.println("Paramiterised constructor");
	}

	public static void main(String[] args) {
		
		Child obj = new Child("QA");
		obj.print();
	}

	
}
