package com.Ecommerce.BrinytimeLogin;


import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Brinytime.Testyantra.genericutility.Baseclass;

import com.Ecommerce.brinytime.ObjectRepository.CartPage;
import com.Ecommerce.brinytime.ObjectRepository.HomePage;

//@Listeners(com.Brinytime.Testyantra.genericutility.Listenerclass.class)
public class AddToCartTest extends Baseclass {

	@Test//(retryAnalyzer = com.Brinytime.Testyantra.genericutility.RetryAnalyzer.class)
	public void addproductToCart() throws IOException {

	String productcategorytitle = fileutils.getPropertyData1("productcategorytitle");

		HomePage homepage = new HomePage(driver);
		homepage.selecttheElectronicsCategory(driver);

		// check whether product category page is displayed or not
		String productCategorypage = driver.getTitle();

		// to wait until the expected title is displayed
		webutils.waitForTitle(driver, productcategorytitle);
		Assert.assertTrue(productCategorypage.contains("Product"),"product category page is not displayed");

		homepage.selectTheProductAddToCart(driver);
		// check whether the add to cart is displayed and the product is displayed or not
		String homepageUrl2 = driver.getCurrentUrl();
		Assert.assertTrue(homepageUrl2.contains("my-cart"), "cart page is not  dispalyed");
		
		
		CartPage cartpage = new CartPage(driver);
		String cartvalue = cartpage.getCartvalue().getText();
		Assert.assertEquals(cartvalue, "1","product is not  added");
		Reporter.log("product is added to the cart and test case is passed",true);
	}


}
