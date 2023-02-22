package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		//driver.findElement(By.linkText("Forgot Password?")).click();
		
		driver.findElement(By.partialLinkText("Forgot")).click();
	}

}
