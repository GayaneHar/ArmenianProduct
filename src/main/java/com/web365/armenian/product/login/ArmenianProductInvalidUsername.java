package com.web365.armenian.product.login;

import static com.web365.armenian.product.login.ArmenianProductLoginConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;


public class ArmenianProductInvalidUsername extends ArmenianProductBasePage {


	public ArmenianProductInvalidUsername (WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

		@FindBy(xpath = MY_ACCOUNT_XPATH)
		public WebElement myAccount;

		@FindBy(xpath = USERNAME_FIELD_XPATH)
		public WebElement usernameField;
		
		@FindBy (xpath = PASSWORD_FIELD_XPATH)
        public WebElement passwordField;
		
		@FindBy(xpath = LOGIN_BUTTON_XPATH)
		public WebElement loginButton;
		
		@FindBy(xpath = INVALID_USERNAME_XPATH)
		public WebElement invalidUsername;
		
		public ArmenianProductInvalidUsername invUserTest() {
			myAccount.click();
			usernameField.click();
			usernameField.sendKeys("gayush");
			passwordField.click();
			passwordField.sendKeys("gh040299@");
			loginButton.click();
			return new ArmenianProductInvalidUsername (this.driver);

		}
}

