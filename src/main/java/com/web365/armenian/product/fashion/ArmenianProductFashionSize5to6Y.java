package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSize5to6Y extends ArmenianProductBasePage {

	public ArmenianProductFashionSize5to6Y(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_5_6Y_XPATH)
	public WebElement button5_6Y;

	@FindBy(xpath = IMAGE_5_6Y_XPATH)
	public WebElement img5_6Y;

	public ArmenianProductFashionSize5to6Y fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSize5to6Y(this.driver);

	}

	public ArmenianProductFashionSize5to6Y button5_6YClick() {
		button5_6Y.click();
		return new ArmenianProductFashionSize5to6Y(this.driver);

	}

}
