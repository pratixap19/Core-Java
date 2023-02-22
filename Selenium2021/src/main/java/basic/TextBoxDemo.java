package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		WebElement emailTextBox = driver.findElement(By.id("email"));

		// Is email textbox enabled?

		boolean isEnabledStatus = emailTextBox.isEnabled();
		System.out.println("Enable status is " + isEnabledStatus);

		// Enter value in textbox

		emailTextBox.sendKeys("Tom");
		//String name= emailTextBox.getText();
		//System.out.println(name);
		
		// Read the value of textbox

		String enteredValue = emailTextBox.getAttribute("value");

		System.out.println("Entered value is " + enteredValue);

		// Delete value in textbox
		
		emailTextBox.clear();

	}

}
