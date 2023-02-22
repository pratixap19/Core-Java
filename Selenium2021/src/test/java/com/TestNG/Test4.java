package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 {
	
	public class TestGroups1 {
		@Test(groups = {"smoke"})
		public void tc_1() {
			  System.out.println("Smoke first test case");
			  Assert.assertEquals("Test", "Test123");
		  }
		@Test(groups = {"smoke"}, dependsOnMethods = {"tc_1"})
		public void tc_2() {
			  System.out.println("Smoke second test case");
		  }
		@Test(groups = {"smoke"}, dependsOnMethods = {"tc_1"})
		public void tc_3() {
			  System.out.println("Smoke third test case");
		  }
	}
	}
	

