package com.selfpractice.Javaprograms;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int roll = sc.nextInt();

		switch (roll) {

		case 101:
			System.out.println("Student name is Ramesh");
			break;

		case 102:
			System.out.println("Student name is Naresh");
			break;

		case 103:
			System.out.println("Student name is Suresh");
			break;

		default:
			System.out.println("Not found");

		}

	}

}
