package com.string.stringbuilder;

public class StringBuilderEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringBuilder name = new StringBuilder("QA String");
		
		//name.append("Test");
		//name.append("Java");
		//name.insert(1, "Java");
		//name.replace(0, 2, "Java");
		//name.delete(0, 1);
		name.reverse();
		System.out.println(name);
		
	}

}
