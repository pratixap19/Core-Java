package mouseActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
		
		Actions action = new Actions(driver);
		
		List<WebElement> totalFrame = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames are:" + totalFrame.size());
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//action.dragAndDrop(source, target).perform();
		action.clickAndHold(source).moveToElement(target).perform();
		
		driver.switchTo().defaultContent();
		

	}

}
