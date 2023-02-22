

package com.inheritance;

public class MainClass {

	public static void main(String[] args) {
		Base base = new Base();
		base.print();
		
		
		Child  child = new Child();
		child.print();
		System.out.println(child.name);
		System.out.println(child.a);
		
		MethodOverloading methodObject = new MethodOverloading();
		
		int a = methodObject.add(10, 20);
		System.out.println(a);
		
		String name = methodObject.add("Pratixa", "Patel");
		System.out.println(name);
		
		int b = methodObject.add(2, 3, 4);
		System.out.println(b);
		
	}

}
