
//Constructor overloading
package com.constructor;

public class A {
	
	public A() {
		
		System.out.println("Executed default");


	}

	public A(int a) {
		
		System.out.println(a);

	}

	public A(int a, int b) {
		System.out.println(a + " " + b);
	}

	

	public static void main(String[] args) {
		
		A a= new A(2, 5);

	}

}
