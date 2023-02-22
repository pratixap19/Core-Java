package exceptionHandlingCode;
//followed Automation Testing Insider tutorial
//runtime exception ex.java.lang.ArithmeticException
//try catch block
public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Program starts");
		//Select code where exception may accur. Right click and select option surround with try catch block. 
		//It will automatically write try catch block.
		try {
			int i= 10;
			System.out.println(i/0);
		} catch (Exception e) {
			System.out.println("Arithmetic Exception:" + e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("Program ends");

	}

}
