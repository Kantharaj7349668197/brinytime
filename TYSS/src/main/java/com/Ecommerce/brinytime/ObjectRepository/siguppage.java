package com.Ecommerce.brinytime.ObjectRepository;


import java.util.HashMap;

import org.apache.commons.collections4.iterators.EntrySetMapIterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Brinytime.Testyantra.genericutility.JavaUtility;
import com.google.common.collect.Multiset.Entry;

public class siguppage {
	
	public siguppage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public WebElement getNametextfield() {
		return nametextfield;
	}

	public WebElement getEmailidtextfield() {
		return emailidtextfield;
	}

	public WebElement getContactnotextfield() {
		return contactnotextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getConfirmpasswordtextfield() {
		return confirmpasswordtextfield;
	}


	@FindBy(xpath = "//input[@type='text' and @name='fullname']")
	private WebElement nametextfield;
	
	@FindBy(xpath = "//input[@name='emailid']")
	private WebElement emailidtextfield;
	
	@FindBy(xpath = "//input[@name='contactno']")
	private WebElement contactnotextfield;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//input[@id='confirmpassword']")
	private WebElement confirmpasswordtextfield;
	
	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement signupbutton;
	
public WebElement getSignupbutton() {
		return signupbutton;
	}


public void getsignup(String name,String email,String contact,String password,String confirmpassword) {
nametextfield.sendKeys(name);
emailidtextfield.sendKeys(email);
contactnotextfield.sendKeys(contact);
passwordtextfield.sendKeys(password);
confirmpasswordtextfield.sendKeys(confirmpassword);
}
public void getsignup1(HashMap<String, String>ref,WebDriver driver)
{
	JavaUtility jutils=new JavaUtility();
	for(java.util.Map.Entry<String, String>mset:ref.entrySet())
	{
	if (mset.getValue().equalsIgnoreCase("kantha@")) {
		driver.findElement(By.xpath(mset.getKey())).sendKeys(mset.getValue()+jutils.getRandomNumber());
	}
	else
		driver.findElement(By.xpath(mset.getKey())).sendKeys(mset.getValue());
		
	}
}
}
