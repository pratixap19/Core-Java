package handlingWindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUps {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("THe parent handle is:" + parentWindowHandle);

		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			
			System.out.println(handle);

			if (!handle.equals(parentWindowHandle)) {

				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("Sarthak");
				driver.findElement(By.id("lastName")).sendKeys("Kumar");
				Thread.sleep(2000);
				driver.close();
				
			}

		}
		
		driver.switchTo().window(parentWindowHandle);
		boolean check = driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
		System.out.println("The control has come to parent window:" + check);
		
		if(check == true) {
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Selenium");
		}else {
			System.out.println("Control has not come back to parent window");
		}

	}

}
