package com.Ecommerce.brinytime.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[text()='Welcome -Anuj Kumar']")
	private WebElement homepagelogo;

	
	@FindBy(xpath = "//a[text()='Home']")
	private WebElement homemajortab;
	
	@FindBy(xpath = "//div[contains(@class,'category-product  inner-top-vs')]//div[@class='product-info text-left']//a")
	private WebElement allproducts;
	
	@FindBy(xpath = "//li[@class='dropdown menu-item']//a[contains(.,'Electronics')]")
	private WebElement electronicsmajortab;

	
	@FindBy(xpath = "//div[@class='header-top-inner']//li[4]/a")
	private WebElement mycarticon;
	
	@FindBy(xpath = "//div[@class='col-md-12 col-sm-12 shopping-cart-table ']//table[@class='table table-bordered']//tbody//tr[1]/td[1]")
    private WebElement removecheckbox;	
	
	public WebElement getUpdateshoppingcartbutton() {
		return Updateshoppingcartbutton;
	}
	@FindBy(xpath = "//input[@value='Update shopping cart']")
	private WebElement Updateshoppingcartbutton;
	
	@FindBy(xpath = "//a[text()='Logout']")private WebElement logoutlink;
	
	@FindBy(name = "submit") private WebElement submitbutton;
	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	@FindBy(xpath = "//a[contains(.,'Mobiles')]")
	private WebElement mobileslink;

	@FindBy(xpath = "//a[contains(.,'Lenovo Vibe K5 Note (Gold, 32 GB)  ')]")
	private WebElement mobilephone;
	
	@FindBy(xpath = "//div[@class='col-md-12 col-sm-12 shopping-cart-table ']")
	private WebElement cartempty;

	public WebElement getcartempty() {
		return cartempty;
	}

	public WebElement getTrack() {
		return track;
	}
	@FindBy(xpath = "//div[@class='row inner-bottom-sm']//tbody//tr[1]//a[contains(.,'Track')]")
	private WebElement track;



	public WebElement getMobileslink() {
		return mobileslink;
	}

	public WebElement getMobilephone() {
		return mobilephone;
	}


	public WebElement getElectronicsmajortab() {
		return electronicsmajortab;
	}

	public WebElement getRemovecheckbox() {
		return removecheckbox;
	}
	
	public WebElement getmycarticon() {
		return mycarticon;
	}

	public WebElement getAllproducts() {
		return allproducts;
	}

	public WebElement getHomemajortab() {
		return homemajortab;
	}
	

	@FindBy(xpath = "//a[@data-toggle='tooltip']")
	private WebElement wishlisticon;
	
	public WebElement getWishlisticon() {
		return wishlisticon;
	}
	public WebElement getAddtocartButton() {
		return addtocartButton;
	}

	@FindBy(xpath = "//a[text()='Add to cart']")
	private WebElement addtocartButton;


	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getHomepagelogo() {
		return homepagelogo;
	}
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	public List<WebElement> allproductsApp(WebDriver driver)
	{
		List<WebElement>allproducts=driver.findElements(By.xpath("//div[contains(@class,'category-product  inner-top-vs')]//div[@class='product-info text-left']//a"));
		return allproducts;		
	}
	public void selectTheProductAddToCart(WebDriver driver)
	{
		getMobileslink().click();
		getMobilephone().click();
		getAddtocartButton().click();
		//click on mobiles link
		// we have to handle the popup and click on ok
		driver.switchTo().alert().accept();
	}
	public void selecttheElectronicsCategory(WebDriver driver) {
		getHomemajortab().click();
		getElectronicsmajortab().click();
	}
	public void ToRemoveProductFromCart(WebDriver driver) {
		getRemovecheckbox().click();
		getUpdateshoppingcartbutton().click();
		//to handle the popup
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
	}
		
}
	

