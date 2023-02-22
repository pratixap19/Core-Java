package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		WebElement element1 = driver.findElement(By.linkText("Electronics"));
		
		action.moveToElement(element1).build().perform();
		
		WebElement element2 = driver.findElement(By.linkText("Smart Watches"));
		action.moveToElement(element2).click().build().perform();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		
		

	}

}
