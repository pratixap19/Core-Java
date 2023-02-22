package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@aria-label='Email or Phone Number']")).sendKeys("pratixap19@yahoo.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("preyusmit70");
		
		driver.findElement(By.xpath("//button[contains(@name, 'login')]")).click();
	}

}
