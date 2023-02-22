package locators;
//followed SDET video Selenium Locators part 3
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Advanced_Xpath_Axes_LocatorsDemo_3 {

	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();

		// self
		String text = driver.findElement(By.xpath("//a[contains(text(), 'Prakash Indus')]")).getText();
		System.out.println(text);// Prakash Indus

		// parent
		text = driver.findElement(By.xpath("//a[contains(text(), 'Prakash Indus')]/parent::td")).getText();
		System.out.println(text);// Prakash Indus

		// child
		
		  int child = driver .findElements(By.
		  xpath("//a[contains(text(), 'Prakash Indus')]/ancestor::tr[1]/child::td")).
		  size(); System.out.println("Total child elements are:" + child);
		 
		//you can write code as below as well.
		/*
		 * List<WebElement> child = driver .findElements(By.
		 * xpath("//a[contains(text(), 'Prakash Indus')]/ancestor::tr[1]/child::td"));
		 * System.out.println("Total child elements are:" + child.size());
		 */
		
		//Ancestor
		 text = driver.findElement(By.xpath("//a[contains(text(), 'Prakash Indus')]/ancestor::tr")).getText();
		System.out.println(text);
		
		//descendant
		List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(), 'Prakash Indus')]/ancestor::tr/descendant::*"));
		System.out.println("Total descendants are:" + descendants.size());
		
		//following
		List<WebElement> followingNodes = driver.findElements(By.xpath("//a[contains(text(), 'Prakash Indus')]/ancestor::tr/following::tr"));
		System.out.println("Number of following nodes are:" + followingNodes.size() );
		
		//following-sibling
		List<WebElement> followingsiblings = driver.findElements(By.xpath("//a[contains(text(), 'Prakash Indus')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following siblings are:" + followingsiblings.size() );
		
		//preceding
		List<WebElement> precedingNodes = driver.findElements(By.xpath("//a[contains(text(), 'Prakash Indus')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of precedings are:" + precedingNodes.size());
		
		//preceding-sibling
		List<WebElement> precedingSiblings = driver.findElements(By.xpath("//a[contains(text(), 'Prakash Indus')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of preceding-siblings are:" + precedingSiblings.size());
	}

}
