package com.web365.cart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.cart.ArmenianProductCart;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductCartTest extends ArmenianProductBaseTest {

	@Test
	public void cartIconTest() {
		System.out.println("Test Case ID cart1");
		System.out.println("Verify user is able to view the cart");

		ArmenianProductCart cart = new ArmenianProductCart(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		cart = cart.cartIconClick();
		System.out.println("Step 1 Click on the cart icon");
		cart = cart.viewCartButtonClick();
		System.out.println("Step 2 Click on the 'View Cart' button");

		Assert.assertTrue(cart.cartPage.isDisplayed());
	}

}
