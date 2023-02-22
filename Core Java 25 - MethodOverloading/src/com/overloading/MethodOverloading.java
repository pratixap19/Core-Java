package com.overloading;

public class MethodOverloading {

	int a;
	int b;

	void sum()// first
	{
		a = 10;
		b = 20;
		System.out.println(a + b);
	}

	void sum(int x, int y) // second
	{
		int a = x;
		int b = y;
		System.out.println(a + b);

	}

	void sum(int x, int y, int z) // third
	{
		System.out.println(x + y + z);
	}

	void sum(int x, double y) // fourth
	{
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		// call the first method
		// mo.sum();

		//call the second method
		//mo.sum(100, 200);

		// call the third method
		 mo.sum(15, 200, 100);

		// call the fourth method
		//mo.sum(15, 10.5);

	}

}
