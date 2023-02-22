package com.constructorOverloading;

public class Sample {

	public Sample() {
		System.out.println("no paramiterized constructor");
	}

	public Sample(int a) {
		System.out.println("One argument constructor");
	}

	public Sample(int b, double d) {
		System.out.println("Two argument constructor");
	}

	public Sample(char c, int b, String s) {
		System.out.println("Three argument constructor");

	}

	public static void main(String[] args) {

		Sample obj = new Sample(4);
		Sample obj1 = new Sample(3, 4.6);
		Sample obj2 = new Sample('P', 5, "Preya");
		Sample obj3 = new Sample();
	}

}
