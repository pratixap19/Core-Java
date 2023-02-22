package com.inheritance;

public class Child extends Base {

	public static void main(String[] args) {
		
		Child  child = new Child();
		child.print();
		System.out.println(child.name);
		System.out.println(child.a);
	}

}
