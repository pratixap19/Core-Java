package com.string.stringbuilder;

public class StringCompare {

	public static void main(String[] args) {

		String name = "QA";
		System.out.println(name.hashCode());
        
		name=name.concat("Automation");
		System.out.println(name);
		System.out.println(name.hashCode());
		
		name = name.concat("Tester");
		System.out.println(name);
		System.out.println(name.hashCode());
		
		StringBuilder name1 = new StringBuilder("QA");
		System.out.println(name1.hashCode());
		name1.append("Automation");
		System.out.println(name1.hashCode());
		name1.append("Tester");
		System.out.println(name1.hashCode());
	}

}
