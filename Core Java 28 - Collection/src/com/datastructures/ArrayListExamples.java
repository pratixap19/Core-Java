package com.datastructures;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();//allows String type data elements.
		
		//adding elements to array list
		list.add("Raj");
		list.add("Rajiv");
		list.add("Raju");
		list.add("Rajnikant");
		list.add("Raja");
		System.out.println(list);
		System.out.println(list.size());
		//reading elements from array list
		
		for(String a:list)
		{
			System.out.println(a);
		}
	}

}
