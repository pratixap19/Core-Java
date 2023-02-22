package com.string.string;

public class practice {

	public static void main(String[] args) {
		char[] ch = { 'A', 'U', 'T', 'O', 'M', 'A', 'T', 'I', 'O', 'N' };

		String str = new String(ch);

		System.out.println(str);

		String name = "QA Automation";

		System.out.println(name.length());
		
		System.out.println(name.charAt(10));
		
		System.out.println(str.charAt(3));
		
		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(name.charAt(i));
		}

	}

}
