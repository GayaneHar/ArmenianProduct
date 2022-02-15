package com.web365.cart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.cart.ArmenianProductAddToCart;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianPraductAddToCartTest extends ArmenianProductBaseTest {

	@Test
	public void addToCartTest() {
		System.out.println("Test Case ID cart2");
		System.out.println("Verify user is able to add item too cart");

		ArmenianProductAddToCart addToCart = new ArmenianProductAddToCart(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		addToCart = addToCart.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' button");
		addToCart = addToCart.braceletImgClick();
		System.out.println("Step 2 Click on random item");
		addToCart = addToCart.addCartClick();
		System.out.println("Step 3 Click on the 'Add to Cart' button");

		Assert.assertTrue(addToCart.itemAdded.isDisplayed());
	}

}
