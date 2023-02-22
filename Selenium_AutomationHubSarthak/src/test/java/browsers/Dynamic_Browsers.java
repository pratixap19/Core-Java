package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Browsers {
	
    public static WebDriver driver;
    
	public static void main(String[] args) {
		
		String browser = "firefox";
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://google.com");
			driver.manage().window().maximize();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get("https://paytm.com");
			driver.manage().window().maximize();
		}
		else if(browser.equals("InternetExplorer")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			driver.get("https://makemytrip.com");
			driver.manage().window().maximize();
		}
		else if(browser.equals("MicrosoftEdge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://flipkart.com");
			driver.manage().window().maximize();
		}
		else {
			System.out.println("None of the browsers are working");
		}
		

	}

}
