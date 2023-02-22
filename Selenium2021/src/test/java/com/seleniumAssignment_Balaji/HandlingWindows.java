//followed software testing mentor tutorial no 25.
//any opened new window or tab is handled same way.
package com.seleniumAssignment_Balaji;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
	}

	@Test
	public void getWindowTitle() {
// Iterator is an interface and it is used to retrieve elements form a collection.
		// driver.findElement(By.linkText("Click Here")).click();
		driver.findElement(By.xpath("//a[@target='_blank'][1]")).click();

		Set<String> windowhandles = driver.getWindowHandles();// getWindowHandles() will give parent and child windows.
		System.out.println(windowhandles);

		Iterator<String> i = windowhandles.iterator();// iterator() will iterate windows.Iterator is an interface.

		String parentWindow = i.next();// It will give parent window. next() method will return the next element in the list.
		System.out.println(parentWindow);

		String childWindow = i.next();// It will give child window.
		System.out.println(childWindow);

		driver.switchTo().window(childWindow);// control will move to child window.

		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("Current url is " + url);
		System.out.println("Title of the window is " + title);
		System.out.println(driver.getPageSource());

		driver.switchTo().window(parentWindow);

	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}

}
