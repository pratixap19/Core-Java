package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	// Constructor is created to initiate driver
	public LoginPage(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[text()='Log in']")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = "//a[text()='Logout']")
	@CacheLookup
	WebElement linkLogout;

	public void setUserName(String uname) {

		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd) {

		txtEmail.clear();
		txtEmail.sendKeys(pwd);
	}
	
	public void clicklogin() {
		btnLogin.click();
	}
	
	public void clicklogout() {
		linkLogout.click();
	}

}
