package com.Ecommerce.brinytime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insertadminloginpage {

			
	
	//declaration
	
	@FindBy(xpath = "//a[text()=\"Insert Product \"]")
	private WebElement insertProduct;
	
	@FindBy(name = "category")
	private WebElement categorySelection;
	
	@FindBy(name = "subcategory")
	private WebElement subCategorySelection;
	
	@FindBy(name = "productName")
	private WebElement proName;

	@FindBy(name = "productCompany")
	private WebElement prodCompany;
	
	@FindBy(xpath = "//label[text()='Product Price Before Discount']/following-sibling::div/input")
	private WebElement beforePrice;
	
	@FindBy(xpath = "//label[text()='Product Price After Discount(Selling Price)']/following-sibling::div/input")
	private WebElement afterPrice;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Enter Product Description\"]")
	private WebElement prodDescription;
	
	
	@FindBy(name = "productShippingcharge")
	private WebElement prodShipingCharge;
	
	@FindBy(id= "productAvailability")
	private WebElement prodAvailability1;
	
	
	@FindBy(name = "productimage1")
	private WebElement prodImg1;
	
	@FindBy(name = "productimage2")
	private WebElement prodImg2;
	
	@FindBy(name = "productimage3")
	private WebElement prodImg3;
	
	@FindBy(name = "submit")
	private WebElement submit;
	
	
	
	public WebElement getInsertProduct() {
		return insertProduct;
	}

	public WebElement getCategorySelection() {
		return categorySelection;
	}

	public WebElement getSubCategorySelection() {
		return subCategorySelection;
	}

	public WebElement getProName() {
		return proName;
	}

	public WebElement getProdCompany() {
		return prodCompany;
	}

	public WebElement getBeforePrice() {
		return beforePrice;
	}

	public WebElement getAfterPrice() {
		return afterPrice;
	}

	public WebElement getProdDescription() {
		return prodDescription;
	}

	public WebElement getProdShipingCharge() {
		return prodShipingCharge;
	}

	public WebElement getProdAvailability1() {
		return prodAvailability1;
	}

	public WebElement getProdImg1() {
		return prodImg1;
	}

	public WebElement getProdImg2() {
		return prodImg2;
	}

	public WebElement getProdImg3() {
		return prodImg3;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
	
	// constructor
	public Insertadminloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
