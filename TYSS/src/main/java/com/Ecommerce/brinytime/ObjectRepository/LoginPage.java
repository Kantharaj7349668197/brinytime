package com.Ecommerce.brinytime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath ="//a[text()='Login']")private WebElement loginlink;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getLoginlink() {
	return loginlink;
}
public void LoginToApp() {
	loginlink.click();
}
}
