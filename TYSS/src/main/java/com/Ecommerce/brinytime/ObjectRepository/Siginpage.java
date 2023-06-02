package com.Ecommerce.brinytime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Siginpage {
@FindBy(name = "email")private WebElement usernametextfield;

@FindBy(id = "exampleInputPassword1")private WebElement passwordtextfield;

@FindBy(xpath = "//button[text()='Login']")private WebElement loginbutton;

public WebElement getUsernametextfield() {
	return usernametextfield;
}

public WebElement getPasswordtextfield() {
	return passwordtextfield;
}

public WebElement getLoginbutton() {
	return loginbutton;
}

public Siginpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void siginwithCredentials(String username,String password) {
	usernametextfield.sendKeys(username);
	passwordtextfield.sendKeys(password);
	loginbutton.click();
}
}
