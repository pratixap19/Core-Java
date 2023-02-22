package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imp_Exp_Waits {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.className("signin")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='login1']"))));
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='rd_logout']"))));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		

	}

}
