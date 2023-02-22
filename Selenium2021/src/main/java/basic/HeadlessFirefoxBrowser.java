package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessFirefoxBrowser {

	public static void main(String[] args) {
		
		  WebDriverManager.firefoxdriver().setup();
		  FirefoxOptions option = new FirefoxOptions();
		  option.addArguments("--headless");
		  WebDriver driver = new FirefoxDriver(option);
		  driver.get("https://www.google.com");
		  System.out.println(driver.getCurrentUrl());

	}

}
