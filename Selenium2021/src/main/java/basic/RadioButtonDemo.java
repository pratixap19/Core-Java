package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(5000);
		
		WebElement male=driver.findElement(By.xpath("//input[@value='2']"));
		
		System.out.println("Is displayed status :" + male.isDisplayed());
		
		System.out.println("Is enabled status: " + male.isEnabled());
		
		System.out.println("Is selected status :" + male.isSelected());
		
		male.click();

	}

}
