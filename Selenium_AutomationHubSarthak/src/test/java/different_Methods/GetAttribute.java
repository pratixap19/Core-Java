package different_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.className("signin")).click();
		
		//String attributeValue = driver.findElement(By.className("signin")).getAttribute("title");
		//System.out.println(attributeValue);
		//Thread.sleep(3000);
		
		String attributeValue1 = driver.findElement(By.xpath("//input[@class='signinbtn']")).getAttribute("title");
		System.out.println(attributeValue1);
		
		

	}

}
