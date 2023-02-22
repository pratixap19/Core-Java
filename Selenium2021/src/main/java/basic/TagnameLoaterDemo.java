package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagnameLoaterDemo {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//Tagname locator is mainly used to identify multiple locators.
		
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	
	System.out.println("Total number of links are :"+ allLinks.size());
	
	for(int i=0; i<allLinks.size(); i++)
	{
		System.out.println(allLinks.get(i).getText());
	}
	}

}
