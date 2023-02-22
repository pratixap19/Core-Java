//Data provider method is present in the same class.

package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyDataProviderDemo {
	
	@Test(dataProvider = "LoginDataProvider")
	public void loginTest(String email, String pwd) {
		
		System.out.println(email + " " + pwd);
	}
	
    @DataProvider(name = "LoginDataProvider")
	public Object[][] getData() {

		Object[][] data = { { "abc@gmail.com", "abc" }, { "xyz@gmail.com", "xyz" }, { "mno@gmail.com", "mno" } };

		return data;

	}
}
