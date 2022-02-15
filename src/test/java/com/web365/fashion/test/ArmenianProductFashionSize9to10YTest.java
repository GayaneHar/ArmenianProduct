package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSize9to10Y;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSize9to10YTest extends ArmenianProductBaseTest{
	
	@Test
	public void button9to10YTest() {
		System.out.println("Test Case ID Fashion17");
		System.out.println("Verify user is able to filter products to size 9-10Y");

		ArmenianProductFashionSize9to10Y button9to10Y = new ArmenianProductFashionSize9to10Y(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		button9to10Y = button9to10Y.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		button9to10Y = button9to10Y.button9_10YClick();
		System.out.println("Step 2 Click on the 9-10Y button from the left menu");

		Assert.assertTrue(button9to10Y.img9_10Y.isDisplayed());
	}
}



