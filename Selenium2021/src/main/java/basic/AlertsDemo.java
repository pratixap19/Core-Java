package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//H Y R tutorials
public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//simple alert
		driver.findElement(By.id("alertBox")).click();
		Alert alt = driver.switchTo().alert();
		String text1 = alt.getText();
		System.out.println(text1);
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		
		//confirmation alert
		driver.findElement(By.id("confirmBox")).click();
		Alert alt1 = driver.switchTo().alert();
		String text2 = alt1.getText();
		System.out.println(text2);
		Thread.sleep(2000);
		alt1.accept();
		Thread.sleep(2000);
		
		//prompt alert
		driver.findElement(By.id("promptBox")).click();
		Alert alt2 = driver.switchTo().alert();
		String text3 = alt2.getText();
		System.out.println(text3);
		alt2.sendKeys("Pratixa");
		//String text4 = alt2.getText();
		//System.out.println(text4);
		alt2.accept();
		System.out.println(driver.findElement(By.id("output")));
		
		
		driver.close();
		

	}

}
