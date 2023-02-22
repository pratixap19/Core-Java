
//exception accrued.
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_images_style");

		WebElement img = driver.findElement(By.xpath("(//img[@src='html5.gif'])[2]"));

		System.out.println(img.getCssValue("width"));

		System.out.println(img.getCssValue("height"));
		
		img.click();
	}

}
