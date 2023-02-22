package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TooltipDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement searchTxtBox = driver.findElement(By.xpath("//input[@name='q']"));
		
		String toolTipValue = searchTxtBox.getAttribute("title");
		
		System.out.println(toolTipValue);
		

	}

}
