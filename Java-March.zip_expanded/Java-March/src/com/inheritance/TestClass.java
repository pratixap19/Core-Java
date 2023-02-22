package com.inheritance;

import com.operator.B;
import com.poly.MethodOverLoading;

public class TestClass {

	public static void main(String[] args) {
		
		AbstractClassA childObject = new ChildAbstractClass();
		childObject.sum();
		childObject.print();
		
		/*
		A a = new A();
		System.out.println(a.name);
		a.sum(10, 10);
		a.print();
		
		B b = new B();
		b.sum(10, 10); */
		
		
		/*
		Dog dog = new Dog();
		dog.eating();
		dog.bark();
		
		Cat cat = new Cat();
		cat.eating();
		cat.meow();
		
		Baby baby = new Baby();
		baby.bark();
		
		
		MethodOverLoading obj = new MethodOverLoading();
		obj.add(12, 24);
		obj.add("QA", 24);
		obj.add(); */
		
	}

}

