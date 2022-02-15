package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSizeS;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSizeSTest extends ArmenianProductBaseTest {
	
	@Test
	public void buttonSTest() {
		System.out.println("Test Case ID Fashion20");
		System.out.println("Verify user is able to filter products to size S");

		ArmenianProductFashionSizeS buttonS = new ArmenianProductFashionSizeS(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		buttonS = buttonS.fashionButtonClick();
		System.out.println("Step 1 Click on the 'Fashion' buuton");
		buttonS = buttonS.buttonSClick();
		System.out.println("Step 2 Click on the S button from the left menu");

		Assert.assertTrue(buttonS.imgS.isDisplayed());

}
}
