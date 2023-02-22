//Object initialization by using constructor
//Constructor is initialized as soon as object is created.
public class Employee {
    
	String name;
	int emp_id;
	
	Employee(String name, int emp_id)
	{
		this.name=name;
		this.emp_id=emp_id;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Dane", 101);
		System.out.println(e1.name + " " + e1.emp_id);
		
		Employee e2 = new Employee("Derek", 102);
		System.out.println(e2.name + " " + e2.emp_id);
		
		
		Employee e3 = new Employee("Dennis", 103);
		System.out.println(e3.name + " " + e3.emp_id);
		
		
	}

}
