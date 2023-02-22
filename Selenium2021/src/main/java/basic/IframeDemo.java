package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/button/");
		
		//switch inside iframe
		
		driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//button[text()='A button element'])[1]")).click();
		
		driver.switchTo().parentFrame();
		
		driver.close();
		
		
	}

}
