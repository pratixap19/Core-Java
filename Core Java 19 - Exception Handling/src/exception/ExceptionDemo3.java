package exception;
//runtime exception ex. java.lang.NullPointerException
public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		System.out.println("Program starts");
		
		String str = "ABCD";
		str=null;
		System.out.println(str.length());
		
		System.out.println("Program ends");

	}

}
