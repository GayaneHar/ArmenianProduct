package com.web365.armenian.product.search.field;

import static com.web365.armenian.product.search.field.ArmenianProductSearchFieldConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductSearchLowercaseLetters extends ArmenianProductBasePage {
	
	public ArmenianProductSearchLowercaseLetters (WebDriver driver) {
		super(driver);
		this.driver = driver;
	}	
		
		@FindBy(xpath = SEARCH_FIELD_XPATH)
		public WebElement searchField;
		
		@FindBy(xpath = SEARCH_RESULTS_LOWERCASE_XPATH)
		public WebElement searchResults;
		
		
		public ArmenianProductSearchLowercaseLetters searchFieldClick() {
			searchField.click();
			return new ArmenianProductSearchLowercaseLetters(this.driver);

		}

		public ArmenianProductSearchLowercaseLetters searchType() {
			searchField.sendKeys("rings");
			return new ArmenianProductSearchLowercaseLetters(this.driver);

		}

		public ArmenianProductSearchLowercaseLetters searchEnter() {
			searchField.sendKeys("Enter");
			return new ArmenianProductSearchLowercaseLetters(this.driver);

		}
		

}


