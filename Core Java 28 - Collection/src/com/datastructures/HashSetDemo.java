package com.datastructures;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
//HashSet doesn't work on index based. get() will not work with HashSet.
//While iterating value in HashSet we need to use Iterator. for loop will not work.
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("Pizza");
		hs.add(12);
		hs.add(12.45);
		hs.add("Pizza");
		
		System.out.println(hs.size());
		System.out.println(hs.contains("NY"));
		
		Iterator it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		

	}

}
