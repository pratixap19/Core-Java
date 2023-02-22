package com.abstraction;

public class ChildAb extends AbstractClass implements InterfaceA, InterfaceB {


	public void sum() {
		
		System.out.println(10+20);
	}

	
	public void multiply() {
		System.out.println(10*5);
	}

	
	public void add() {
		System.out.println(10+20);
		
	}
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	
	

}
