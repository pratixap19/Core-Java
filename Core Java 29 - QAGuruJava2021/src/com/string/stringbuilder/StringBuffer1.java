package com.string.stringbuilder;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("QA String");

		//name.append("Test");
		 //name.append("Java");
		//name.insert(1, "Java");
		//name.replace(0, 2, "Java");
		name.delete(0, 1);
		//name.reverse();
		System.out.println(name);
	}

}
