package com.web365.armenian.product.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.web365.armenian.product.login.ArmenianProductLoginConstants.*;
import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductLoginPage extends ArmenianProductBasePage {

	public ArmenianProductLoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = MY_ACCOUNT_XPATH)
	public WebElement myAccount;

	@FindBy(xpath = LOGIN_BUTTON_XPATH)
	public WebElement loginButton;

	@FindBy(xpath = LOGIN_ERROR_XPATH)
	public WebElement loginError;

	public ArmenianProductLoginPage myAccountClick() {
		myAccount.click();
		return new ArmenianProductLoginPage(this.driver);
	}

	public ArmenianProductLoginPage loginButtonClick() {
		loginButton.click();
		return new ArmenianProductLoginPage(this.driver);

	}

}
