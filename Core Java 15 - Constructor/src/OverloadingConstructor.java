
public class OverloadingConstructor {
	
	public String empName;
	public int empID;
	public int empAge;
	
	OverloadingConstructor(String newName, int newID){
		this.empName = newName;
		this.empID = newID;
	}
	
	OverloadingConstructor(String newName, int newID, int empAge){
		this.empName = newName;
		this.empID = newID;
		this.empAge = empAge;
	}
	
	public void display() {
		System.out.println(empName);
		System.out.println(empID);
		System.out.println(empAge);
	}

	public static void main(String[] args) {
		
		OverloadingConstructor obj1 = new OverloadingConstructor("Nitin", 1234);
		OverloadingConstructor obj2 = new OverloadingConstructor("Pratixa", 4321, 52);
		obj1.display();
		obj2.display();
		

	}

}
