/*
1.    Navigate url http://book.theautomatedtester.co.uk/
2.    Chick on Chapter1
3.    Check Radio button and verify Radio button checked
4.    Select “Selenium RC” Dropdown field
5.    Verify text “Assert that this text is on the page”
6.    Click on “load text to the page” button
7.    Verify Text loaded on Text box
8.    Click on “Click this link to launch another window” and verify new Window opened
9.    Verify Text on new window and close window
10.   Click on “Click this link to launch another window” link and verify text loaded
11.   Verify Button “Verify this button he here”
 */
package com.Selenium_Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario3 {

	WebDriver driver;

	@BeforeClass
	public void setup() {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

	}

	@Test
	public void book() {

		driver.navigate().to("http://book.theautomatedtester.co.uk/");

		driver.findElement(By.linkText("Chapter1")).click();

		WebElement radioButton = driver.findElement(By.xpath("//input[@id=\"radiobutton\"]"));

		radioButton.click();

		radioButton.isSelected();

		WebElement dropdown = driver.findElement(By.id("selecttype"));

		Select select = new Select(dropdown);

		select.selectByVisibleText("Selenium RC");

		WebElement message = driver.findElement(By.xpath("//div[@id='divontheleft']"));

		String text = message.getText();

		System.out.println(text);

		Assert.assertEquals(text, "Assert that this text is on the page");

		driver.findElement(By.xpath("//input[@id='secondajaxbutton']")).click();

		WebElement textbox = driver.findElement(By.xpath("//div[@id='html5div']"));

		String message1 = textbox.getText();

		System.out.println(message1);

		// Click on “Click this link to launch another window” and verify new Window
		// opened
		// Verify Text on new window and close window.
		driver.findElement(By.xpath("//div[@class='multiplewindow']")).click();

		// parent window title
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window id is " + parentWindow);
		System.out.println(driver.getTitle());

		Set<String> allWindows = driver.getWindowHandles();// it will return id/key of browser window

		/*
		 * for(String i:allWindows) { System.out.println(i); String title =
		 * driver.switchTo().window(i).getTitle(); System.out.println(title); //String
		 * textchildwindow = driver.findElement(By.id("")).getText();
		 * //System.out.println(textchildwindow);
		 * 
		 * }
		 */

		Iterator<String> itr = allWindows.iterator();

		while (itr.hasNext()) {
			String childwinID = itr.next();
			driver.switchTo().window(childwinID);
		}

		String str = driver.findElement(By.tagName("p")).getText();
		System.out.println(str);

		String str1 = driver.findElement(By.xpath("//p[@id = 'closepopup']")).getText();
		System.out.println(str1);

		driver.close();
		driver.switchTo().window(parentWindow);

		// Click on “Click this link to launch another window” link and verify text
		// loaded

		driver.findElement(By.xpath("//div[@class='multiplewindow2']")).click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {

			String childwinid2 = it.next();
			driver.switchTo().window(childwinid2);
		}

		String str3 = driver.findElement(By.xpath("//p[@id='popuptext']")).getText();
		System.out.println(str3);
		driver.close();
		
		driver.switchTo().window(parentWindow);

		// Verify Button “Verify this button he here”
		WebElement button = driver.findElement(By.xpath("//input[@id='verifybutton']"));

		button.isEnabled();

	}

}
