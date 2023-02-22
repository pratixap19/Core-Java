package com.datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Raj");
		hm.put(200, "Rahul");
		hm.put(300, "Kiran");
		System.out.println("Number of elements after adding:" + hm);
		
		//retrive elements from HashMap
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		
		hm.remove(300);
		System.out.println(hm);
	}

}
