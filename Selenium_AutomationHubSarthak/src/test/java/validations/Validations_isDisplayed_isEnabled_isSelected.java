package validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations_isDisplayed_isEnabled_isSelected {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");

		// isDisplayed()

		boolean rediffLogo = driver.findElement(By.xpath("//input[@id='OAS_subsection']/following::span[1]"))
				.isDisplayed();

		if (rediffLogo == true) {
			System.out.println("Rediff logo is displayed");
		} else {
			System.out.println("Rediff logo is not displayed");
		}

		// isEnabled()

		boolean signInLink = driver.findElement(By.xpath("//a[@class='signin']")).isEnabled();

		if (signInLink == true) {
			System.out.println("SignIn link is enabled");
		} else {
			System.out.println("SignIn link is not enabled");
		}

		// isSelected()

		driver.findElement(By.className("signin")).click();

		boolean keepmesignedinCheckbox = driver.findElement(By.id("remember")).isSelected();

		if (keepmesignedinCheckbox == true) {
			System.out.println("Checkbox is selected");
		} else {
			System.out.println("Checkbox is not selected");
		}

	}

}
