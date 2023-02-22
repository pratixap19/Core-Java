package com.framework.util;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.aventstack.extentreports.Status;
import com.framework.report.ReportTestManager;

import io.github.bonigarcia.wdm.WebDriverManager;

enum DriverType {
	Firefox, IE, Chrome, Safari
}

public abstract class BaseTest {

	private static final Logger logger = LoggerFactory.getLogger(BaseTest.class);
	private static final String BREAK_LINE = "\n";// "</br>";

	private String browserType;
	private WebDriver driver;
	protected String applicationUrl;
	protected String userName;
	protected String password;

	@BeforeClass
	public void setUp() throws Exception {

		browserType = Configuration.readConfigFile("Browser");
		this.applicationUrl = Configuration.readConfigFile("AppUrl");
		this.userName = Configuration.readConfigFile("UserName");
		this.password = Configuration.readConfigFile("Password");

		if (DriverType.Firefox.toString().toLowerCase().equals(browserType.toLowerCase())) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (DriverType.IE.toString().toLowerCase().equals(browserType.toLowerCase())) {
			WebDriverManager.iedriver().setup();
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			driver = new InternetExplorerDriver();

		} else if (DriverType.Chrome.toString().toLowerCase().equals(browserType.toLowerCase())) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			throw new Exception("Please pass a valid browser type value");
		}

		// Maximize window
		driver.manage().window().maximize();

		// Delete cookies
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void setTest(Method method) {		
		getWebDriver().get(applicationUrl);
	}

	@AfterClass
	public void afterClass() throws IOException, InterruptedException {
		driver.quit();
	}

	public WebDriver getWebDriver() {
		return driver;
	}
	

	/**
	 * Report logs
	 *
	 * @param : message
	 */
	public void reportLog(String message) {
		if (ReportTestManager.getTest() != null)
			ReportTestManager.getTest().log(Status.PASS, message);
		logger.info("Message: " + message);
		message = BREAK_LINE + message;
		Reporter.log(message);
	}

	public void reportFailLog(String message) {
		if (ReportTestManager.getTest() != null)
			ReportTestManager.getTest().log(Status.FAIL, message);
		logger.info("Message: " + message);
		message = BREAK_LINE + message;
		Reporter.log(message);
	}
}