package com.web365.armenian.product.login;

import static com.web365.armenian.product.login.ArmenianProductLoginConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductInvalidPassword extends ArmenianProductBasePage {

	public ArmenianProductInvalidPassword(WebDriver driver) {
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

	@FindBy(xpath = INVALID_PASSWORD_XPATH)
	public WebElement invalidPassword;

	public ArmenianProductInvalidPassword myAccountClick() {
		myAccount.click();
		return new ArmenianProductInvalidPassword(this.driver);
	}

	public ArmenianProductInvalidPassword usernameFieldClick() {
		usernameField.click();
		return new ArmenianProductInvalidPassword(this.driver);
	}

	public ArmenianProductInvalidPassword usernameFieldType() {
		usernameField.sendKeys("gayane");
		return new ArmenianProductInvalidPassword(this.driver);
	}

	public ArmenianProductInvalidPassword passwordFieldClick() {
		passwordField.click();
		return new ArmenianProductInvalidPassword(this.driver);
	}

	public ArmenianProductInvalidPassword passwordFieldType() {
		passwordField.sendKeys("123123");
		return new ArmenianProductInvalidPassword(this.driver);
	}

	public ArmenianProductInvalidPassword loginButtonClick() {
		loginButton.click();
		return new ArmenianProductInvalidPassword(this.driver);

	}

}
