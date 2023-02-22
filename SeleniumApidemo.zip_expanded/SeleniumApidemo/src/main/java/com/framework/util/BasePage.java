/*
  Class to initialize all page methods for the actions available
  under that page. All scripts must call the respective methods from the respective
  pages to achieve any action.


 */
package com.framework.util;

import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public abstract class BasePage {

	private static final Logger logger = LoggerFactory.getLogger(BasePage.class);
	protected WebDriver driver;
	protected String title;
	protected long timeout = 60;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	/** Click action performed and then wait */
	public void waitAndClick(WebElement element) {
		logger.info("Waiting element " + element.toString());
		waitForElementVisible(element);
		clickOn(element);
	}

	public void clickOn(WebElement element) {
		logger.info("click on element " + element.toString());
		for (int i = 0; i < 3; i++) {
			try {
				element.click();
				break;
			} catch (StaleElementReferenceException | ElementNotVisibleException
					| ElementClickInterceptedException ex) {
				continue;
			}
		}
	}

	/** Click on WebElement by using java script */
	public void javaScriptClick(WebElement webElement) {
		logger.info("click on element " + webElement.toString());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 3; i++) {
			try {
				js.executeScript("arguments[0].click();", webElement);
				break;
			} catch (StaleElementReferenceException | ElementNotVisibleException
					| ElementClickInterceptedException ex) {
				continue;
			}
		}
	}

	public String returnTitle() {
		return title;
	}
	
	/** Input text as string */
	public void inputText(WebElement element, String text) {
		logger.info("inputText, text={}", text);
		// element.clear();
		waitForElement(element);
		element.sendKeys(text);
	}

	/** Input text as string */
	public void inputTextWitClear(WebElement element, String text) {
		logger.info("inputText, text={}", text);
		// element.clear();
		waitForElement(element);
		element.clear();
		element.sendKeys(text);
	}

	/** Wait for element to be present */
	public WebElement waitForElement(WebElement element) {
		logger.info("waitForElement" + element.toString());
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		try {
			return wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (StaleElementReferenceException | ElementClickInterceptedException ex) {
			return wait.until(ExpectedConditions.visibilityOf(element));
		}
	}

	public Alert waitForAlert() {
		logger.info("waitForAlert");
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.alertIsPresent());
	} 
	
	public void waitForUrlContains(String expectedString) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		ExpectedCondition<Boolean> urlIsCorrect = arg0 -> driver.getCurrentUrl().contains(expectedString);
		wait.until(urlIsCorrect);
	}

	/** Wait for element to be present */
	public WebElement waitForElementVisible(WebElement element) {
		logger.info("waitForElement" + element.toString());
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		try {
			return wait.until(ExpectedConditions.visibilityOf(element));
		}

		catch (StaleElementReferenceException ex) {
			return wait.until(ExpectedConditions.visibilityOf(element));
		}
	}

	
	/** Wait for JSLoad to load */
	public boolean _waitForJStoLoad() {
		// wait for jQuery to load
		ExpectedCondition<Boolean> jQueryLoad = driver -> {
			try {
				return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
			} catch (Exception e) {
				return true;
			}
		};

		/** wait for JavaScript to load */
		ExpectedCondition<Boolean> jsLoad = driver -> {
			Object rsltJs = ((JavascriptExecutor) driver).executeScript("return document.readyState");
			if (rsltJs == null) {
				rsltJs = "";
			}
			return rsltJs.toString().equals("complete") || rsltJs.toString().equals("loaded");
		};

		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(jQueryLoad) && wait.until(jsLoad);
	}

	

	/** Return driver instance */
	public WebDriver getDriver() {
		return driver;
	}

	/** Wait for element to be clickable */

	public WebElement waitForElementClickable(WebElement webElement) {
		WebElement element;
		try {
			// setWaitTimeToZero(driver);
			logger.info("wait for element to be clickable " + webElement.toString());
			WebDriverWait wait = new WebDriverWait(driver, 30);
			element = wait.until(ExpectedConditions.elementToBeClickable(webElement));

			// setWaitTime(driver, DEFAULT_WAIT_4_ELEMENT);
			return element;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	/** Verify that element is present */
	public Boolean isElementPresent(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (StaleElementReferenceException ex) {
			return element.isDisplayed();
		}
	}

	/** Verify that element is present */
	public Boolean isElementDisplay(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception ex) {
			return false;
		} catch (Error ex) {
			return false;
		}
	}

	/**
	 * Select element by visible text
	 *
	 * @param targetValue: visible text
	 */
	public void selectDropDownByText(WebElement element, String targetValue) {
		// waitForElementPresent(element);
		try {
			logger.info("selecting dropdown value " + targetValue + " for element " + element.toString());
			new Select(element).selectByVisibleText(targetValue);
		} catch (StaleElementReferenceException ex) {
			new Select(element).selectByVisibleText(targetValue);
		}
	}

	/** Select element by Index */
	public void selectDropDownByIndex(WebElement element, int index) {
		waitForElement(element);
		try {
			logger.info("selecting dropdown value at index " + index + " for element " + element.toString());
			new Select(element).selectByIndex(index);
		} catch (StaleElementReferenceException ex) {
			new Select(element).selectByIndex(index);
		}
	}

	/**
	 * Select element by value
	 *
	 * @param targetValue: value
	 */
	public void selectDropDownByValue(WebElement element, String targetValue) {
		waitForElement(element);
		try {
			logger.info("selecting dropdown value " + targetValue + " for element " + element.toString());
			new Select(element).selectByValue(targetValue);
		} catch (StaleElementReferenceException ex) {
			new Select(element).selectByValue(targetValue);
		}
	}

	
	/**
	 * @param element
	 */
	public void waitForWebElementPresent(WebElement element) {
		WebDriverWait ajaxWait = new WebDriverWait(driver, 30);
		ajaxWait.until(ExpectedConditions.visibilityOf(element));
	}


	/** Store text from a locator */
	public String getText(WebElement element) {
		_waitForJStoLoad();
		logger.info("getting text for element locator " + element.toString());
		waitForElementVisible(element);
		Assert.assertTrue(isElementPresent(element), "Element Locator :" + element + " Not found");
		try {
			return element.getText();
		} catch (StaleElementReferenceException ex) {
			return element.getText();
		}
	}

	/** Store text from a locator */
	public String getAttribute(WebElement element, String attributeName) {
		waitForWebElementPresent(element);
		logger.info("getting attribute " + attributeName + " for element locator " + element.toString());
		Assert.assertTrue(isElementPresent(element), "Element Locator :" + element + " Not found");
		try {
			return element.getAttribute(attributeName);
		} catch (StaleElementReferenceException ex) {
			return element.getAttribute(attributeName);
		}
	}

	
	public void moveToElement(WebElement element) {
		Actions builder = new Actions(driver);
		builder.moveToElement(element).build().perform();
	}

	public void moveAndClickOnElement(WebElement element) {
		Actions builder = new Actions(driver);
		builder.moveToElement(element).click(element).build().perform();
	}

	
	public void executeJsScroolToElement(WebElement element) {
		waitForElementVisible(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public boolean isCheckBoxSelected(WebElement element) {
		waitForElement(element);
		return element.isSelected();
	}

}