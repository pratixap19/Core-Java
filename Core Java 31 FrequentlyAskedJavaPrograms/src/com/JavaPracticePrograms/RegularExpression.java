package com.JavaPracticePrograms;
//RegularExpression works with only replaceAll methods. It will not work with replace method.
public class RegularExpression {

	public static void main(String[] args) {
		
		String s = "$125";
		String s1=s.replaceAll("[$]", "");
		System.out.println(s1);
		
		String name="Pratixa123Patel#$%^&";
		//String s2 = name.replaceAll("[^a-zA-Z]", "");
		String s2 = name.replaceAll("[123#$%^&]", "");
		System.out.println(s2);
		
		String str = "Pratixa123Patel";
		System.out.println(str.replace("123", "N"));
		

	}

}

