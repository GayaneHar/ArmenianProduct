package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSize36to40;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSize36to40Test extends ArmenianProductBaseTest {

	@Test
	public void button36to40Test() {
		System.out.println("Test Case ID Fashion13");
		System.out.println("Verify user is able to filter products to size 36-40");

		ArmenianProductFashionSize36to40 button36to40 = new ArmenianProductFashionSize36to40(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		button36to40 = button36to40.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		button36to40 = button36to40.button36_40Click();
		System.out.println("Step 2 Click on the 36-40 button from the left menu");

		Assert.assertTrue(button36to40.img36_40.isDisplayed());
	}

}
