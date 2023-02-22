package com.TestNG;

import org.testng.annotations.Test;

public class TestGroups1 {
  @Test(groups= {"smoke"})
  public void tc_1() {
	  System.out.println("Smoke first test case");
  }
  @Test(groups= {"smoke"})
  public void tc_2() {
	  System.out.println("Smoke second test case");
  }
  @Test(groups= {"smoke"})
  public void tc_3() {
	  System.out.println("Smoke third test case");
  }
}
