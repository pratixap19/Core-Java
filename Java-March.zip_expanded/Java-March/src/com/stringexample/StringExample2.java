package com.stringexample;

public class StringExample2 {

	public static void main(String[] args) {
		String text = "This $$$ is selenium java session   133";
		
		System.out.println(text.length());
		char ch = text.charAt(5);
		System.out.println(ch);
		
		char[] chArray = text.toCharArray();
		System.out.println(chArray.length);
				
		String newString = text.substring(1, 10);
		System.out.println(newString);
		
		//String newString = text.replace(' ', ',');
		//System.out.println(newString);
		
		//String newString = text.replace('$', ',');
		//System.out.println(newString);
	}

}
