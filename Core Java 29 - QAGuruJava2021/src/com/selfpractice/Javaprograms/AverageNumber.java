package com.selfpractice.Javaprograms;

import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {

		int a, b, c;
		int sum;
		float ave;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number");

		a = scanner.nextInt();

		System.out.println("Enter the second number");

		b = scanner.nextInt();

		System.out.println("Enter the third number");

		c = scanner.nextInt();
		
		sum=a+b+c;
		ave=sum/3;
		
		System.out.println("The average number is " + ave);

	}

}
