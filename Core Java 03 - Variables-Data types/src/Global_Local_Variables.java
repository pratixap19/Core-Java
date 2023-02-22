//Automation Hub Sarthak
public class Global_Local_Variables {
	//Global variables. They are initialized in the class itself.
	//Global variable can be made static and non static variables.
	static String name = "Sachin";
	static int age = 25;
	double height = 5.10;
	char c1='a';
	
	public void test() {//Local variables. Scope of their execution is inside the methods.
		                //Local variable are neither static nor non static.
		String name = "Guru";
		int age = 10;
		System.out.println("This method has two local variables");
	}
	
	public static void sample() {
		
		String name = "Naveen";
		int age = 11;
		System.out.println("This is static method with local variables");
		
	}

	public static void main(String[] args) {
		
		Global_Local_Variables obj = new Global_Local_Variables();
		obj.test();
		sample();
		obj.height = 6;
		System.out.println(obj.height);
		obj.c1='x';
		System.out.println(obj.c1);
		
	}

}
