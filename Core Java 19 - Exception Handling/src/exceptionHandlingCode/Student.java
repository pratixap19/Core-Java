package exceptionHandlingCode;
//followed Automation Testing Insider tutorial-30
public class Student {
	
	public static void result(int marks) throws Exception {
		
		System.out.println("Start of tests");
		
		if(marks<40) 
			
		 throw new Exception("Student failed in exam");
		
		else 
			
			System.out.println("Student passed in exam");
		
		}

	public static void main(String[] args) throws Exception {
		
     result(45);
     System.out.println("End of tests");
	}

}
