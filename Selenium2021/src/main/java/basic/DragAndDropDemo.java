package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
	    //WebDriverManager.iedriver().setup();
		 
		//WebDriverManager.edgedriver().setup();
		 
		//WebDriverManager.operadriver().setup();
		 
		//WebDriverManager.phantomjs().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement small = driver.findElement(By.id("draggable"));
		
		WebElement big = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(small, big).build().perform();
		
		//action.contextClick(small).build().perform();
		
		
	}

}
