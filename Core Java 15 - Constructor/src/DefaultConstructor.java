
public class DefaultConstructor {
	
	public String empName;
	public int empID;
	
	public void display() {
		
		System.out.println(empName);
		System.out.println(empID);
	}

	public static void main(String[] args) {
		
		DefaultConstructor obj = new DefaultConstructor();
		obj.display();
		
		
	}

}
