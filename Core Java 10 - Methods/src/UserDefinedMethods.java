
public class UserDefinedMethods {
  
	
	int result;
	
	//Method without returning any value
	public void helloWorld() {
		System.out.println("Hello world");
	}
	
	//static method
	public static void m1() {
		System.out.println("Hello");
	}
	
	//method with passing parameters and return value
	public int square(int a) {
		
		  result = a*a; 
		  return result;
		  
	}
	
	public void sayHi(String name) {
		System.out.println("Hi " + name);
	}
	
	public static void main(String[] args) {
		
		UserDefinedMethods obj = new UserDefinedMethods();
		
		obj.helloWorld();//method call using object
		
		m1();//method call without using object. Calling static method inside static method so no need to call with object.
		
		int x=obj.square(8);
		System.out.println(x);
		
		obj.sayHi("Pratixa");
		
		
 
	}

}
