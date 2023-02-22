
public class Test {
	/*How method works?
	 * 1.In Java execusion starts from main method.
	 * 2.While you call instance method from static(main) method, you need to create object 
	 * of that class
	 * 3.Call instance method
	 * 4.When you call method, control goes from main method to the instance method that is called 
	 * invoking the method and execute the method
	 * 5.After method gets executed again control goes to main method and execute next line.
	 * */
	void disp() //instance method
	{
		int a = 10; //local variable
		System.out.println(a);
		System.out.println("Java Methods");
	}

	public static void main(String[] args) {
		Test t = new Test();//create object
		t.disp();//calling instance method
		System.out.println("Geekyshows");
	
		
	}

}
