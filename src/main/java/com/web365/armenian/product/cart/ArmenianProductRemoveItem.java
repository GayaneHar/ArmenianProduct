package com.web365.armenian.product.cart;

import static com.web365.armenian.product.cart.ArmenianProductCartConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductRemoveItem extends ArmenianProductBasePage {

	public ArmenianProductRemoveItem(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = EARRINGS_IMAGE_XPATH)
	public WebElement earringsImg;

	@FindBy(xpath = ADD_TO_CART_XPATH)
	public WebElement addToCart;

	@FindBy(xpath = CART_ICON_XPATH)
	public WebElement cartIcon;

	@FindBy(xpath = VIEW_CART_XPATH)
	public WebElement viewCart;

	@FindBy(xpath = REMOVE_FROM_CART_XPATH)
	public WebElement removeFromCart;

	@FindBy(xpath = EMPTY_CART_XPATH)
	public WebElement emptyCart;

	public ArmenianProductRemoveItem fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductRemoveItem(this.driver);

	}

	public ArmenianProductRemoveItem earringsImgClick() {
		earringsImg.click();
		return new ArmenianProductRemoveItem(this.driver);

	}

	public ArmenianProductRemoveItem addToCartClick() {
		addToCart.click();
		return new ArmenianProductRemoveItem(this.driver);

	}

	public ArmenianProductRemoveItem cartIconClick() {
		cartIcon.click();
		return new ArmenianProductRemoveItem(this.driver);

	}

	public ArmenianProductRemoveItem viewCartClick() {
		viewCart.click();
		return new ArmenianProductRemoveItem(this.driver);
	}

	public ArmenianProductRemoveItem removeFromCartClick() {
		removeFromCart.click();
		return new ArmenianProductRemoveItem(this.driver);

	}

}
