package com.JavaPracticePrograms;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		int a= 10, b=20;
		
		//without using third variable
		/*System.out.println("Before swapping values are:" + a + " " + b);
		
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println("After swapping values are:" + a + " " + b);*/
		
		//with using third variable
		int t=a;//10
		a=b;//20
		b=t;//10
		
		System.out.println("After swapping values are:" + a + " " + b);
		
		
		
	}

}
