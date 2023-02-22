package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebLocatorPracticeFB {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//driver.findElement(By.xpath("//input[contains(@aria-label, 'Email or Phone Number')]")).sendKeys("pratixa@test.com");
	
	
		//driver.findElement(By.xpath("//input[@type='text'and @name='firstname']")).sendKeys("Pratixa");
	}
	

}
