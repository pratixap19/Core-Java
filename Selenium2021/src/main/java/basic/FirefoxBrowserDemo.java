package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowserDemo {

	public static void main(String[] args) {
		
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}

}
