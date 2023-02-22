package basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessDataDriven {

	public static void main(String[] args)
			throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();

		option.addArguments("--headless");

		// opening chrome browser
		ChromeDriver driver = new ChromeDriver(option);

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		File input = new File("C:\\Pratixa\\Study\\Selenium self study\\Selenium Tools\\Test data.xlsx");

		// workbook is an interface so can't create object of it so create object of
		// XSSFWorkbook class.

		XSSFWorkbook book = new XSSFWorkbook(input);

		XSSFSheet sheet = book.getSheetAt(0);

		String emailTestData = sheet.getRow(1).getCell(0).getStringCellValue();

		String passwordTestData = sheet.getRow(1).getCell(1).getStringCellValue();

		try {
			book = new XSSFWorkbook(input);
		} catch (InvalidFormatException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		driver.findElement(By.id("email")).sendKeys(emailTestData);
		
		System.out.println("Email is entered");

		driver.findElement(By.id("passwd")).sendKeys(passwordTestData);
		
		System.out.println("Password is entered");

		driver.findElement(By.id("SubmitLogin")).click();
		
		System.out.println("Login button is clicked");

		System.out.println("Username is " + emailTestData + "    " + "Password is " + passwordTestData);

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Orders']"))));

		driver.findElement(By.xpath("//a[@title='Orders']")).click();

	}

}
