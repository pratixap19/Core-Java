package com.methods;

public class Calculator {

	public int calc(int a, int b, char operator) {

		int c = 0;

		if (operator == '+') {
			c = a + b;
		} else if (operator == '-') {
			c = a - b;
		} else if (operator == '*') {
			c = a * b;
		} else if (operator == '/') {
			c = a / b;
		}

		else if (operator == '%') {
			c = a % b;
		}

		System.out.println("Value is:" + c);

		return c;
		}

	public static void main(String[] args) {

		Calculator test = new Calculator();

		int result = test.calc(10, 20, '*');
		//System.out.println(result);

		int result1 = test.calc(10, 5, '/');
		//System.out.println(result1);
		
		int result2 = test.calc(10, 5, '%');
		//System.out.println(result2);
		
		int result3 = test.calc(10, 5, '+');
		//System.out.println(result3);
		

	}

}
