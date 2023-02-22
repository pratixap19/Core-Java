package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		WebElement loginBtn = driver.findElement(By.name("login"));

		System.out.println(loginBtn.isDisplayed());

		System.out.println(loginBtn.isEnabled());

		// get the name of the button

		System.out.println("Name of the button is :" + loginBtn.getText());

	}

}
