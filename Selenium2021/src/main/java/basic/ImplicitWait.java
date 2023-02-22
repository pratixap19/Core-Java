package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {

		// chromeDriver exe path
		WebDriverManager.chromedriver().setup();

		// opening chrome browser
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		driver.findElement(By.id("email")).sendKeys("tester25@selenium.com");

		driver.findElement(By.id("passwd")).sendKeys("asdfgh");

		driver.findElement(By.id("SubmitLogin")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@title='Orders']")).click();
	}

}
