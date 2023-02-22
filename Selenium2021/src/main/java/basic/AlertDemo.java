//H Y R tutorials are good to follow.
package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		// chromeDriver exe path
		WebDriverManager.chromedriver().setup();

		// opening Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// opening alert page [change path]
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		driver.switchTo().frame("iframeResult");

		WebElement tryButton = driver.findElement(By.xpath("//button[text()='Try it']"));

		tryButton.click();

		Alert al = driver.switchTo().alert();

		Thread.sleep(5000);

		String text = al.getText();
		System.out.println("Text of pop ups is " + text);
		
		al.accept();
		//al.dismiss();

	}

}
