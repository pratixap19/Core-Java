package booking;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookFlight {
	
	@BeforeTest
	public void beforTestTestCase() {
		
		System.out.println("This should run first");
		
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This code will run before every test");
	}
	
	@Test
	public void bookFlight_roundTrip_Testcase1() {
		
		System.out.println("Testcase 1");
		
	}
	
	@Test(dependsOnMethods= {"bookFlight_roundTrip_Testcase1"})
	public void bookFlight_roundTrip_Testcase2() {
		
		System.out.println("Testcase 2");
		
	}
	
	@Test
	public void bookFlight_OneWay_Testcase3() {
		System.out.println("Testcase 3");
		
	}
	
	@Test(enabled = false)
	public void bookFlight_OneWay_Testcase4() {
		System.out.println("Testcase 4");
		
	}
	
	@AfterTest
	public void afterTestTestCase() {
		
		System.out.println("This should run after all tests");
		
	}

}
