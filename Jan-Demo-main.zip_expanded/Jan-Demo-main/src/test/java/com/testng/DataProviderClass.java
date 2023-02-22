package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

	@Test(dataProvider = "TestData", dataProviderClass = DataProviderClass.class )
	public void loginTest(String user, String password) {		
		System.out.println(user + " " +password);
	}
		
	@DataProvider(name = "TestData")
	public Object[][] getData() {
		
		return new Object[][] {
			{"User1", "Pass1"},
			{"User2", "Pass2"},
			{"User3", "Pass3"}
		};		
	}
}
