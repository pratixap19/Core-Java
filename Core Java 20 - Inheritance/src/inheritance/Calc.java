//Automation Testing Insider
package inheritance;

public class Calc {
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	

	public static void main(String[] args) {
		
		Calc obj = new Calc();
		
		System.out.println("Addition is " + obj.addition(4, 5) );
		
	}

}
