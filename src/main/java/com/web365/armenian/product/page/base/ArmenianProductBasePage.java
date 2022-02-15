package com.web365.armenian.product.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ArmenianProductBasePage {

	protected WebDriver driver;

	public ArmenianProductBasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
}
