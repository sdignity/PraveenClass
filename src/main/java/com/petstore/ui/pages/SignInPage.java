package com.petstore.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.petstore.ui.baseclass.Baseclass;

public class SignInPage extends Baseclass {
	@FindBy(linkText = "Sign In")
	WebElement SignIn;

	public SignInPage() {
	PageFactory.initElements(driver, this);
	}

	public LoginPage ClickSignInClick() {
	SignIn.click();
	return new LoginPage();
	}

}
