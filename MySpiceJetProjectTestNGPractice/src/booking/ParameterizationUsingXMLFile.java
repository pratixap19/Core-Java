package booking;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterizationUsingXMLFile {
	
	@Parameters({"URL", "Username", "Password"})
	@Test
	public void tc1(String url, String uname, String pwd) {
		
		System.out.println("My url is:" + url);
		System.out.println("My username is:" + uname);
		System.out.println("My password is:" + pwd);
	}

}
