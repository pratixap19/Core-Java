//Method overriding
public class Test2 
{
 
	void show() 
	{
		System.out.println("1");
	}
	
}

class Emp extends Test2
{
	void show() 
	{
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.show();
		
		Emp e=new Emp();
		e.show();

	}
}
