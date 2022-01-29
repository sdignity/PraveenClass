package com.petstore.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.petstore.ui.baseclass.Baseclass;

public class LoginPage extends Baseclass {
	@FindBy(linkText = "Register Now!")
	WebElement RegisterNow;

	@FindBy(name = "username")
	WebElement UName;

	@FindBy(name = "password")
	WebElement Pwd;

	@FindBy(name = "signon")
	WebElement loginbtn;

	public LoginPage() {
	PageFactory.initElements(driver, this);
	// this points to current objects of the class
	}
	public boolean verifyRegistrationButton() {
		boolean registerLinkExists = RegisterNow.isDisplayed();
		return registerLinkExists;
		}

		public RegistrationPage ClickRegisterNowClick() {
		RegisterNow.click();
		return new RegistrationPage();
		}

		public DashboardPage verifyLoginvalidUnamePwd(String uname, String pwd) {
		UName.clear();
		UName.sendKeys(uname);
		Pwd.clear();
		Pwd.sendKeys(pwd);
		loginbtn.click();
		return new DashboardPage();

		}


}
