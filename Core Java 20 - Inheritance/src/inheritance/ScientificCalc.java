//Automation Testing Insider
package inheritance;
//multilevel inheritance
public class ScientificCalc extends AdvanceCalc {
	
	public int division(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		ScientificCalc obj = new ScientificCalc();
		System.out.println("Addition is " + obj.addition(4, 5) );
		System.out.println("Multiplication is " + obj.multiplication(3, 7));
		System.out.println("Addition is " + obj.division(24, 8) );
	}

}
