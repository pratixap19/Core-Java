package com.selfpractice.Javaprograms;

public class PalindromNum1 {

	public static void main(String[] args) {
		
		int num = 101;
		int temp = num;
		int reverse = 0, remainder;
		
		while(temp !=0) {
			
			remainder = temp % 10;
			reverse = reverse*10+remainder;
			temp = temp/10;
		}
		
		if(num == reverse) {
			System.out.println("It is palindrom number");
		}
		else {
			System.out.println("It is not a palindrom number");
		}
	}

}
