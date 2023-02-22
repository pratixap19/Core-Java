package com.QAGuru99Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testActionsDragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}
	
	@Test
     public void testActionDragBy() {
	

		driver.navigate().to("https://demoqa.com/dragabble");
		WebElement source1 = driver.findElement(By.id("dragBox"));

		Actions action1 = new Actions(driver);
		action1.dragAndDropBy(source1, 0, 100).build().perform();
	}
	
	
	@Test
	public void testActionMouseMove() throws InterruptedException {
		
		driver.navigate().to("https://demoqa.com/menu#");
		WebElement menu2 = driver.findElement(By.linkText("Main Item 2"));
		
		Actions ac = new Actions(driver);
		WebElement source = driver.findElement(By.xpath(""));
		ac.moveToElement(menu2).pause(2000).click(source).build().perform();
	}
	
    @Test
	private void testActionMouseClick() {
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement button1 = driver.findElement(By.id("doubleClickBtn"));
		
		Actions action = new Actions(driver);
		action.doubleClick(button1).build().perform();
		
		WebElement button2 = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(button2).build().perform();
		
		WebElement button3 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.click(button3).build().perform();
	}

	

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		// driver.quit();
	}

}
