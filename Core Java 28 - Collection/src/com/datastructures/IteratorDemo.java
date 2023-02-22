package com.datastructures;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Orange");
		al.add("Apple");
		al.add("Grapes");
		al.add("Mango");
		
		Iterator<String> fruits = al.iterator();
		
		while(fruits.hasNext()) {
			
			System.out.println(fruits.next());
			
		}

	}

}
