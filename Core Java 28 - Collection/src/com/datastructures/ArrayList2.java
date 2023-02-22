package com.datastructures;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("ann");
		al.add("anna");
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove("ann");
		System.out.println(al);
	}

}
