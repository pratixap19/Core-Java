package testngpackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
			
	@Test
	public void test2() {
		SoftAssert soft = new SoftAssert();
		
		String wel = "Welcome QA";
		
		soft.assertEquals(1, 2, "Both values are not equals");
		System.out.println("Step after integer values verification");
		
		soft.assertEquals("Welcome QA", "Welcome");
		System.out.println("Code After String verification");
		
		soft.assertNotEquals(true, false, "");
		
		soft.assertTrue(wel.contains("QA"), wel+" not contains QA");
		
		soft.assertFalse(wel.contains("QA"), "Expected false but found true");
		System.out.println("End execution");
		
		soft.assertAll();
	}
	
	
	@Test
	public void test1() {
		String wel = "Welcome QA";
		
		Assert.assertEquals(1, 1, "Both values are not equals");
		System.out.println("Step after integer values verification");
		
		Assert.assertEquals("Welcome QA", "Welcome QA");
		System.out.println("Code After String verification");
		
		Assert.assertNotEquals(true, false, "");
		
		Assert.assertTrue(wel.contains("QA"), wel+" not contains QA");
		
		Assert.assertFalse(wel.contains("QA"), "Expected false but found true");
		
	}

}
