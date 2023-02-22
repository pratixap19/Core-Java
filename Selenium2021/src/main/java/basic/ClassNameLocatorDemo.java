package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassNameLocatorDemo {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		 List<WebElement> allTextBox = driver.findElements(By.className("inputtext"));
		 
		 System.out.println("Total number of textboxes are " + allTextBox.size());
		 
		 allTextBox.get(0).sendKeys("tester@gmail.com");
		 
		 allTextBox.get(1).sendKeys("asdfgh");
	}

}
