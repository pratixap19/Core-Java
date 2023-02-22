package locators;
//followed SDET video Selenium Locators part 2
import org.openqa.selenium.By;
//Relative Xpath
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_Xpath_LocatorsDemo_2 {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php ");

		// Xpath with and operator
		driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("T-shirts");

		// Xpath with or operator
		driver.findElement(By.xpath("//button[@name='submit_search' or @class='btn btn-default button'-search]"))
				.click();
		
		//Xpath with contains() method
		driver.findElement(By.xpath("//a[contains(@class, 'sf-with')]")).click();//class="sf-with-ul"
		String txt = driver.findElement(By.xpath("//p[starts-with(@class,'sub')]")).getText();//class="subcategory-heading"
		System.out.println(txt);
		
		//xpath with text() method
		//driver.findElement(By.xpath("//b[text()='Cart']")).click();
		
		//chained Xpath
		//driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("T-shirt");//form[@id='searchbox']//input[4]
		//or
		//form[@id='searchbox']//input[//form[@id='searchbox']//input[@id='search_query_top']]
		//Search button
		//driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
		//or
		//form[@id='searchbox']/child::input[4]/following::button[1]
		
	}

}
