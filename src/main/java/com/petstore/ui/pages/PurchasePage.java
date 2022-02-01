package com.petstore.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.petstore.ui.baseclass.Baseclass;

public class PurchasePage extends Baseclass{

	@FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[1]")
	WebElement Fish;

	@FindBy(linkText = "FI-SW-01") 
	WebElement AngelFish;

	@FindBy(linkText = "Add to Cart") 
	WebElement AddToCart;
	
	@FindBy(linkText = "Return to Main Menu")
	WebElement ReturnButton;

	public PurchasePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public  HomePage ClickOnLinks() {
		Fish.click();
		AngelFish.click(); 
		AddToCart.click();
		ReturnButton.click();

		return new HomePage();
	}
}
