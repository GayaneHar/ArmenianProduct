package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionSizeXL;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductFashionSizeXLTest extends ArmenianProductBaseTest {
	
		
		@Test
		public void buttonXLTest() {
			System.out.println("Test Case ID Fashion21");
			System.out.println("Verify user is able to filter products to size XL");

			ArmenianProductFashionSizeXL buttonXL = new ArmenianProductFashionSizeXL(driver);

			System.out.println("Navigate to https://armenianproduct.am/");
			buttonXL = buttonXL.fashionButtonClick();
			System.out.println("Step 1 Click on the 'Fashion' buuton");
			buttonXL = buttonXL.buttonSClick();
			System.out.println("Step 2 Click on the XL button from the left menu");

			Assert.assertTrue(buttonXL.imgXL.isDisplayed());

}
}
