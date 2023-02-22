package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Frames {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
		
		driver.switchTo().defaultContent();
		WebElement text1 = driver.findElement(By.xpath("//div[@id='framesWrapper']/child::div[1]"));
		System.out.println(text1.getText());
		

	}

}
