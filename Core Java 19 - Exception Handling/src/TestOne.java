//finally block. finally block is used to close files and clean up code.
public class TestOne {

	public static void main(String[] args) {
		try
		{
			int a=100, b=2, c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			
			e.printStackTrace();//e.printStackTrace() is used to print exception.
		}
		finally 
		{
			System.out.println("I am in finally block");
		}
		
		
	}

}
