package com.TestNG;

import org.testng.annotations.Test;

public class TestGroups2 {
	
	@Test(groups= {"regression"})
	  public void tc_4() {
		  System.out.println("Regression fourth test case");
	  }
	  @Test(groups= {"regression"})
	  public void tc_5() {
		  System.out.println("Regression fifth test case");
	  }
	  @Test(groups= {"regression"})
	  public void tc_6() {
		  System.out.println("Regression sixth test case");
	  }

}
