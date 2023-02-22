package com.stringexample;

public class StringPerformance {
	
	public static void main(String args[]) {
		
		String str1= "Java";		
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<50000; i++) {
			str1 = str1 + i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		StringBuilder str2= new StringBuilder("Java");		
		long startTime1 = System.currentTimeMillis();
		
		for(int i=0; i<50000; i++) {
			str2.append(i);
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println(endTime1 - startTime1);
		
		StringBuffer str3 = new StringBuffer("Java");		
		long startTime2 = System.currentTimeMillis();
		
		for(int i=0; i<50000; i++) {
			str3.append(i);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2 - startTime2);
		
	}

}
