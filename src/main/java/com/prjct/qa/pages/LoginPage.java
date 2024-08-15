package com.prjct.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prjct.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//*[@id=\"login-username\"]")
	WebElement UsernameTextbox;
	@FindBy(xpath = "//*[@id=\"login-password\"]")
	WebElement PasswordTextbox;
	@FindBy(xpath = "//*[@id=\"button-container\"]")
	WebElement Loginbutton;
	@FindBy(xpath = "//div[@class='exacta-logo login-header-logo-size']")
	WebElement Logo;
	
	
	// Initialize page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateloginpageTitle() {
		return driver.getTitle();
	}
	public boolean validatelogo() {
		return Logo.isDisplayed();
	}
	public HomePage login(String un, String pwd) {

		UsernameTextbox.sendKeys(un);
		PasswordTextbox.sendKeys(pwd);
		Loginbutton.click();
		return new HomePage();

	}
}
