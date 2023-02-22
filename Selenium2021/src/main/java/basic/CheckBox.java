//HYR tutorials
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		WebElement checkbox = driver.findElement(By.id("englishchbx"));
		
		checkbox.click();
		
		Thread.sleep(5000);
		
		WebElement link = driver.findElement(By.linkText("Click here to navigate to the home page"));
		link.click();
		

	}

}
