package booking;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {
	//dataProvide method in different class(DataProviderInDiffClass.class).
	//actual test case.
	@Test(dataProvider = "LoginDataProvider", dataProviderClass=DataProviderInDiffClass.class)
	public void loginTest(String email, String pwd) {
		System.out.println(email + " "  + pwd);
	}
	
	

}
