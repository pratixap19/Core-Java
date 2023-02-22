package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebLocatorPracticeOHRM {

	public static void main(String[] args) {

		// Setting up chromeDriver.exe path
		WebDriverManager.chromedriver().setup();

		// opening chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.findElement(By.xpath("(//input[contains(@type, 'text')])[2]")).sendKeys("Admin");
		
		//driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		
		//driver.findElement(By.xpath("//input[@class='button']")).click();
		
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		/*List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links are :" + allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++)
		{
			System.out.println(allLinks.get(i).getText());
		}*/
		
		
		
		
	}

}
