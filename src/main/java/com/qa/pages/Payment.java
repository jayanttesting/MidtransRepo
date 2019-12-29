package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class Payment extends TestBase {

	@FindBy(name = "cardnumber")
	WebElement cardnumber;

	@FindBy(xpath = "//input[@type='tel' and @placeholder='MM / YY']")
	WebElement expirydate;

	@FindBy(xpath = "//input[@type='tel'and@placeholder='123']")
	WebElement cvv;

	public Payment() {
		PageFactory.initElements(driver, this);
	}

	public void makepayment(String cardno, String edate, String cvvno) {
		cardnumber.clear();
		cardnumber.sendKeys(cardno);
		expirydate.clear();
		expirydate.sendKeys(edate);
		cvv.clear();
		cvv.sendKeys(cvvno);

	}
}
