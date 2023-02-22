package uploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
  public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com");
		
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		driver.findElement(By.id("file-upload")).sendKeys("file path");
	}

}
