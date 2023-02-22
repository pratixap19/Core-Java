package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SeleniumTest {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();	
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			driver.get("https://google.com/ncr");
			driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
			WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));
			System.out.println(firstResult.getAttribute("textContent"));
		} finally {
			driver.quit();
		}
	}

}
