package com.statickeyword;

public class StaticExample {
	
	 int a;
	static int b;
	
	static void m1() {
		System.out.println("m1 is a static method");
	}
	
	void m2() {
		System.out.println("This is instance method");
	}

	public static void main(String[] args) {
		
		StaticExample obj = new StaticExample();
		obj.m2();
		obj.a = 20;
		System.out.println(obj.a);
		
		//static stuff
		StaticExample.b= 10;
		System.out.println(b);
		m1();
		
	}

}
