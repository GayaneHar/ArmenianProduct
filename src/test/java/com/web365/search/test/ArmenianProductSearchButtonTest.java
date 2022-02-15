package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.search.field.ArmenianProductSearchButton;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductSearchButtonTest extends ArmenianProductBaseTest {
	
	@Test
	public void capitalLettersTest() {
		System.out.println("Test Case ID search3");
		System.out.println("Verify the search button is clickabled");

		ArmenianProductSearchButton searchButton = new ArmenianProductSearchButton(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		searchButton = searchButton.searchFieldClick();
		System.out.println("Step 1 Click on the search field");
		searchButton = searchButton.searchType();
		System.out.println("Step 2 Enter 'earrings' in the search field");
		searchButton = searchButton.searchEnter();
		System.out.println("Step 3 Click the enter key");
		

		Assert.assertTrue(searchButton.searchResults.isDisplayed());
	}

}
