//Data provider method is present in the different class.
package com.TestNG;

import org.testng.annotations.Test;

public class CustomDataProvider2 {
	
	@Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider1.class)
	public void loginTest(String email, String pwd) {
		
		System.out.println(email + " " + pwd);
	}

}
