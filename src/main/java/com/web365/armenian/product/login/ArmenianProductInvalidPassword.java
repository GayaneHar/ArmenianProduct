package com.web365.armenian.product.login;

import static com.web365.armenian.product.login.ArmenianProductLoginConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductInvalidPassword extends ArmenianProductBasePage {
	
	public ArmenianProductInvalidPassword (WebDriver driver) {
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
		
		@FindBy(xpath = INVALID_PASSWORD_XPATH)
		public WebElement invalidPassword;
		
		public ArmenianProductInvalidPassword invPasswordTest() {
			myAccount.click();
			usernameField.click();
			usernameField.sendKeys("gayane");
			passwordField.click();
			passwordField.sendKeys("123123");
			loginButton.click();
			
			return new ArmenianProductInvalidPassword  (this.driver);

		}

}
