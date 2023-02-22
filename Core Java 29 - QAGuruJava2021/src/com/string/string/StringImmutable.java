package com.string.string;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s = "Java";
		s.concat("Selenium");//until you not assign reference variable to new string object output will be "Java"
		System.out.println(s);
		
		/*String s = "Java";
		s = s.concat("Selenium");//After assign reference variable to new String object output will be "JavaSelenium"
		System.out.println(s);*/
	}

}
