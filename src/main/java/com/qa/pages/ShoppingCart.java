package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ShoppingCart extends TestBase {

	// Page Factory
	@FindBy(xpath = "//a[@class='btn buy']")
	WebElement buynow_button;

	@FindBy(xpath = "//tr[1]//td[2]//input[1]")
	WebElement cart_name;

	@FindBy(xpath = "//tr[2]//td[2]//input[1]")
	WebElement cart_email;

	@FindBy(xpath = "//tr[3]//td[2]//input[1]")
	WebElement cart_phonenumber;

	@FindBy(xpath = "//tr[4]//td[2]//input[1]")
	WebElement cart_city;

	@FindBy(xpath = "//textarea[contains(text(),'MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11')]")
	WebElement cart_address;

	@FindBy(xpath = "//tr[6]//td[2]//input[1]")
	WebElement cart_postalcode;

	@FindBy(xpath = "//div[@class='cart-checkout']")
	WebElement checkout_button;

	@FindBy(xpath = "//div[@class='text-button-main']")
	WebElement continue_button;

	// initializing page objects:
	public ShoppingCart() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();

	}

	public OrderSummary enterdetails_in_shoppingcart() {
		buynow_button.click();
		cart_name.sendKeys("Jayant");
		cart_email.sendKeys("jayant.gupta93@ymail.com");
		cart_phonenumber.sendKeys("9650207216");
		cart_city.sendKeys("Pune");
		cart_address.sendKeys("1796, Sector 8");
		cart_postalcode.sendKeys("121006");
		checkout_button.click();

		return new OrderSummary();
	}

}
