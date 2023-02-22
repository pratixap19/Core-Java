package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testActions() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement source = driver.findElement(By.id("draggable"));	
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
		String value = driver.findElement(By.xpath("//div[@id=\"droppable\"]/p")).getText();
		System.out.println(value);
	}

	
	@Test
	public void testActionDragBy() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/dragabble");
		WebElement source = driver.findElement(By.id("dragBox"));	
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(source, 100, 100).build().perform();		
	}
	
	@Test
	public void testActionMouseMove() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/menu#");
		WebElement menu2 = driver.findElement(By.xpath("//ul[@id=\"nav\"]/li[2]/a"));			
		
		Actions action = new Actions(driver);	
		WebElement source = driver.findElement(By.xpath("//ul[@id=\"nav\"]/li[2]/ul/li/a"));
		action.moveToElement(menu2).pause(2000).click(source).build().perform();
	}
	
	
	@Test
	public void testActionMouseClick() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement button1 = driver.findElement(By.id("doubleClickBtn"));			
		
		Actions action = new Actions(driver);	
		action.doubleClick(button1).build().perform();
		
		WebElement button2 = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(button2).build().perform();
		
		WebElement button3 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.click(button3).build().perform();
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		//driver.quit();
	}
	
}
