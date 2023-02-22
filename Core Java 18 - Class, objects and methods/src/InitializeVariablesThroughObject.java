//Initialize class variables with object
public class InitializeVariablesThroughObject {
	
	int emiID;
	String empName;
	int salary;
	
	public void display() {
		System.out.println(emiID);
		System.out.println(empName);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		
		InitializeVariablesThroughObject emp1 = new InitializeVariablesThroughObject();
		emp1.empName = "Pratixa";
		emp1.emiID = 101;
		emp1.salary = 6000;
		emp1.display();

	}

}
