package superDemo;

public class EmpChild extends EmpParent{

	int empID  = 1234;
	String empName = "Amir";
	
	EmpChild(){
		super();//It is optional to write super() because it will call explicitly parent class constructor.
		System.out.println("This is child class constructor");	
		}
	
	public void empMethod() {
		
		System.out.println("This is child method");
	}
	
	public void showRecord(){
		//super.empMethod();
		System.out.println("Emp ID is:" + super.empID);
		System.out.println("Emp Name is:" + super.empName);
	}
	
	

	
	

}
