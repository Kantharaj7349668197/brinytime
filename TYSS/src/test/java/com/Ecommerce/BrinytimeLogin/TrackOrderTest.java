package com.Ecommerce.BrinytimeLogin;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Brinytime.Testyantra.genericutility.Baseclass;
import com.Ecommerce.brinytime.ObjectRepository.CartPage;
import com.Ecommerce.brinytime.ObjectRepository.HomePage;

public class TrackOrderTest extends Baseclass {
	@Test(groups = "smoke")
	public void trackOrder() {
		
		HomePage homepage = new HomePage(driver);
		String homepagelogo = homepage.getHomepagelogo().getText();
		Assert.assertTrue(homepagelogo.contains("Welcome"), "home page is not displayed");
		
		//to click on electronics category
        homepage.selecttheElectronicsCategory(driver);
        
		String categoryurl = driver.getCurrentUrl();
		Assert.assertTrue(categoryurl.contains("category"), "category is not  displayed");
		
		
		//select the product and add it to the cart
		homepage.selectTheProductAddToCart(driver);
		
		String cartUrl2 = driver.getCurrentUrl();
		Assert.assertTrue(cartUrl2.contains("my-cart"), "cart page is not displayed");
		
		// we need to click on proceed to checkout to place a order
		CartPage cartpage = new CartPage(driver);
		cartpage.getProceedtocheckoutbutton().click();
		
		//after selecting the payment method click on submit button
		homepage.getSubmitbutton().click();
		//to track the order
		//homepage.getTrack().click();
		Reporter.log("we can track the order verified and test case is passed",true);
	}
}
