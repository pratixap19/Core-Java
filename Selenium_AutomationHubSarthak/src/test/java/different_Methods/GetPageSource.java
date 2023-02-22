package different_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPageSource {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		//one way of finding pagesource.
		//String doc = driver.getPageSource();
		//System.out.println("The document of the webpage is:" + doc);
		
		WebElement doc_webpage = driver.findElement(By.tagName("body"));
		System.out.println("Document context is:" + doc_webpage.getText());

	}

}
