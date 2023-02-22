package basic;

import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEBrowserDemo {

	public static void main(String[] args) {
		
		WebDriverManager.iedriver().setup();
		
		//create object of InternetExplorerDriver class
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.get("https://www.google.com");
		
	}

}
