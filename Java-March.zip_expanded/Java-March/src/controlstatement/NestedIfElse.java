package controlstatement;

public class NestedIfElse {

	public static void main(String[] args) {
			
		int year = 2021;
		if( year%4 == 0) {
			if(year %100 == 0 && year%400 !=0) {
				System.out.println("Not leap year");
			}
			else {
				System.out.println("Leap Year");
			}			
		}else {
			System.out.println("not leap year");
		}
		
	}
}
