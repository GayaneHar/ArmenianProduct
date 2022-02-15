package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSize9M extends ArmenianProductBasePage {

	public ArmenianProductFashionSize9M(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_9M_XPATH)
	public WebElement button9M;

	@FindBy(xpath = IMAGE_9M_XPATH)
	public WebElement img9M;

	public ArmenianProductFashionSize9M fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSize9M(this.driver);

	}

	public ArmenianProductFashionSize9M button9MClick() {
		button9M.click();
		return new ArmenianProductFashionSize9M(this.driver);

	}

}
