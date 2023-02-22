package exceptionHandlingCode;
//followed Automation Testing Insider tutorial-30
//runtime exception ex.java.lang.ArithmeticException
//try and multiple catch block. two catch block will not handle simultaneously.
public class ExceptionHandlingDemo1MultipleCatchBlock {

	public static void main(String[] args) {
		
		System.out.println("Program starts");
		
		try {
			int i= 10;
			System.out.println(i/0);
			String str = null;
			System.out.println(str.length());
			
		} catch (ArithmeticException e) {
			System.out.println("Handled Arithmetic Exception:" + e.getMessage());
			
		}catch(NullPointerException e) {
			System.out.println("Handled NullPointerException:" + e.getMessage());
			
		}
			
		System.out.println("Program ends");

	}

}
