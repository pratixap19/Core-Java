package booking;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//There are four users in the application.We test login functionality with 4 sets of data.Followed video of Supriya Baru.
public class DataProvideEx2 {
	
	@Test(dataProvider = "myData")
	public void login(String uname, String pwd) {
		System.out.println("Testcase 1 should run for 4 sets of data");
		System.out.println(uname + " " + pwd);
	}
	
	
	@DataProvider(name = "myData")
	public Object[][] myData() {
		
		Object[][] obj = new Object[4][2];
		obj[0][0] = "user1";
		obj[0][1] = "pwd1";
		
		obj[1][0] = "user2";
		obj[1][1] = "pwd2";
		
		obj[2][0] = "user3";
		obj[2][1] = "pwd3";
		
		obj[3][0] = "user4";
		obj[3][1] = "pwd4";
		
		return obj;
	}

}
