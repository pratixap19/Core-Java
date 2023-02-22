package com.methods;

public class Test {

	public void sum(int a, int b) {
		int c = a + b;
		System.out.println("Sum is:" + c);
	}

	public static void main(String[] args) {

		Test test = new Test();
		test.sum(10,20);
		test.sum(23, 45);
	}

}
