package com.web365.armenian.product.login;

import static com.web365.armenian.product.login.ArmenianProductLoginConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductLoginValidCredentials extends ArmenianProductBasePage {

	public ArmenianProductLoginValidCredentials(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = MY_ACCOUNT_XPATH)
	public WebElement myAccount;

	@FindBy(xpath = USERNAME_FIELD_XPATH)
	public WebElement usernameField;

	@FindBy(xpath = PASSWORD_FIELD_XPATH)
	public WebElement passwordField;

	@FindBy(xpath = LOGIN_BUTTON_XPATH)
	public WebElement loginButton;

	@FindBy(xpath = CREDENTIALS_XPATH)
	public WebElement credentials;

	public ArmenianProductLoginValidCredentials myAccountClick() {
		myAccount.click();
		return new ArmenianProductLoginValidCredentials(this.driver);
	}

	public ArmenianProductLoginValidCredentials usernameFieldClick() {
		usernameField.click();
		return new ArmenianProductLoginValidCredentials(this.driver);
	}

	public ArmenianProductLoginValidCredentials usernameFieldType() {
		usernameField.sendKeys("gayane");
		return new ArmenianProductLoginValidCredentials(this.driver);
	}

	public ArmenianProductLoginValidCredentials passwordFieldClick() {
		passwordField.click();
		return new ArmenianProductLoginValidCredentials(this.driver);
	}

	public ArmenianProductLoginValidCredentials passwordFieldType() {
		passwordField.sendKeys("gh020499@");
		return new ArmenianProductLoginValidCredentials(this.driver);
	}

	public ArmenianProductLoginValidCredentials loginButtonClick() {
		loginButton.click();
		return new ArmenianProductLoginValidCredentials(this.driver);

	}

}