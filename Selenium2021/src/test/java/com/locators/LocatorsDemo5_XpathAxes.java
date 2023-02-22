//followed SDET video part 3 Advance Xpath with Axes methods
package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo5_XpathAxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//Self
		String text=driver.findElement(By.xpath("//a[contains(text(),'Arvind Fashions')]/self::a")).getText();
		System.out.println("Link is " + text);
		
		//Parent
	    text=driver.findElement(By.xpath("//a[contains(text(),'Arvind Fashions')]/parent::td")).getText();
		System.out.println("Link is " + text);
		
		//Child
		List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(), 'Arvind Fashions')]/ancestor::tr/child::td"));
		int num = childs.size();
		System.out.println("Number of childs are " + num);
		
		//Ancestor
		 text = driver.findElement(By.xpath("//a[contains(text(), 'Arvind Fashions')]/ancestor::tr")).getText();
		System.out.println(text);
		
		//Descendant
		List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(), 'Arvind Fashions')]/ancestor::tr/descendant::td"));
		System.out.println("Number of descendants are " + descendant.size());
		
		//Following
		List<WebElement> followingNodes = driver.findElements(By.xpath("//a[contains(text(), 'Arvind Fashions')]/ancestor::tr/following::tr"));
		System.out.println("Number of following nodes are " + followingNodes.size());

		//Following-siblings
		List<WebElement> followingsiblings = driver.findElements(By.xpath("//a[contains(text(), 'Arvind Fashions')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following siblings are " + followingsiblings.size());
		
		//Preceding
		List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(), 'Arvind Fashions')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of preceding siblings are " + preceding.size());
		
		//Preceding-sibling
		List<WebElement> precedingsiblings = driver.findElements(By.xpath("//a[contains(text(), 'Arvind Fashions')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of preceding siblings are " + precedingsiblings.size());
		
		
	}

}
