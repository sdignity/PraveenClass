package com.petstore.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.petstore.ui.baseclass.Baseclass;

public class PurchasePage2 extends Baseclass {
	@FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[2]")
	WebElement Dog;

	@FindBy(linkText = "K9-RT-02") 
	WebElement Labrator;

	@FindBy(linkText = "Add to Cart") 
	WebElement AddToCart;
	
	@FindBy(linkText = "Proceed to Checkout")
	WebElement ProceedButton;
	
	

	public PurchasePage2() {
		PageFactory.initElements(driver, this);

	}
	public  PurchasePage ClickOnLinks2() {
		Dog.click();
		Labrator.click(); 
		AddToCart.click();
		ProceedButton.click();
		return new PurchasePage();
	 
	}
}

