package com.JavaPracticePrograms;

import java.util.HashSet;

public class RemoveDuplicateelements {
//Deepak video
	public static void main(String[] args) {
		
		int a[]= {2, 3, 2, 5, 6, 8, 9, 5, 8};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		
		for(int num:hs) {
			System.out.println(num);
		}
		

	}

}
