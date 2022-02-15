package com.web365.cart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.cart.ArmenianProductRemoveItem;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductRemoveItemTest extends ArmenianProductBaseTest {

	@Test
	public void RemoveItemTest() {
		System.out.println("Test Case ID cart4");
		System.out.println("Verify user is able to remove an item from Cart");

		ArmenianProductRemoveItem removeItem = new ArmenianProductRemoveItem(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		removeItem = removeItem.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' button");
		removeItem = removeItem.earringsImgClick();
		System.out.println("Step 2 Click on random item");
		removeItem = removeItem.addToCartClick();
		System.out.println("Step 3 Click on the 'Add to Cart' button");
		removeItem = removeItem.cartIconClick();
		System.out.println("Step 4 Click on the Cart icon");
		removeItem = removeItem.viewCartClick();
		System.out.println("Step 5 Click on the 'View Cart' button");
		removeItem = removeItem.removeFromCartClick();
		System.out.println("Step 6 Click on the 'x' to remove item");

		Assert.assertTrue(removeItem.emptyCart.isDisplayed());
	}

}
