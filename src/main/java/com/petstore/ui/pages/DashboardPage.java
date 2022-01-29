package com.petstore.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.petstore.ui.baseclass.Baseclass;

public class DashboardPage extends Baseclass {
	@FindBy (id="WelcomeContent")
	WebElement Welcometxt;

	public DashboardPage() {
	PageFactory.initElements(driver, this);
	}

	public String verifyUserLogin()
	{
	return Welcometxt.getText();
	}

}
