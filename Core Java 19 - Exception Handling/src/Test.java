
public class Test {
//try catch block
	public static void main(String[] args) {
	try
	{
		int a=100, b=0, c;
		c=a/b;
		System.out.println(c);
	}
	catch(Exception e)
	{
		//System.out.println("Number can't devide by zero");
		e.printStackTrace();//e.printStackTrace() is used to print exception.
	}
	
	System.out.println("Hello");
	}

}
