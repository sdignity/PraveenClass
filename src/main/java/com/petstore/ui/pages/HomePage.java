package com.petstore.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.petstore.ui.baseclass.Baseclass;

public class HomePage extends Baseclass{
	// object repository or Page Factory
	@FindBy(linkText = "Enter the Store")
	WebElement EnterStorelink;

	// Initializing the Page Objects:
	public HomePage() {
	PageFactory.initElements(driver, HomePage.this);
	}

	// Actions
	public String verifyHomePageTitle() {
	return driver.getTitle();
	}

	public SignInPage clickOnEntertheStoreLink() {
	EnterStorelink.click();
	return new SignInPage();
	}
}



