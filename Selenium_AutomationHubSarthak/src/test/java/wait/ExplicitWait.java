package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		wait = new WebDriverWait(driver,10);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("signin")));
		driver.findElement(By.className("signin")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login1")));
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
		boolean signinButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("signinbtn"))).isEnabled();
		if(signinButton == true) {
			driver.findElement(By.className("signinbtn")).click();
			System.out.println("The signinButton is enabled");
		}else {
			System.out.println("The signinButton is not enabled");
		}
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("rd_logout")));
		driver.findElement(By.className("rd_logout")).click();
	}

}
