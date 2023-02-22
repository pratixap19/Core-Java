package com.overriding;

public class Poly {

	public static void main(String[] args) {
		//Two t = new Two();
		//t.calculate(25);
		
		//One o = new One();
		//o.calculate(25);
		
		One o = new Two();//Polimorphism is applied.super class reference refers to sub class object.JVM decided which method is to be executed depending on the reference type used to call method.
		o.calculate(25);
		
		//if the methods in super class and sub class are public then writing 
		//One o = new Two(); will call sub class method.
		
		//if the methods in super class and sub class are static then writing 
		//One o = new Two(); will call super class method.
				
		
	}

}
