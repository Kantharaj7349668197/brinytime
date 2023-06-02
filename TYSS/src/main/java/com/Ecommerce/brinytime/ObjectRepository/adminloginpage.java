package com.Ecommerce.brinytime.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adminloginpage {
	
	//declaration
	
	@FindBy(id = "inputEmail")
	private WebElement usernametextfield;
	
	public WebElement getUsernametextfield() {
		return usernametextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	@FindBy(id = "inputPassword")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//a[text()='Sub Category ']")
	private WebElement createsubcategorybtn;
	
	@FindBy(name = "category")
	private WebElement categorydropdown;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter SubCategory Name\"]")
	private WebElement inputcategory;
	
	@FindBy(xpath = "//button[text()=\"Create\"]")
	private WebElement createSubCategory;
	
	@FindBy(xpath = "//tbody//tr/td[2]")
	private List<WebElement> subCategoryList;
	
	@FindBy(xpath = "//td[text()='\"+inputsubcat+\"']//../descendant::i[@class=\"icon-edit\"]")
	private WebElement editButton;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter category Name\"]")
	private WebElement editSubCategoryField;
	
	@FindBy(xpath = "//button[text()=\"Update\"]")
	private WebElement updateSubcategorybtn;
	
	@FindBy(xpath = "//a[text()='Sub Category ']")
	private WebElement verifyUpdate;
	
	@FindBy(xpath = "//tbody[@role='alert']//td[3]")
	private List<WebElement> listOfUpdate;
	
	@FindBy(xpath = "//tbody[@role='alert']//td[3]")
	private List<WebElement> listOfDelete;
	
    
	
	public List<WebElement> getListOfDelete() {
		return listOfDelete;
	}

	public List<WebElement> getListOfUpdate() {
		return listOfUpdate;
	}

	public WebElement getVerifyUpdate() {
		return verifyUpdate;
	}

	public WebElement getEditSubCategoryField() {
		return editSubCategoryField;
	}

	public WebElement getUpdateSubcategorybtn() {
		return updateSubcategorybtn;
	}

	public WebElement getEditButton() {
		return editButton;
	}

	public WebElement getCreatesubcategorybtn() {
		return createsubcategorybtn;
	}

	public WebElement getCategorydropdown() {
		return categorydropdown;
	}

	public WebElement getInputcategory() {
		return inputcategory;
	}

	public WebElement getCreateSubCategory() {
		return createSubCategory;
	}

	public List<WebElement> getSubCategoryList() {
		return subCategoryList;
	}
	
	//constructor
	public adminloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//To create subcategory
	public void createSubCategory()
	{
		createSubCategory.click();
		
	}
	
	public void loginwithadmincredentials(String username,String password) {
		usernametextfield.sendKeys(username);
		passwordtextfield.sendKeys(password);
		loginbutton.click();;
	}
	@FindBy(xpath = "//td[text()='padmavathi']//../descendant::i[@class='icon-edit']")
	private WebElement edit;

	public WebElement getedit() {
		return edit;
	}
		
		@FindBy(xpath = "//td[text()='padmavathi1']//../descendant::i[@class='icon-remove-sign']")
		private  WebElement deleteicon;
		
		public WebElement getdeleteicon() {
			return deleteicon;
		}
		
		@FindBy(xpath = "//i[@class='menu-icon icon-signout']")
		private WebElement signoutbutton;
		
		public WebElement getsignoutbutton()
		{
			return signoutbutton;
			
		}

}
	
	

