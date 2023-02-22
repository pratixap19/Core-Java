package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {

		// chromeDriver.exe path
		WebDriverManager.chromedriver().setup();

		// opening chrome browser
		ChromeDriver driver = new ChromeDriver();

		// opening alert page [change path]
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		try {

			WebElement tryButton = driver.findElement(By.xpath("//button[text()='Try it']"));

			tryButton.click();

		}

		catch (Exception e) {

			driver.switchTo().frame("iframeResult");

			WebElement tryButton = driver.findElement(By.xpath("//button[text()='Try it']"));

			tryButton.click();

		}

		Alert al = driver.switchTo().alert();

		Thread.sleep(5000);

		String text = al.getText();
		System.out.println("Text of pop ups is " + text);

		al.accept();

	}

}
