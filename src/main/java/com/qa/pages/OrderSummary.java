package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class OrderSummary extends TestBase {

	@FindBy(xpath = "//div[@class='text-button-main']")
	WebElement continue_button;

	@FindBy(xpath = "//h1[@class='logo-store']")
	WebElement logo;

	// initializing page objects:
	public OrderSummary() {
		PageFactory.initElements(driver, this);
	}

	public boolean validate_logo_on_order() {
		return logo.isDisplayed();
	}

	public Payment ordersummay_details() {
		continue_button.click();

		return new Payment();

	}
}
