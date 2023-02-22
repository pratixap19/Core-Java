package com.datastructures;

import java.util.ArrayList;

public class ArratListDemo {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(20);
		ar.add("Pratixa");
		ar.add(13.12);
		ar.add("Nitin");
		
		System.out.println("The size of array is " + ar.size());
		System.out.println(ar);
		
		for(int i=0;i<ar.size();i++) {
			
			System.out.println("The element of array is " + ar.get(i));
			
		}
	}

}
