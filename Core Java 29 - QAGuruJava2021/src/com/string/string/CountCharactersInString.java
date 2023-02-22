package com.string.string;

public class CountCharactersInString {

	public static void main(String[] args) {

		String str = "Learn Java";

		// Write a program to count characters in string

		System.out.println("Length of the string is " + str.length());

		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) != ' ') {
				
				count++;
				
			}
			
		}
		System.out.println("Count of characters are " + count);

	}

}
