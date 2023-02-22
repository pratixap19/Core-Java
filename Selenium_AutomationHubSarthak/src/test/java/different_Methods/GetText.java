package different_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//getText() is a predefined method to retrieve text of a webElement but there are certain constrains. 
//It retrieves only static text.
public class GetText {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Rediffmail link
		String Rediffmaillink = driver.findElement(By.xpath("//a[@class='mailicon']")).getText();
		System.out.println("The text of the link is:" + Rediffmaillink);
		
		//Rediffmail logo - is an example where getText() 
		String RediffmailLogo = driver.findElement(By.xpath("//input[@id='OAS_subsection']/following::span[1]")).getText();
		System.out.println("The test of the logo is:" + RediffmailLogo);
		
		
		//Create account link
		String CALink = driver.findElement(By.xpath("//p[@id='signin_info']/child::a[2]")).getText();
		System.out.println("The text of create account link is:" + CALink );
		
		//LIVE text
		String LIVEtext = driver.findElement(By.xpath("//div[@id='last_traded_time']/following::b[@class='live']")).getText();
		System.out.println("The text of the live text is:" + LIVEtext);

	}

}
