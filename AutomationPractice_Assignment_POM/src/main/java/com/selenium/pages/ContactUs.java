package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactUs{
	
	WebDriver driver;
	
	public ContactUs(WebDriver driver) {
		this.driver = driver;
	}
	
	By dropdown = By.id("id_contact");
	By emailContactPage = By.xpath("//input[@id='email']");
	By msgTextArea = By.xpath("//textarea[@id='message']");
	By sendButton = By.xpath("//textarea[@id='message']");
	By msgVerify = By.xpath("//p[@class='alert alert-success']");
	
	public void selectdropdownOption() {
		
		WebElement dropdownBox = driver.findElement(dropdown);
        Select sec = new Select(dropdownBox);
		sec.selectByVisibleText("Customer service");
	}
	
	public void Email() {
		driver.findElement(emailContactPage).sendKeys("tester10@gmail.com");
	}
	
	public void Message() {
		driver.findElement(msgTextArea).sendKeys("Thank you");
	}
	
	public void Send() {
		driver.findElement(sendButton).click();
	}
	
	public void verifyMessage() {
		String text1 = driver.findElement(msgVerify).getText();
		System.out.println(text1);
		Assert.assertEquals(text1, "Your message has been successfully sent to our team.");
	}
	
	
}
