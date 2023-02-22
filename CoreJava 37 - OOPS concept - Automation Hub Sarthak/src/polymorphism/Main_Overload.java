package polymorphism;
//Automation Hub Sarthak
//Main method can be overloaded.
public class Main_Overload {

	public static void main(String[] args) {
		System.out.println("This is the original main method");
		main(10);
		main(args = new String[3], args = new String[4]);
	}

	public static void main(int a) {
		System.out.println("This is the int parameter main method");
	}
	
	public static void main(String[] args1,  String[] args2) {
		System.out.println("This is the multiple parameter String Array"); 
	}
	
	

}
