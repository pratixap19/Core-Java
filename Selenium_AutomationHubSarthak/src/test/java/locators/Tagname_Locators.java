package locators;
import java.util.List;

import org.openqa.selenium.By;
//Find the name of all links.
//Generally tagname locators have multiple WebElements.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tagname_Locators {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.rediff.com");
    
   List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
   System.out.println("The total number of links in the webpage is:" + AllLinks.size());
   
   for(int i=0; i<AllLinks.size(); i++) {
	   System.out.println(AllLinks.get(i).getText());
   }
   
	}

}
