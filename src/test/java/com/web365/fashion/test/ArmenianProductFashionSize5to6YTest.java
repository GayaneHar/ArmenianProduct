package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSize5to6Y;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSize5to6YTest extends ArmenianProductBaseTest {

	@Test
	public void button5to6YTest() {
		System.out.println("Test Case ID Fashion7");
		System.out.println("Verify user is able to filter products to size 5-6Y");

		ArmenianProductFashionSize5to6Y button56Y = new ArmenianProductFashionSize5to6Y(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		button56Y = button56Y.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		button56Y = button56Y.button5_6YClick();
		System.out.println("Step 2 Click on the 5-6Y button from the left menu");

		Assert.assertTrue(button56Y.img5_6Y.isDisplayed());
	}
}
