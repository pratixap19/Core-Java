package inheritance;
//Automation Testing Insider
public class AdvanceCalc extends Calc{
	
	public int multiplication(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) {
		
		Calc obj = new AdvanceCalc();//super class reference and sub class object. It will allow only data and methods of super class.
		System.out.println("Addition is " + obj.addition(4, 5) );
		//System.out.println("Multiplication is " + obj.multiplication(3, 7));
		
		//Calc obj1 = new Calc();//super class reference and super class object. It will allow only data and methods of super class.
		//System.out.println("Addition is " + obj1.addition(4, 5) );
		
		//AdvanceCalc obj2 = new AdvanceCalc();//sub class reference and sub class object. It will allow data and methods of super class and sub class.
		//System.out.println("Addition is " + obj2.addition(4, 5) );
		//System.out.println("Multiplication is " + obj2.multiplication(3, 7));
		
		//AdvanceCalc obj3 = new Calc();//sub class can't hold super class object.
		
	}

}
