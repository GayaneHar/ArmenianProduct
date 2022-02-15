package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.armenian.product.search.field.ArmenianProductSearchCapitalLetters;
import com.web365.base.test.ArmenianProductBaseTest;

public class ArmenianProductSearchCapitalLettersTest extends ArmenianProductBaseTest {

	@Test
	public void searchButtonTest() {
		System.out.println("Test Case ID search4");
		System.out.println("Verify the search button is clickabled");

		ArmenianProductSearchCapitalLetters capitalLetters = new ArmenianProductSearchCapitalLetters(driver);

		System.out.println("Navigate to https://armenianproduct.am/");
		capitalLetters = capitalLetters.searchFieldClick();
		System.out.println("Step 1 Click on the search field");
		capitalLetters = capitalLetters.searchType();
		System.out.println("Step 2 Enter 'RINGS' in the search field");
		capitalLetters = capitalLetters.searchEnter();
		System.out.println("Step 3 Click the enter key");

		Assert.assertTrue(capitalLetters.searchResults.isDisplayed());
	}

}
