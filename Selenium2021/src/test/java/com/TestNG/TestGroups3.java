package com.TestNG;

import org.testng.annotations.Test;

public class TestGroups3 {
	

	@Test(groups= {"regression"})
	  public void tc_7() {
		  System.out.println("Regression seventh test case");
	  }
	  @Test(groups= {"regression"})
	  public void tc_8() {
		  System.out.println("Regression eighth test case");
	  }
	  @Test(groups= {"regression"})
	  public void tc_9() {
		  System.out.println("Regression nineth test case");
	  }

}
