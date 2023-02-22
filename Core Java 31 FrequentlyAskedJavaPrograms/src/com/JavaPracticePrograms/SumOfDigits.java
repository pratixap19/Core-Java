package com.JavaPracticePrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num = 657;
		int sum = 0;
		
		while(num>0) {
			
			sum = sum + num%10;//remainder
			num = num/10;//quotient
			
		}
		
		System.out.println("Sum of digits in number is" + " " + sum);
	}

}
