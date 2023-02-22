////Initialize class variables with methods
public class InitializeVariablesThroughMethod {
	
	int emiID;
	String empName;
	int salary;
	
	public void setData(int id, String name, int sal) {
		
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
		
		InitializeVariablesThroughMethod emp = new InitializeVariablesThroughMethod();
		emp.setData(11, "Pratixa", 1000);
		emp.display();
		
	}

}
