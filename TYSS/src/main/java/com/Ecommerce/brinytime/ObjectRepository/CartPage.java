package com.Ecommerce.brinytime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
@FindBy(xpath = "//div[@class='basket-item-count']")private WebElement cartvalue;



@FindBy(xpath = "//div[@class='cart-checkout-btn pull-right']")
private WebElement proceedtocheckoutbutton;



@FindBy(xpath = "//table[@class='table table-bordered']//tbody//tr[1]//a[contains(.,'Track')]")
private WebElement trackorderlink;

public WebElement getTrackorderlink() {
	return trackorderlink;
}


public WebElement getProceedtocheckoutbutton() {
	return proceedtocheckoutbutton;
}

public CartPage(WebDriver driver) {
PageFactory.initElements(driver, this);

}

public WebElement getCartvalue() {
	return cartvalue;
}



}

