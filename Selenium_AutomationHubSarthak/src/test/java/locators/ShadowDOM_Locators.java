package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Locating elements in shadow DOM by SDET part 4
//for shadow DOM elements we need to use JavascriptExecutor
public class ShadowDOM_Locators {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://books-pwakit.appspot.com");

	}

}
