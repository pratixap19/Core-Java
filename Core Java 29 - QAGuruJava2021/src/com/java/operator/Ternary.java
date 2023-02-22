package com.java.operator;

public class Ternary {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 25;
		
		int min = (a>b) ? a:b;
		
		System.out.println(min);
		
		//int min1 = (a<b) ? a:b;
		
		
		int min1 =0;
		if(a>b)
		{min = b;}
		else
		{min = a;}
		
		System.out.println(min1);
		
		
		
		//String str = (c%2 == 0) ? "Even number" : "Odd number";
		
		//System.out.println(str);

	}

}
