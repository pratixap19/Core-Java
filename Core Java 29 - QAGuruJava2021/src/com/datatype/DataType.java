package com.datatype;

public class DataType {
	
	int a = 10;
	char ch = 'd';
	double d = 110.34;

	public static void main(String[] args) {
		byte b = 20;
		System.out.println("b=" + b);
		
		short s = 200;
		System.out.println("s=" + s);
		
		int i = 2000;
		System.out.println("i=" + i);
		
		long l = 20000;
		System.out.println("l=" + l);
		
		float f = 20.25f;
		System.out.println("f=" + f);
		
		double d = 220.12;
		System.out.println("d=" + d);
		
		char ch = 's';
		System.out.println("ch=" + ch);
		
		int ch1 = 'A';
		System.out.println("ch1=" + ch1);
		
		char ch2 = '&';
		System.out.println("ch2=" + ch2);
		
		char ch3 = '$';
		System.out.println("ch3=" + ch3);
		
		boolean status = true;
		
		String name[] = {"QA1","QA2","QA3", "QA4"};
		
		for(String x:name) {
			System.out.println(x);
		}
		
		float e[] = {12.34f, 67.02f, 80.12f};
		
		for(float y:e) {
			System.out.println(y);
		}

	}

}
