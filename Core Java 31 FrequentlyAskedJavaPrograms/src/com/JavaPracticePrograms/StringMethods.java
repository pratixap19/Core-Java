package com.JavaPracticePrograms;

public class StringMethods {

	public static void main(String[] args) {
		
		String s= "Pratixa";
		String s2 = "Patel";
		String s3 = "  PRATIXA  ";
		String s4 = "pratixa123patel";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s2.concat(s));
		System.out.println(s.contains("ra"));
		System.out.println(s.startsWith("o"));
		System.out.println(s.substring(1));
		System.out.println(s.substring(0,5));
		System.out.println(s.equals(s3));
		System.out.println(s.equalsIgnoreCase(s3));
		System.out.println(s.replace('a', 'b'));
		System.out.println(s3.trim());
		System.out.println(s4.replaceAll("[123]", ""));
		
		

	}

}
