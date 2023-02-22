//A palindrome number is a number that remains the same when its digits are reversed. Like 16461

package com.selfpractice.Javaprograms;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class PalindromeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		int num = sc.nextInt();

		int org_num = num;

		StringBuffer sb1 = new StringBuffer(String.valueOf(num));

		StringBuffer sb = new StringBuffer(String.valueOf(num));

		StringBuffer rev = sb.reverse();

		System.out.println(rev);

		if (sb1 == rev) {
			System.out.println("It is a palindrome number");
			
		} else {
			System.out.println("It is not a palindrome number");
		}

	}

}
