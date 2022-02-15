package com.web365.cart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.cart.ArmenianProductMultipleItem;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductMultipleItemTest extends ArmenianProductBaseTest {

	@Test
	public void MultipleItemTest() {
		System.out.println("Test Case ID cart3");
		System.out.println("Verify user is able to add multiple of the same item to cart");

		ArmenianProductMultipleItem multipleItem = new ArmenianProductMultipleItem(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		multipleItem = multipleItem.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' button");
		multipleItem = multipleItem.necklaceImgClick();
		System.out.println("Step 2 Click on random item");
		multipleItem = multipleItem.plusButtonClick();
		System.out.println("Step 3 Click on the '+' button unter Quantity");
		multipleItem = multipleItem.addToCartClick();
		System.out.println("Step 4 Click on the 'Add to Cart' button");

		Assert.assertTrue(multipleItem.addedItem.isDisplayed());
	}

}
