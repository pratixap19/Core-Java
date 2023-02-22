

public class ParameterizedConstructor{
	
	public String empName;
	public int empID;
	
	ParameterizedConstructor(String newName, int newID){
		this.empName = newName;
		this.empID = newID;
	}
	
	public void display() {
		System.out.println(empName);
		System.out.println(empID);
	}

	public static void main(String[] args) {
		
		ParameterizedConstructor obj1 = new ParameterizedConstructor("Nitin", 1234);
		ParameterizedConstructor obj2 = new ParameterizedConstructor("Pratixa", 4321);
		obj1.display();
		obj2.display();
		
		

	}

}
