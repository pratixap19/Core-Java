package com.apitest.datadriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.util.Read_XLS;

public class DataProviders {

	static String  testDataSheet = "TestData.xlsx";

	
	@DataProvider(name = "UserData")
	public static Object[][] GetPetsBy() {
		Read_XLS read = new Read_XLS(testDataSheet, "data/");
		Object[][] objs = new Object[read.retrieveNoOfRows("Userdetails") - 1][read.retrieveNoOfCols("Userdetails")];
		objs = read.retrieveTestData1("Userdetails");		
		return objs;
	}
	
	
	
	
	@Test(dataProvider = "UserData")
	public void testData(String userName, String password) {	
		
		System.out.println(userName + "	" + password);
	}
}
