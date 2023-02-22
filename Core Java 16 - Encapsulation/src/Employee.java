
class Employee {
	
	private int empid;//by using private modifier we can make variable safe and secure. To access private variable
	//we need to use setter and getter methods. 
	
	public void setEmpid(int eid)// setter method is used to modify data(variable)
	{
		empid=eid;
	}
    public int getEmpid()//getter method is used to view data(variable)
    {
    	return empid;
    }
    
    public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpid(105);
		System.out.println(e.getEmpid());

	}
}


   

    



	
	


