package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//H Y R tutorials.
public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.id("name"));
		element.sendKeys("Hello");//main Webpage
		
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		
		
		WebElement element1 = driver.findElement(By.id("name"));
		element1.sendKeys("World");
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		WebElement DDElement = driver.findElement(By.id("course"));
		Select select = new Select(DDElement);
		select.selectByVisibleText("Java");
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("frame3");//Frame3
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Main Webpage");//main webpage
		
	}

}
