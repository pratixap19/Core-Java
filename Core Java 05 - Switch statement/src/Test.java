
public class Test {
        //Switch statement
	public static void main(String[] args) {
		
		char grade = 'E';
		
		switch(grade) {
		case 'A':System.out.println("Excellent");
			     System.out.println("Grade is: "+ grade);
			     break;
		case 'B':
			System.out.println("Good");
			System.out.println("Grade is: "+ grade);
			break;
		case 'C':
			System.out.println("Poor");
			System.out.println("Grade is: "+ grade);
			break;
		default :
			System.out.println("Please enter grade A, B or C");
		}
        System.out.println("The grade is : " + grade);
	}

}
