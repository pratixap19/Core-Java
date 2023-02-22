
//Child class method will override parent class method.
//super keyword is used to refer parent class object.
package com.constructorOverloading;

public class Child extends Parent {
	
	public void show() {
		
		super.show();
		System.out.println("Child class method");
	}

}
