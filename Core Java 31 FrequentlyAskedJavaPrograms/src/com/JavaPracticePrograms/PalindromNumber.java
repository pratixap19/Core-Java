package com.JavaPracticePrograms;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num");
		
		int num = sc.nextInt();
		
		int temp = num;
		
		int rev = 0, rem;
		
		while(temp !=0) {
			
			rem=temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		
		
		if(num==rev) {
			System.out.println(num + " " + "is a Palindrom number");
		}
		else {
			System.out.println(num + " " + "is Not Palindrom number");
		}

	}

}
