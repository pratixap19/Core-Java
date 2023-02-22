package com.datastructures;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();//allow adding any type of data elements.
		
		al.add("Welcome");
		al.add(10);
		al.add(10.45);
		al.add('c');
		
		System.out.println("Number of elements in array list after adding are:" + al.size());
		System.out.println("Elements in array list:" + al);
		
		for(Object a:al) {
			System.out.println(a);
		}
		
		//inserting elements into array list.
		al.add(2, "training");
		al.add(1, 1234);
		
		System.out.println("Number of elements in array list after adding are:" + al.size());
		System.out.println("Elements in array list:" + al);
		
		//removing elements from array list
		al.remove(2);
		System.out.println("Elements in array list:" + al);
		
	}

}
