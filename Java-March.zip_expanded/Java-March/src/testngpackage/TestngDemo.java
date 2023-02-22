package testngpackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	
	@Test
	public void b() {		
		Assert.assertEquals(false, false);
		System.out.println("test1");
	}
	
	@Test
	public void a() {
		System.out.println("test2");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void h() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void i() {
		System.out.println("After Test");
	}
		
	@BeforeMethod
	public void g() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void f() {
		System.out.println("After method");
	}
	
	@BeforeClass
	public void e() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void c() {
		System.out.println("After class");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

}