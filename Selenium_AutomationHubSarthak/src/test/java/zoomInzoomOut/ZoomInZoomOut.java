package zoomInzoomOut;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomInZoomOut {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Zoom in
		js.executeScript("document.body.style.zoom = '300%' ;");
		Thread.sleep(3000);
		//Zoom out
		js.executeScript("document.body.style.zoom = '30%' ;");
		Thread.sleep(3000);
		//Default size = 100%
		js.executeScript("document.body.style.zoom = '100%' ;");

	}

}
