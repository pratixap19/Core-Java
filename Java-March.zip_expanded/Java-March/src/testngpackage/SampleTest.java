package testngpackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest {

	@Parameters({ "UserName", "Password" })
	@BeforeClass()
	public void beforeclass(@Optional("Test") String userName, @Optional("Password1") String pass) {
		System.out.println("Running Class1*********************************************");
		System.out.println("User value " + userName);
		System.out.println("Pass value " + pass);
	}

	@Parameters({ "browser" })
	@Test
	public void f(@Optional("Chrome1") String browser) {
		System.out.println("Running f*********************************************");
		System.out.println("Browser value " + browser);

	}

	@Parameters({ "UserName", "Password" })
	@Test
	public void f1(@Optional("Test") String userName, @Optional("Password1") String pass) {
		System.out.println("Running f1*********************************************");
		System.out.println("User value " + userName);
		System.out.println("Pass value " + pass);
	}

}
