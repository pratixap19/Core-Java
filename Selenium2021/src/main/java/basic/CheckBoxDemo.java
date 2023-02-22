//Exception occured.

package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDemo {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		
		
		
		WebElement bike=driver.findElement(By.id("vehicle1"));
		bike.click();
		
		//isDisplayed
		//System.out.println("Is displayed status:" + bike.isDisplayed());
		
		//IsSelected
		//System.out.println("Is displayed status:" + bike.isSelected());
		
		//select
		
	}

}
