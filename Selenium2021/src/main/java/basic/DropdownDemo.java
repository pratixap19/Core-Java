package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement dropdownElement=driver.findElement(By.xpath("//select[@id='select-demo']"));
		
		Select dropdown = new Select(dropdownElement);
		
		//dropdown.selectByIndex(1);
		
		//dropdown.selectByValue("Tuesday");
		
		//dropdown.selectByVisibleText("Friday");
		dropdown.getFirstSelectedOption();//if you want to get first selected option from the single selection dropdown.
		
		List<WebElement> list = dropdown.getOptions();
		
		int count = list.size();
		
		System.out.println(count);
		
		System.out.println(list.get(5).getText());
		
		for(WebElement e:list)
		{
			System.out.println(e.getText());
		}
		
		//driver.close();

	}

}
