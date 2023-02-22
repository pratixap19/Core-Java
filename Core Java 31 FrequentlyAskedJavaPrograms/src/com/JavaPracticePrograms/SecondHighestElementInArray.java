package com.JavaPracticePrograms;

import java.util.Arrays;
//learn with KrishnaSandeep video
public class SecondHighestElementInArray {

	public static void main(String[] args) {
	
		int a[]= {1,20,5,6,26,10};
		Arrays.sort(a);//1,5,6,10,20,26
		System.out.println("First largest number=" + a[a.length-1]);
		System.out.println("Second largest number=" + a[a.length-2]);
		System.out.println("Third largest number=" + a[a.length-3]);
	}

}
