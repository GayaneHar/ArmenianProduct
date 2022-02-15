package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFasionSize18M extends ArmenianProductBasePage {

	public ArmenianProductFasionSize18M(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_18M_XPATH)
	public WebElement button18M;

	@FindBy(xpath = IMAGE_18M_XPATH)
	public WebElement img18M;

	public ArmenianProductFasionSize18M fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFasionSize18M(this.driver);

	}

	public ArmenianProductFasionSize18M button18MClick() {
		button18M.click();
		return new ArmenianProductFasionSize18M(this.driver);

	}

}
