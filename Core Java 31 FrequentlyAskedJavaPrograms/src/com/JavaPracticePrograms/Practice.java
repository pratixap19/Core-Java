package com.JavaPracticePrograms;

public class Practice {

	public static void main(String[] args) {
		
int a= 10, b=20;
		
		//without using third veriable
		System.out.println("Before swapping values are:" + a + " " + b);
		
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println("After swapping values are:" + a + " " + b);
	}

}
