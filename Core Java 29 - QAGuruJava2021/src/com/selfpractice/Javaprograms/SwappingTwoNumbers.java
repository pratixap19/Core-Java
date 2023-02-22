package com.selfpractice.Javaprograms;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		int a=10; int b=20;
		
		System.out.println("Before swapping values are " + a + " " + b);
		
		//logic - use third variable
		
		int t=a;
		 a=b;
 		 b=t;
		 
		 System.out.println("After swapping values are " + a + " " + b);
		
		
}

}
