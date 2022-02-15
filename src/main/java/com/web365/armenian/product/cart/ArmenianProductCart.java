package com.web365.armenian.product.cart;

import static com.web365.armenian.product.cart.ArmenianProductCartConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductCart extends ArmenianProductBasePage {

	public ArmenianProductCart(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = CART_ICON_XPATH)
	public WebElement cartIcon;

	@FindBy(xpath = VIEW_CART_XPATH)
	public WebElement viewCartButton;

	@FindBy(xpath = CART_PAGE_XPATH)
	public WebElement cartPage;

	public ArmenianProductCart cartIconClick() {
		cartIcon.click();
		return new ArmenianProductCart(this.driver);

	}

	public ArmenianProductCart viewCartButtonClick() {
		viewCartButton.click();
		return new ArmenianProductCart(this.driver);

	}

}
