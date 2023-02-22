package com.stringexample;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("QA");
		StringBuilder name2 = new StringBuilder("QA");
		
		System.out.println(name.hashCode());
		name = name.append(" Guru");
		System.out.println(name);
		System.out.println(name.hashCode());
		name = name.append(" Guru1");
		System.out.println(name.hashCode());
		name = name.append(" Guru2");
		System.out.println(name.hashCode());
		
		name.insert(2, "Guru");
		System.out.println(name);
		name.replace(1, 4, "THis");
		System.out.println(name);
		//System.out.println(name.reverse());
	}
}
