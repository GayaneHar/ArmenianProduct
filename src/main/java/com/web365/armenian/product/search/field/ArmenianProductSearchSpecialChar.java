package com.web365.armenian.product.search.field;

import static com.web365.armenian.product.search.field.ArmenianProductSearchFieldConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductSearchSpecialChar extends ArmenianProductBasePage{
	
	public ArmenianProductSearchSpecialChar (WebDriver driver) {
		super(driver);
		this.driver = driver;
	}	
		
		@FindBy(xpath = SEARCH_FIELD_XPATH)
		public WebElement searchField;
		
		@FindBy(xpath = SEARCH_SPECIAL_CHAR_XPATH)
		public WebElement searchResults;
		
		
		public ArmenianProductSearchSpecialChar searchFieldClick() {
			searchField.click();
			return new ArmenianProductSearchSpecialChar(this.driver);

		}

		public ArmenianProductSearchSpecialChar searchType() {
			searchField.sendKeys("&*$%^%");
			return new ArmenianProductSearchSpecialChar(this.driver);

		}

		public ArmenianProductSearchSpecialChar searchEnter() {
			searchField.sendKeys("Enter");
			return new ArmenianProductSearchSpecialChar(this.driver);

		}
		

}


