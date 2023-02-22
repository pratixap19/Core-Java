package com.JavaPracticePrograms;
//how to remove duplicate elements from array.
import java.util.HashSet;

public class RemoveDuplicatelemntFromArray {

	public static void main(String[] args) {
	
		int a[] = {2,3,2,5,6,8,9,5,8};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0; i<a.length; i++){
			hs.add(a[i]);
		}
		
		for(int no:hs) {
			System.out.println(no);
		}

	}

}
