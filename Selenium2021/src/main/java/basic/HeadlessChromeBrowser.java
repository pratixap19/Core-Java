package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeBrowser {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getCurrentUrl());

	}

}
