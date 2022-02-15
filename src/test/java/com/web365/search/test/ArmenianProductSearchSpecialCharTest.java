package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.search.field.ArmenianProductSearchSpecialChar;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductSearchSpecialCharTest extends ArmenianProductBaseTest {

	@Test
	public void numbersTest() {
		System.out.println("Test Case ID search6");
		System.out.println("Verify there are no results when user searches for special characters");

		ArmenianProductSearchSpecialChar searchSpecialChar = new ArmenianProductSearchSpecialChar(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		searchSpecialChar = searchSpecialChar.searchFieldClick();
		System.out.println("Step 1 Click on the search field");
		searchSpecialChar = searchSpecialChar.searchType();
		System.out.println("Step 2 Enter '&*$%^%' in the search field");
		searchSpecialChar = searchSpecialChar.searchEnter();
		System.out.println("Step 3 Click the enter key");

		Assert.assertTrue(searchSpecialChar.searchResults.isDisplayed());
	}

}
