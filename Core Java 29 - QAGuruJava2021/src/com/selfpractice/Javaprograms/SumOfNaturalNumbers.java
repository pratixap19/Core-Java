package com.selfpractice.Javaprograms;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		int n = 10;
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum = sum+i;
		}
		
		System.out.println("Sum of 1 to 10 digit number is " + sum);
	}

}
