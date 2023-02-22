//Invoking overridden/parent class method from sub class using super keyword.
//We can call parent class method in overriding method using super keyword.
//with child class object we can call parent class method by using super keyword.
public class Test3 
{

	void show()//Overridden method
	{
		System.out.println("1");
	}
}

class Xyz extends Test3
{
	
	void show()//overriding method
	{
		super.show();//super invokes the parent class method.
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		Xyz ob=new Xyz();
		ob.show();

	}

}
