
public class Emp {
	
	String name;
	int emp_id;
	
	Emp(String name, int emp_id)
	{
		this.name=name;
		this.emp_id=emp_id;
	}

	public static void main(String[] args) {
		 
		Emp e1 = new Emp("Dane", 101);
		System.out.println(e1.name + " " + e1.emp_id);
		
		Emp e2 = new Emp("Derek", 102);
		System.out.println(e2.name + " " + e2.emp_id);
		
		
		Emp e3 = new Emp("Dennis", 103);
		System.out.println(e3.name + " " + e3.emp_id);

	}

}
