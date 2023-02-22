//Data provider method is present in the different class.

package com.TestNG;

import org.testng.annotations.DataProvider;

public class CustomDataProvider1 {
	
	@DataProvider(name = "LoginDataProvider")
	public Object[][] getData() {

		Object[][] data = { { "abc@gmail.com", "abc" }, { "xyz@gmail.com", "xyz" }, { "mno@gmail.com", "mno" } };

		return data;

	}

}
