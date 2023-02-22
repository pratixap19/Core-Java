package com.JavaPracticePrograms;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		/*
		 * int radius = 5; double pi = 3.14; double area; area = pi * radius * radius;
		 * System.out.println("The area of a circle is " + area);
		 */

		int radius;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of the circle");
		radius = sc.nextInt();
		
		area = Math.PI*(radius*radius);
		System.out.println("Area of the circle is " + area);

	}

}
