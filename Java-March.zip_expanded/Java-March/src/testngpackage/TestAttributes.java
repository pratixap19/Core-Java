package testngpackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestAttributes {
	
	boolean status = false;
	
	@Test(priority = 3, description = "User is able to signup in application")
	public void signup() {
		System.out.println("Test 2");
		Assert.fail();
	}

	@Test(priority = 2, dependsOnMethods = {"signup"}, alwaysRun = true )
	public void loginWithNewUser() {
		System.out.println("Test 4");
	}

	@Test(priority = 2, enabled = false)
	public void test1() {
		System.out.println("Test 1");
	}

	@Test(priority = 3)
	public void test3() {
		System.out.println("Test 3");
	}
	
	@AfterClass(alwaysRun =  true)
	public void tearDown() {
		
	}

}
