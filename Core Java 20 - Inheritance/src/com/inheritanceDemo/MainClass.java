package com.inheritanceDemo;

public class MainClass {

	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.i);
		
		B b = new B();
		System.out.println(b.i);

	}

}
