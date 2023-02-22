package com.selfpractice.Javaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		 int num= sc.nextInt();
		 
		 //1.using StringBuffer class
		 /*
		 StringBuffer sb = new StringBuffer(String.valueOf(num));// String.valueOf(num) method will convert num 
		 //variable into string
		 
		 StringBuffer rev = sb.reverse();
		 
		 System.out.println(rev);
		 */
		 
		 //2.Using StringBuilder class
		 
		 StringBuilder sb1 = new StringBuilder();
		 
		 sb1.append(num);//append means add
		 
		 StringBuilder rev =sb1.reverse();
		 
		 System.out.println(rev);
		 
		 
		 

	}

}
