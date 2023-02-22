package staticBlock;
//It is used to initialize the static data member.
//It is executed before the main method at the time of class loading.

public class StaticBlock {
	
	static String collegeName;
	
	static {
		
		collegeName = "XYZ";
		System.out.println("This is static block ");
		System.out.println("College name is "  + collegeName);
	}
	

	public static void main(String[] args) {
	
		System.out.println("This is main method");

	}

}
