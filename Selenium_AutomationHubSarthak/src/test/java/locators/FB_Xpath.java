package locators;
//Xpath axes - video followed by SDET Selenium Locators part 3
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FB_Xpath {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Create New Account button
		driver.findElement(By.xpath("//div[@class='_6ltg']//a[contains(text(), 'Create new account')]")).click(); //or use this xpath. div[@class='_6ltg']/child::a
		
		//1. Find the sign -up button from the registration form present in the Facebook application.(Ex of child)
		//Sign Up button
		driver.findElement(By.xpath("div[@id='reg_form_box']/child::div[10]/button[@id='u_3_s_2P']")).clear();
		
		//2. Locate Firstname field from Sign Up button in FB application. (ex of parent)
		//button[@id='u_h_s_9+']/parent::div/parent::div/child::div[1]/div/div[1]
		
		//3.Identify the password from mobile number file in FB application.(ex of following)
		//input[@id='u_h_g_9O']/following::input[@id='password_step_input']
		
		//4.Locate mobile number from new password field in FB application.(Ex of preceding)
		//input[@id='password_step_input']/preceding::input[@id='u_h_g_9O']
		
		//5.Locate surname from female radio button in FB(Ancestor)
		//input[@id='u_h_4_G/']/preceding::input[@id='u_h_d_cW']
		//input[@id='u_h_4_G/']/ancestor::div[2]/div[1]/div/div[2]
		//input[@id='u_h_4_G/']/ancestor::div[2]//input[@id='u_h_d_cW']
		
		//6.Identify the search text from the Google search button present in the Google search home page.(ex of parent)
		//div[@class="FPdoLc lJ9FBc"]//input[@class='gNO89b']/preceding::input[@class="gLFyf gsfi"]
		//div[@class="FPdoLc lJ9FBc"]//input[@class='gNO89b']/parent::*/parent::*/parent::*/div//input[@class="gLFyf gsfi"]
		
		//7.Identify the Today's Deals link from the Amazon search text box present in the Amazon home page. (following)
		//input[@id='twotabsearchtextbox']/following::a[contains(text(), "Today's Deals")]
		
		//8.Identify the Hello, SignIn from the Amazon search text box in the Amazon home page.(Following)
		//input[@id='twotabsearchtextbox']/following::span[@id='nav-link-accountList-nav-line-1']
		
		//9.Identify Mobile link which is part of Menu bar - Amazon(Ex. of descendant)
		//div[@id="nav-xshop-container"]/descendant::a[contains(text(), 'Mobiles')]
		//div[@id="nav-xshop-container"]/div[@id="nav-xshop"]/a[2]
	}

}
