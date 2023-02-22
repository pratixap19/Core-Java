package com.polymorphism;

public class MethodOverridingDemo {

	public void property() {

		System.out.println("land");
	}

	public void marry() {
		System.out.println("Parent method: Meera"); // Overridden method
	}
}

class Child extends MethodOverridingDemo {

		public void marry() {
			System.out.println("Child method: Kareena");// Overriding method
		}

	}

 class Test {

		public static void main(String[] args) {

			MethodOverridingDemo m = new MethodOverridingDemo();
			m.property();
			m.marry();

			Child c = new Child();
			c.marry();

		}

	}


