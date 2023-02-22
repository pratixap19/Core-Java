package com.datastructures;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.add(10);
		ls.add(20.00);
		ls.add("Pratixa");
         
		System.out.println(ls.size());
		System.out.println(ls.get(2));
		
		for(int i=0;i<ls.size();i++) {
			
			System.out.println(ls.get(i));
			
		}

	}

}
