package com.petstore.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.petstore.ui.baseclass.Baseclass;

public class RegistrationPage extends Baseclass {
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "repeatedPassword")
	WebElement repeatedPassword;

	@FindBy(name = "account.firstName")
	WebElement accountfirstName;

	@FindBy(name = "account.lastName")
	WebElement accountlastName;

	@FindBy(name = "account.email")
	WebElement accountemail;

	@FindBy(name = "account.phone")
	WebElement accountphone;

	@FindBy(name = "account.address1")
	WebElement accountaddress1;

	@FindBy(name = "account.address2")
	WebElement accountaddress2;
	@FindBy(name = "account.city")
	WebElement accountcity;

	@FindBy(name = "account.state")
	WebElement accountstate;

	@FindBy(name = "account.zip")
	WebElement accountzip;

	@FindBy(name = "account.country")
	WebElement accountcountry;

	@FindBy(name = "account.languagePreference")
	WebElement languagePreference;

	@FindBy(name = "account.favouriteCategoryId")
	WebElement favouriteCategoryId;

	@FindBy(name = "account.listOption")
	WebElement accountlistOption;

	@FindBy(name = "account.bannerOption")
	WebElement accountbannerOption;

	@FindBy(name = "newAccount")
	WebElement SaveAccountInformation;
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
		}

		public void enteruserdetails() {
		username.sendKeys("pravin1234");
		password.sendKeys("Java*09876");
		repeatedPassword.sendKeys("Java*09876");
		accountfirstName.sendKeys("Praveen");
		accountlastName.sendKeys("Reddy");
		accountemail.sendKeys("pravin1123@yopmail.com");
		accountphone.sendKeys("9164530165");
		accountaddress1.sendKeys("Bangalore");
		accountaddress2.sendKeys("bangalore");
		accountcity.sendKeys("bangalore");
		accountstate.sendKeys("Karnataka");
		accountzip.sendKeys("560019");
		accountcountry.sendKeys("India");
		Select languagePreferences = new Select(languagePreference);
		languagePreferences.selectByIndex(0);
		Select favouriteCategoryIds = new Select(favouriteCategoryId);
		favouriteCategoryIds.selectByIndex(0);
		accountlistOption.click();
		accountbannerOption.click();
		}
		public void enteruserdetailsType1(String Uname, String pwd, String rpwd, String fname, String lname, String email,
				String phone, String address1, String address2, String city, String state, String zipcode, String country,
				String language, String category) {
				username.sendKeys(Uname);
				password.sendKeys(pwd);
				repeatedPassword.sendKeys(rpwd);
				accountfirstName.sendKeys(fname);
				accountlastName.sendKeys(lname);
				accountemail.sendKeys(email);
				accountphone.sendKeys(phone);
				accountaddress1.sendKeys(address1);
				accountaddress2.sendKeys(address2);
				accountcity.sendKeys(city);
				accountstate.sendKeys(state);
				accountzip.sendKeys(zipcode);
				accountcountry.sendKeys(country);
				Select languagePreferences = new Select(languagePreference);
				languagePreferences.selectByValue(language);
				Select favouriteCategoryIds = new Select(favouriteCategoryId);
				favouriteCategoryIds.selectByVisibleText(category);
				accountlistOption.click();
				accountbannerOption.click();
				}
		public LoginPage clickSaveAccountInformation() {
			SaveAccountInformation.click();
			return new LoginPage();
			}





}
