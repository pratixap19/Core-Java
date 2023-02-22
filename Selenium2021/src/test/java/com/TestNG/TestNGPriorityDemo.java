package com.TestNG;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	@Test(priority = 2)
	public void tc_1() {
		  System.out.println("first test case");
	  }
	@Test(priority = -1)
	public void tc_2() {
		  System.out.println("second test case");
	  }
	@Test(priority = 1)
	public void tc_3() {
		  System.out.println("third test case");
	  }

}
