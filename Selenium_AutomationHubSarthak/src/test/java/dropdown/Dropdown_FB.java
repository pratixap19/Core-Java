package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_FB {
	
	public static WebDriver driver;
	public static Select select;

	public static void main(String[] args) {
		
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[1]")).click();
     select = new Select(driver.findElement(By.xpath("//select[@id='day']")));
     //select.selectByIndex(2);//not good idea to use it
    // select.selectByValue("11");//not good idea to use it
    select.selectByVisibleText("19");//much advisable to use it.
    
    select = new Select(driver.findElement(By.id("month")));
    select.selectByVisibleText("Apr");
    
    select = new Select(driver.findElement(By.id("year")));
    select.selectByVisibleText("1970");
    
    
	}

}
