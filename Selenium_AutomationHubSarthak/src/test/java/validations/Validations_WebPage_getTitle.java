package validations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//getTitle(), getCurrentUrl()
public class Validations_WebPage_getTitle {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());

		String actualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedTitle = driver.getTitle();
		if (expectedTitle.equals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping")) {
			System.out.println("This is the correct landing page of Rediff");
		} else {
			System.out.println("This is the correct landing page of Rediff");
		}
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("This is the correct landing page of Rediff");
		} else {
			System.out.println("This is the correct landing page of Rediff");
		}
	}

}
