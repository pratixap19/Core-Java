package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		
		WebElement signinLink = driver.findElement(By.className("signin"));
		String tooltipvalue = signinLink.getAttribute("title");
		System.out.println("The value of the tool tip is:" + tooltipvalue);
		
		
		

	}

}
