package com.Ecommerce.BrinytimeLogin;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.Brinytime.Testyantra.genericutility.Baseclass;
import com.Ecommerce.brinytime.ObjectRepository.HomePage;

public class RemoveProductFromCartTest extends Baseclass {
	@Test(groups = "endtoend")

	public void removeProductFromCart() {
		HomePage homepage = new HomePage(driver);
		String homepagelogo = homepage.getHomepagelogo().getText();
		Assert.assertTrue(homepagelogo.contains("Welcome"), "home page is not displayed");

		// to select the electronics category
		homepage.selecttheElectronicsCategory(driver);

		String categoryurl = driver.getCurrentUrl();
		Assert.assertTrue(categoryurl.contains("category"), "category is not  displayed");

		// storing all products in list of WebElement and click on particular webelement
		List<WebElement> allproducts = homepage.allproductsApp(driver);
		for (WebElement product : allproducts) {
			String productname = product.getText();
			if (productname.contains("Lenovo Vibe K5 Note (Gold, 32 GB)")) {
				product.click();
				break;
			}
		}
		// verify product details page is displayed or not
		String producturl = driver.getCurrentUrl();
		Assert.assertTrue(producturl.contains("product-details"), "product details page  is not  displayed");

		// click on wishlist
		homepage.getWishlisticon().click();

		// verify mywishlist page is displayed or not
		String wishlisturl = driver.getCurrentUrl();
		Assert.assertTrue(wishlisturl.contains("my-wishlist"), "mywishlist  page is  not displayed");

		// to click on add to cart button
		homepage.getAddtocartButton().click();

		// click on Mycart icon
		homepage.getmycarticon().click();
		// verify mycart page is displaying or not
		String mycarturl2 = driver.getCurrentUrl();
		Assert.assertTrue(mycarturl2.contains("my-cart"), "mycart  page is  not displayed");

		homepage.ToRemoveProductFromCart(driver);
		String emptycart = homepage.getcartempty().getText();
		Assert.assertTrue(emptycart.contains("empty"), "product is not removed");
		
		Reporter.log("we can remove the product from the cart verified and test case is passed",true);
	}

}
