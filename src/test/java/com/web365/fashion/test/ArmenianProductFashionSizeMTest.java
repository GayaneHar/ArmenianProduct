package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSizeM;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSizeMTest extends ArmenianProductBaseTest{

	@Test
	public void buttonMTest() {
		System.out.println("Test Case ID Fashion19");
		System.out.println("Verify user is able to filter products to size M");

		ArmenianProductFashionSizeM buttonM = new ArmenianProductFashionSizeM(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		buttonM = buttonM.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		buttonM = buttonM.buttonMClick();
		System.out.println("Step 2 Click on the L button from the left menu");

		Assert.assertTrue(buttonM.imgM.isDisplayed());
	}
}
