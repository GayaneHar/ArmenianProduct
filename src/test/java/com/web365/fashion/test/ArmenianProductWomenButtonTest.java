package com.web365.fashion.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.fashion.ArmenianProductFashionWomenButton;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductWomenButtonTest extends ArmenianProductBaseTest {
	

		@Test
		public void womenButtonTest() {
			System.out.println("Test Case ID Fashion11");
			System.out.println("Verify the list view option is clickable");

			ArmenianProductFashionWomenButton wom = new ArmenianProductFashionWomenButton(driver);

			System.out.println("Navigate to https://armenianproduct.am/");
			wom = wom.fashionButtonClick();
			System.out.println("Step 1 Click on the 'Fashion' button");
			wom = wom.womenButtonClick();
			System.out.println("Step 2  Click on the Women's Fashion button");
            
			Assert.assertTrue(wom.womenImage.isDisplayed());
		}


}
