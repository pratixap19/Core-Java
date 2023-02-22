package com.JavaPracticePrograms;
//How to remove 123 from String "Pratixa123Patel"?
public class RemoveDigitsFromString {

	public static void main(String[] args) {
		
		String s = "Pratixa123Patel";
		//use regular expression
		String name = s.replaceAll("[^0-9]", "");
		System.out.println(name);
		
		String name1 = s.replaceAll("[0-9]", "");
		System.out.println(name1);

	}

}
