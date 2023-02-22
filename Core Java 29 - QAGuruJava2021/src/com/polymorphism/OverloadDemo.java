package com.polymorphism;

public class OverloadDemo {

	public void sum(int a) {

		System.out.println("Method with one parameter" + " " + a);

	}

	public void sum(int a, int b) {

		System.out.println("Method with two parameters" + " " + (a+b));

	}

	public void sum(int a, int b, int c) {

		System.out.println("Method with three parameters" + " " + (a+b+c));

	}

	public static void main(String[] args) {
		
		OverloadDemo demo = new OverloadDemo();
		
		demo.sum(10, 20);

	}

}
