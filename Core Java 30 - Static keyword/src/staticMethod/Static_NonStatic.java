//non static members can call static and non static members.
//Automation Hub Sarthak
package staticMethod;

public class Static_NonStatic {
	
	public static void test() {
		System.out.println("This is a static test method");
		//sample();
	}
	
	public static void sample() {
		System.out.println("This is a non static sample method");
		//test();
	}
	
	public void coding() {
		System.out.println("This is a non static method known as a coding method");
		test();
		sample();
		debugging();
	}
	
	public void debugging() {
		System.out.println("This is a non static method known as a bugging method");
	}

	public static void main(String[] args) {
		
		Static_NonStatic obj = new Static_NonStatic();
		test();
		test();
		sample();
		sample();
		Static_NonStatic.test();
		Static_NonStatic.sample();
		
		obj.coding();
		obj.debugging();
	}

}
