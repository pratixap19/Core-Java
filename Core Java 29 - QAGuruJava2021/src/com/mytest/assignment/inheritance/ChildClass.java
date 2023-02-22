package com.mytest.assignment.inheritance;

public class ChildClass extends Parent {

	
	public ChildClass(){
		super(1);
		
	}
	public void printM() {
		super.printM();
		System.out.println("Value is "+x);
		System.out.println("I am ChildClass");
	}

	

	public static void main(String[] args) {
		ChildClass b = new ChildClass();
		b.printM();
	}





	}

