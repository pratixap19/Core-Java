package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("pratixap19@yahoo.com");
		
		driver.findElement(By.name("pass")).sendKeys("preyusmit70");
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		
		
		
		}

}
