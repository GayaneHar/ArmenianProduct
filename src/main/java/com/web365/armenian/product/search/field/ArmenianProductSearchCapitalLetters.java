package com.web365.armenian.product.search.field;

import static com.web365.armenian.product.search.field.ArmenianProductSearchFieldConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductSearchCapitalLetters extends ArmenianProductBasePage {
	
	public ArmenianProductSearchCapitalLetters (WebDriver driver) {
		super(driver);
		this.driver = driver;
	}	
		
		@FindBy(xpath = SEARCH_FIELD_XPATH)
		public WebElement searchField;
		
		@FindBy(xpath = SEARCH_RESULTS_RINGS_XPATH)
		public WebElement searchResults;
		
		
		public ArmenianProductSearchCapitalLetters searchFieldClick() {
			searchField.click();
			return new ArmenianProductSearchCapitalLetters(this.driver);

		}

		public ArmenianProductSearchCapitalLetters searchType() {
			searchField.sendKeys("RINGS");
			return new ArmenianProductSearchCapitalLetters(this.driver);

		}

		public ArmenianProductSearchCapitalLetters searchEnter() {
			searchField.sendKeys("Enter");
			return new ArmenianProductSearchCapitalLetters(this.driver);

		}
		

}
