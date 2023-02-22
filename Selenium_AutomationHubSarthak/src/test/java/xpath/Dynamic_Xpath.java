package xpath;
//https://openweathermap.org/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Xpath {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");

		driver.findElement(By.xpath("//p[@id='signin_info']/child::a[1]")).click();
		driver.findElement(By.xpath(
				"//div[@id='div_login_error']/following-sibling::div[@class='table']/descendant::div[3]/child::input[1]"))
				.sendKeys("seleniumpanda");
		driver.findElement(By.xpath("//input[@id='remember']/preceding::input[@id='password']"))
				.sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='login1']/following::input[@class='signinbtn']")).click();
		
		driver.findElement(By.xpath("//div[@class='rd_header']/child::div[@class='rd_container']/child::div[@class='setting_rd']/child::a[@class='rd_logout']")).click();
		
		//System.out.println(driver.getCurrentUrl());
		
		
		  boolean rediffLogo =
		  driver.findElement(By.xpath("//a[@class='logo']/img")).isDisplayed();
		  
		  if(rediffLogo == true) { System.out.println("Rediff logo is displayed"); }
		  else { System.out.println("Rediff logo is not displayed"); }
		 
	}

}
