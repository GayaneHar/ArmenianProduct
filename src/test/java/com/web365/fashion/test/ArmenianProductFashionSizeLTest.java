package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSizeL;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSizeLTest extends ArmenianProductBaseTest {
	
	@Test
	public void buttonLTest() {
		System.out.println("Test Case ID Fashion18");
		System.out.println("Verify user is able to filter products to size L");

		ArmenianProductFashionSizeL buttonL = new ArmenianProductFashionSizeL(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		buttonL = buttonL.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		buttonL = buttonL.buttonLClick();
		System.out.println("Step 2 Click on the L button from the left menu");

		Assert.assertTrue(buttonL.imgL.isDisplayed());
	}

}
