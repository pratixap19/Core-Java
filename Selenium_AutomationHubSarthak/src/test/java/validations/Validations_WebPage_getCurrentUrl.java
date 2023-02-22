package validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations_WebPage_getCurrentUrl {
public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("signin")).click();
		System.out.println(driver.getCurrentUrl());
		
		String actualCurrentUrl = "https://mail.rediff.com/cgi-bin/login.cgi";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		if(expectedCurrentUrl.equals(actualCurrentUrl)) {
			System.out.println("This is correct currentUrl of Rediff login page");
		}
		else {
			System.out.println("This is not correct currentUrl of Rediff login page");
		}
	}

}
