package com.operator;

public class TernaryOperator {
	
	public static void main(String[] str) {
		int a = 50;
		int b = 20;
		
		int max = ( a> b) ? a : b;
		System.out.println(max);
		
		// 
		int c = 11;
		
		String message = (c%2 == 0) ? "Even number" : "Odd number";
		System.out.println(message);
	}

}
