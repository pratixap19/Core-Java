package com.variables;

public class LocalVeriableDemo {
	
	public void pupAge() 
	{
		int age = 7;
		
		String name = "Yoshi";
		
		System.out.println("Puppy age is:" + age);
		
		System.out.println("Puppy name is:" + name);
	}

	public static void main(String[] args) {
		
		LocalVeriableDemo pup = new LocalVeriableDemo();
		
		pup.pupAge();

	}

}
