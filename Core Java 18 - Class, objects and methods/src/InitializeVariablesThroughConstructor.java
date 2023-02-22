//Initialize class variables with constructor.
public class InitializeVariablesThroughConstructor {
	
	int emiID;
	String empName;
	int salary;
	

	InitializeVariablesThroughConstructor(int id, String name, int sal)
	{
		emiID = id;
		empName = name;
		salary = sal;
	}
	
	public void display() {
		System.out.println(emiID);
		System.out.println(empName);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		
		InitializeVariablesThroughConstructor emp = new InitializeVariablesThroughConstructor(11, "Pratixa", 1000);
		emp.display();
	}

}
