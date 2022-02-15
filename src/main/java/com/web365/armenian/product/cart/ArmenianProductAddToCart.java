package com.web365.armenian.product.cart;

import static com.web365.armenian.product.cart.ArmenianProductCartConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductAddToCart extends ArmenianProductBasePage {

	public ArmenianProductAddToCart(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BRACELET_IMAGE_XPATH)
	public WebElement braceletImg;

	@FindBy(xpath = ADD_TO_CART_XPATH)
	public WebElement addCart;

	@FindBy(xpath = ITEM_ADDED_XPATH)
	public WebElement itemAdded;

	public ArmenianProductAddToCart fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductAddToCart(this.driver);

	}

	public ArmenianProductAddToCart braceletImgClick() {
		braceletImg.click();
		return new ArmenianProductAddToCart(this.driver);

	}

	public ArmenianProductAddToCart addCartClick() {
		addCart.click();
		return new ArmenianProductAddToCart(this.driver);

	}

}
