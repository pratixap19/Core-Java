package exception;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ExceptionDemo4{
//compiletime exception ex. java.io.FileNotFoundException. file doesn't exist in the system.

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Program starts");
		
		File obj = new File("c://test.txt");
		FileReader rd = new FileReader(obj);
		
		System.out.println("Program ends");

	}
}

