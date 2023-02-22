package com.java.operator;

public class Unaryoperator {

	public static void main(String[] args) {

		int a = 12;

		// int b = a++;

		//int b = a++ + a++;
		
		//12+13
		
		//14

		//System.out.println(b);
		System.out.println(a);
		
		int c = ++a;//In preincrement first increase value and then use it.
		System.out.println(c);
		
		int d = ++a + ++a;
		//13+14
		
		System.out.println(d);
		
		//boolean status = true;
		//System.out.println(!status);

	}

}
