package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Demo {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com");

		Actions action = new Actions(driver);
		WebElement specifiedTarget = driver.findElement(By.xpath("//span[@id='spnMyAcc']"));
		action.moveToElement(specifiedTarget).perform();

	}

}
