package polymorphism;

public class MethodOverloading {

	public void display() {
		System.out.println("This is simple method");
	}

	public void display(int i) {
		System.out.println("This is single int parameter method");
	}

	public void display(int j, int k) {
		System.out.println("This is multiple int parameter method");
	}

	public void display(String s) {
		System.out.println("This is single String parameter method");
	}

	public void display(String s1, String s2 ) {
		System.out.println("This is multiple String parameter method");
	}
	
	public void display(StringBuffer s3) {
		System.out.println("This is StringBuffer parameter method");
	}
	
	public void display(StringBuilder s4) {
		System.out.println("This is StringBuffer parameter method");
	}
	
	public void display(Object obj) {
		System.out.println("This is Object class parameter method");
	}
	

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.display();
		obj.display(2);
		obj.display(10,20);
		obj.display("Hello");
		obj.display("Hello", "World");
		obj.display(new StringBuffer("Selenium"));
		obj.display(new StringBuilder("Automation"));
		//obj.display(Object obj1);
	}

}
