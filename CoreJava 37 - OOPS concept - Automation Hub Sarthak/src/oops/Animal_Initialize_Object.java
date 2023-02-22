package oops;

public class Animal_Initialize_Object {
	
	String color;
	int age;
	
	public void initializeObject(String c, int a) {
		
		color = c;
		age = a;
		
		System.out.println(color + " " + age);
		
	}
	
	/*
	 * public void display() { System.out.println(color + " " + age); }
	 */
	
	public Animal_Initialize_Object(String c, int a) {
		color = c;
		age = a;
		System.out.println(color + " " + age);
	}

	public static void main(String[] args) {
		
		Animal_Initialize_Object romeo = new Animal_Initialize_Object("White", 12);//initialize object with constructor.
		
		romeo.initializeObject("Fawn", 9);//initialize object with method
		//romeo.display();
		
		System.out.println(romeo.color = "Browm");//initialize object with reference variable
		System.out.println(romeo.age = 10);
	}

}
