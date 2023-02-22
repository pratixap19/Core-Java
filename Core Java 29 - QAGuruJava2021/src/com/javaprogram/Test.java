package com.javaprogram;

public class Test {

	static int count = 1;
	int a = 10;
	int b = 5;

	public static void main(String[] args) {

		Test t1 = new Test();
		Test t2 = new Test();

		System.out.println(t1.a);
		System.out.println(t2.a);

		System.out.println(t1.count);
		System.out.println(t2.count);

		t1.a = 15;
		t1.count = 5;

		System.out.println(t1.a);
		System.out.println(t2.a);

		System.out.println(t1.count);
		System.out.println(t2.count);

	}

}
