//Object initialization by using method.
public class AnimalBuzo {
	
	String color;
	int age;
	
	void initobj(String c, int a) 
	{
		color=c;
		age=a;
	}
	
	void display() 
	{
		System.out.println(color+ " " +age);
	}

	public static void main(String[] args) 
	{
		AnimalBuzo buzo=new AnimalBuzo();
		buzo.initobj("black", 10);
		buzo.display();
	}

}
