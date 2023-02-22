package com.polymorphism;

class P{
	
	public void property() {

		System.out.println("land,house,gold");
	}

	public void marry() {
		System.out.println("Parent method: Meera"); // Overridden method
	}
}

class C extends P{
	
	public void marry() {
		System.out.println("Child method: Kareena");// Overriding method
	}
	
}

public class Test4 {

	public static void main(String[] args) {
		P p = new P();
		p.property();
		p.marry();
		
		C c = new C();
		c.marry();
		
		P p1 = new C();//parent class object can refer to child class object
		p1.marry();

	}

}
