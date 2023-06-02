package com.Ecommerce.brinytime.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminmanageproductpage {

	//declaration
	//To click on manageproduct module
	@FindBy(xpath = "//a[text()='Manage Products ']")
	private WebElement clickManageProduct;
	
	//To get all the product list from page
	@FindBy(xpath = "//table[@aria-describedby=\"DataTables_Table_0_info\"]//td[2]")
	private List<WebElement> listOfProduct;

	public WebElement getClickManageProduct() {
		return clickManageProduct;
	}

	public List<WebElement> getListOfProduct() {
		return listOfProduct;
	}

	public Adminmanageproductpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
