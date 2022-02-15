package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.web365.armenian.product.fashion.ArmenianProductFashionSize90x90;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSize90x90Test extends ArmenianProductBaseTest {

	@Test
	public void button90X90Test() {
		System.out.println("Test Case ID Fashion8");
		System.out.println("Verify user is able to filter products to size 90X90");

		ArmenianProductFashionSize90x90 button90X90 = new ArmenianProductFashionSize90x90(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		button90X90 = button90X90.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		button90X90 = button90X90.button90X90Click();
		System.out.println("Step 2 Click on the 90X90 button from the left menu");

		Assert.assertTrue(button90X90.img90X90.isDisplayed());
	}
}
