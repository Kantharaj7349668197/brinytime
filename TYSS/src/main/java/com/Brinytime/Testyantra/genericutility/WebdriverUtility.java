package com.Brinytime.Testyantra.genericutility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	/**
	 * this method is used to maximize the window
	 * @param driver
	 */
	public void maximizeTheWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 *  this method is used to minimize the window
	 * @param driver
	 */
	public void minimizeTheWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	/**
	 *  this method is used to wait untill the page get loaded
	 * @param driver
	 */
	public void implicitwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * this method wait till title to be displayed
	 * @param driver
	 * @param title
	 */
	public void waitForTitle(WebDriver driver,String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(title));
	}
	/**
	 * this method wait till the url to be displayed
	 * @param driver
	 * @param url
	 */
	public void waitForUrl(WebDriver driver,String url) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(url));
	}
	/**
	 * this method wait till the element to be displayed
	 * @param driver
	 * @param element
	 */
	public void waitForElement(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * this method is to select the option in dropdown based upon index
	 * @param element
	 * @param index
	 */
	public void selectTheDropDown(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	/**
	 * this method is to select the option in dropdown based upon visible text
	 * @param element
	 * @param visibletext
	 */
	public void selectTheDropDown(WebElement element,String visibletext) {
		Select select=new Select(element);
		select.selectByVisibleText(visibletext);
	}
	/**
	 * this method is used to perform mouse overing
	 * @param driver
	 * @param element
	 */
	public void mouseOverOnElement(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	/**
	 * 
	 * @param element
	 */
	public void getAllOptionsFromDropDown(WebElement element) {
		Select select=new Select(element);
		List<WebElement> allOptions = select.getOptions();
		for (WebElement option : allOptions) {
			String text=option.getText();
			System.out.println(text);
		}
	}
	
	/**
	 * 
	 * this method is used to handle the fileupload popup
	 * @param element
	 * @param path
	 */
	public void fileUpload(WebElement element,String path){
		element.sendKeys(path);
	}
	/**
	 * 
	 * this method is used to create webdriverwait object and provide the time delay
	 * @param driver
	 */
	public void explicitWait(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	
}
	


