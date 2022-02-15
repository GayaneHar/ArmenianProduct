package com.web365.armenian.product.fashion;

import static com.web365.armenian.product.fashion.ArmenianProductFashionConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.armenian.product.page.base.ArmenianProductBasePage;

public class ArmenianProductFashionListView2Button extends ArmenianProductBasePage {

	public ArmenianProductFashionListView2Button(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	@FindBy(xpath = FASHION_BUTTON_XPATH)
	public WebElement fashionButton;

	@FindBy(xpath = LIST_VIEW2_BUTTON_XPATH)
	public WebElement listView2Button;

	@FindBy(xpath = IMAGE_LIST_VIEW2_XPATH)
	public WebElement imgListView2;

	public ArmenianProductFashionListView2Button fashionButtonClick() {
		fashionButton.click();
		return new ArmenianProductFashionListView2Button(this.driver);

	}

	public ArmenianProductFashionListView2Button listView2ButtonClick() {
		listView2Button.click();
		return new ArmenianProductFashionListView2Button(this.driver);

	}

}
