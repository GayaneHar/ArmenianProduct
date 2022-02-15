package com.web365.armenian.product.cart;

import static com.web365.armenian.product.cart.ArmenianProductCartConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductMultipleItem extends ArmenianProductBasePage {

	public ArmenianProductMultipleItem(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = NECKLACE_IMAGE_XPATH)
	public WebElement necklaceImg;

	@FindBy(xpath = PLUS_BUTTON_XPATH)
	public WebElement plusButton;

	@FindBy(xpath = ADD_TO_CART_XPATH)
	public WebElement addToCart;

	@FindBy(xpath = ITEM_ADDED_XPATH)
	public WebElement addedItem;

	public ArmenianProductMultipleItem fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductMultipleItem(this.driver);

	}

	public ArmenianProductMultipleItem necklaceImgClick() {
		necklaceImg.click();
		return new ArmenianProductMultipleItem(this.driver);

	}

	public ArmenianProductMultipleItem plusButtonClick() {
		plusButton.click();
		return new ArmenianProductMultipleItem(this.driver);

	}

	public ArmenianProductMultipleItem addToCartClick() {
		addToCart.click();
		return new ArmenianProductMultipleItem(this.driver);

	}

}
