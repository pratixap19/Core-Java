package locators;

//followed SDET video Selenium Locators part 1
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicLocators_LocatorsDemo_1 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");// id locator
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");// name locator
		driver.findElement(By.className("button")).click();// className locator
		// driver.findElement(By.linkText("Forgot your password?")).click();//linkText
		// locator
		// driver.findElement(By.partialLinkText("Forgot")).click();//partial link text

		int links = driver.findElements(By.tagName("a")).size();// tagName locator
		System.out.println("Total numbers of links are:" + links);

		driver.findElement(By.xpath("//span[@class='quickLinkText']")).click();// xpath customized locator
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}

}
