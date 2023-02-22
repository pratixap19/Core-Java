package com.poly;

public class MethodOverLoading {

	public void add() {
		System.out.println(10+20);
	}	
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b + c);
	}
	
	public void add( String name, String lName) {
		System.out.println(name + " " + lName);
	}
	
	public void add(String name, int a) {
		System.out.println(name+ a);
	}
	
	public void add(int a, String name) {
		System.out.println(name+ a);
	}
	
	
}
