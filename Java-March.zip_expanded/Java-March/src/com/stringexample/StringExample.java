package com.stringexample;

public class StringExample {
	
	public static void main(String[] args) {
		String name = "QA";
		System.out.println(name.hashCode() + " "+name);
		name = name + " Guru";
		System.out.println(name.hashCode() + " " +name);
		System.out.println(name.hashCode());
		
		name = name + " Test";
		System.out.println(name);
		
		String name1 = "QA";
		System.out.println(name1.hashCode() + " " + name1);
		name1 = name1 + " Guru";
		System.out.println(name1.hashCode() + " " +name1);
		
	}
	
}
