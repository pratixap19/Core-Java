package com.JavaPracticePrograms;
//5!=5*4*3*2*1=120
public class FactorialNumber {

	public static void main(String[] args) {

		int num = 5;
		
		long factorial = 1;
		
		for (int i = 1; i <= num; i++) {
			
			factorial = factorial * i;//1*1=1,1*2=2,2*3=6, 6*4=24,24*5=120
		}
		System.out.println("Factorial number is:" + factorial);
	}

}
