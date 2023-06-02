package com.Brinytime.Testyantra.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Ecommerce.brinytime.ObjectRepository.HomePage;
import com.Ecommerce.brinytime.ObjectRepository.LoginPage;
import com.Ecommerce.brinytime.ObjectRepository.Siginpage;

public class Baseclass {

	public WebdriverUtility webutils = new WebdriverUtility();
	public FileUtility fileutils = new FileUtility();
	public JavaUtility jutils = new JavaUtility();
	public static WebDriver driver;
     //@Parameters("browser")
	@BeforeClass//(groups = {"endtoend","smoke"})
	public void beforeclassconfig() throws IOException, InterruptedException {

		String browser = fileutils.getPropertyData1("browser");

		// which browser to be used

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}

		// maximize the browser window..
		webutils.maximizeTheWindow(driver);
		// to give implicit wait
		webutils.implicitwait(driver);
		webutils.explicitWait(driver);
		Thread.sleep(30000);
	}

	@BeforeMethod//(groups = {"endtoend","smoke"})
	public void beforemethod_config() throws Throwable {
		String URL = fileutils.getPropertyData1("URL");
		String username = fileutils.getPropertyData1("username");
		String password = fileutils.getPropertyData1("password");
		String carturl = fileutils.getPropertyData1("carturl");
		
		// trigger the url
		driver.get(URL);

		LoginPage loginpage = new LoginPage(driver);
		// click on login link
		loginpage.LoginToApp();

		// check whether signin page is displayed or not
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Signi-in"), "sigin page is not displayed");
		Reporter.log("siginpage is displayed");
		
		Siginpage siginpage = new Siginpage(driver);
		siginpage.siginwithCredentials(username, password);

		webutils.waitForUrl(driver, carturl);
		HomePage homepage = new HomePage(driver);
		String logotext = homepage.getHomepagelogo().getText();

	// check whether home page is displayed or not
		Assert.assertTrue(logotext.contains("Welcome"), "home page is not displayed");
		Reporter.log("home page is displayed");
	}
         
	@AfterMethod //(groups = {"endtoend","smoke"})
	public void aftermethod_config() {
		// click on logout button
		HomePage homepage = new HomePage(driver);
		homepage.getLogoutlink().click();

		// check whether login page is displayed or not by verifying its title

		String loginpageurl1 = driver.getCurrentUrl();
		Assert.assertTrue(loginpageurl1.contains("index.php"), "login page is not dipslayed");
		Reporter.log("loginpage is displayed");
	}

	@AfterClass// (groups = {"endtoend","smoke"})
	public void afterclass_config() {

		// to minimize the window and put in the task bar
		webutils.minimizeTheWindow(driver);

		//driver.close();
		driver.close();
	}
}
