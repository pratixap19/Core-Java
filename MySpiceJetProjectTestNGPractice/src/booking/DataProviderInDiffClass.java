package booking;

import org.testng.annotations.DataProvider;

public class DataProviderInDiffClass {
	
	//dataProvider method
		@DataProvider(name = "LoginDataProvider")
		public Object[][] getData() {
			Object[][] data = {{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"pkp@gmail.com","pkp"}};
			return data;
		}

}
