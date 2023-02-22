package com.selfpractice.Javaprograms;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String str = sc.next();
		
		String org_str = str;
		
		StringBuffer sb = new StringBuffer();
		
		StringBuffer rev = sb.reverse();
		
		if(org_str == rev) {
			
			System.out.println("It is a palindrome String");
		}
		else {
			System.out.println("It is not a palindrome String");
		}
		
		

	}

}
