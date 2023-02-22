package com.JavaPracticePrograms;
//RegularExpression works with only replaceAll methods. It will not work with replace method.
public class StringUpdation {

	public static void main(String[] args) {
		
		String s1="this is demo";
        System.out.println(s1.replace("is", "was"));//thwas was demo
        System.out.println(s1.replaceFirst("is", "was"));//thwas is demo
        System.out.println(s1.replaceAll("is", "was"));//thwas was demo.
        System.out.println(s1.replaceAll("is(.)", "was"));//thwaswasdemo. It will replace "is" with "what" and it will remove spaces.
        System.out.println(s1.replaceAll("is(.*)", "was"));//once it finds "is" from there it will remove string with was.
        
	}

}
