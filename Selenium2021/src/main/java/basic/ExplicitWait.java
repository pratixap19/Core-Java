package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		
		// chromeDriver exe path
		WebDriverManager.chromedriver().setup();

		// opening chrome browser
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.findElement(By.id("email")).sendKeys("tester25@selenium.com");
		
		driver.findElement(By.id("passwd")).sendKeys("asdfgh");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Orders']"))));
		
		driver.findElement(By.xpath("//a[@title='Orders']")).click();

	}

}
