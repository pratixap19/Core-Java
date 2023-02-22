
interface I1
{
	public abstract void show();
}

//Interface supports multiple inheritance.
interface I2
{
   public abstract void display();	
}

public class Test implements I1, I2 {

	public void show() 
	{
		System.out.println("1");
	}
	
	public void display() 
	{
		System.out.println("2");
	}
	
	
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
		t.display();

	}

}


