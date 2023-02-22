package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//How to handle Bootstrap Dropdown in Selenium WebDriver by Mukesh Otwani
public class HandleBootstrapDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html?m=1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//button[@id='menu1' ]")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
        
        for(WebElement ele:elements) {
        	
        	String value=ele.getText();
        	System.out.println(value);
        	
            if(value.equalsIgnoreCase("JavaScript")) {
            	ele.click();
            	break;
        		
        	}
        	
        }
        
	}

}
