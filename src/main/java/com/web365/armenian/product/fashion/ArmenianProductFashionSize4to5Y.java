package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSize4to5Y  extends ArmenianProductBasePage {

	public ArmenianProductFashionSize4to5Y (WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_4_5Y_XPATH)
	public WebElement button4_5Y;

	@FindBy(xpath = IMAGE_4_5Y_XPATH)
	public WebElement img4_5Y;

	public ArmenianProductFashionSize4to5Y fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSize4to5Y(this.driver);

	}

	public ArmenianProductFashionSize4to5Y button4_5YClick() {
		button4_5Y.click();
		return new ArmenianProductFashionSize4to5Y(this.driver);

	}

}


