package com.constructorChaining;

class A {

	public A() {
		System.out.println("Class A constructor");
	}

}

class B extends A {

	public B() {

		this(3);
		System.out.println("Class B non paramiterized constructor");
	}

	public B(int a) {
		System.out.println("Class B paramiterized constructor");
	}
}

public class Example {

	public static void main(String[] args) {
		B b = new B();
	}

}
