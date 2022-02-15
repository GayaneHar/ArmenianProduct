package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionSize6M extends ArmenianProductBasePage {

	public ArmenianProductFashionSize6M(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = BUTTON_6M_XPATH)
	public WebElement button6M;

	@FindBy(xpath = lOGO_6M_XPATH)
	public WebElement log6M;

	public ArmenianProductFashionSize6M fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionSize6M(this.driver);

	}

	public ArmenianProductFashionSize6M button6MClick() {
		button6M.click();
		return new ArmenianProductFashionSize6M(this.driver);

	}

}
