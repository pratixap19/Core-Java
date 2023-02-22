package com.variable;

public class ArrayExample {
	static int a = 10;
	int b;
	public static void main(String[]  args) {
		
		//DataType[] var or DataType []var or DataType var[]		
		//int a[] = { 10, 12, 30, 40, 50};
		int a[] = new int[5];
		a[0] = 12;
		a[1] = 20;
		a[2] = 30;
		a[3] = 15;
		a[4] = 16;
				
		System.out.println(a[4]);
		
		String name[] = new String[5];
		name[0] = "QA1";
		name[1] = "QA2";
		name[2] = "QA2";
		name[3] = "QA3";
		name[4] = "QA5";
		
		System.out.println(name[3]);
	}

}
