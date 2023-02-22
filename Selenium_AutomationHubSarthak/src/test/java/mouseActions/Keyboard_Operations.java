package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Operations {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Actions action = new Actions(driver);
		
		WebElement username = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement signInButton = driver.findElement(By.className("signinbtn"));
		
		//action.click(username).sendKeys("seleniumpanda@rediffmail.com").perform();
		//action.click(password).sendKeys("Selenium@123").perform();
		//action.click(signInButton).perform();
		
		//Keyboard Operations involved keys are - Ctrl, Shift, Alt
		//Copy = Ctrl+C
		//Paste = Ctrl+V
		//Uppercase = Shift+Alphabet
		
		//This example will work on pages of registration where correspondence address is same as permanent address.
		action.click(username).sendKeys("seleniumpanda123456").perform();
		//Selection - Ctrl + A(Select All)
		action.keyDown(username, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		//Copying - Ctrl + C
		action.keyDown(username, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		//Pasting - Ctrl + V
		action.click(password).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		action.click(signInButton).perform();
		
		
	}

}
