package com.petstore.ui.testclass;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.petstore.ui.baseclass.Baseclass;
import com.petstore.ui.pages.HomePage;
import com.petstore.ui.pages.LoginPage;
import com.petstore.ui.pages.PurchasePage;
import com.petstore.ui.pages.PurchasePage2;
import com.petstore.ui.pages.RegistrationPage;
import com.petstore.ui.pages.SignInPage;
import com.petstore.ui.util.TestUtil;

public class HomePageTest extends Baseclass {
	HomePage HomePage;
	LoginPage LoginPage;
	SignInPage SignInPage;
	RegistrationPage RegistrationPage;
	PurchasePage PurchasePage;
	PurchasePage2 PurchasePage2;
	TestUtil testUtil;

	public HomePageTest() {
	super();
	}

	@BeforeMethod
	public void setUp() {
	initialization();
	HomePage = new HomePage();
	SignInPage = new SignInPage();
	LoginPage = new LoginPage();
	RegistrationPage = new RegistrationPage();
	PurchasePage = new PurchasePage();
	PurchasePage2=new PurchasePage2();
	testUtil = new TestUtil();
	}

	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
	String homePageTitle = HomePage.verifyHomePageTitle();
	Assert.assertEquals(homePageTitle, "JPetStore Demo","value didn't match");
	SignInPage = HomePage.clickOnEntertheStoreLink();
	LoginPage = SignInPage.ClickSignInClick();
	RegistrationPage = LoginPage.ClickRegisterNowClick();
	}

	@Test(priority = 2)
	public void VerifySignInButton() {
	SignInPage = HomePage.clickOnEntertheStoreLink();
	LoginPage = SignInPage.ClickSignInClick(); // boolean signinlinkpresnt
	// LoginPage.verifyRegistrationButton(); //
	// LoginPage.ClickRegisterNowClick();
	}
	@Test(priority = 3)
	public void clickRegistarionLink() {
	SignInPage = HomePage.clickOnEntertheStoreLink();
	LoginPage = SignInPage.ClickSignInClick(); //
	RegistrationPage = LoginPage.ClickRegisterNowClick();
	}

	 @DataProvider
	 public Object[][] getRegistrationData() throws Exception{
	 Object data[][] = TestUtil.getTestData("Sheet1"); 
	 return data; 
	 }
	 
	@Test(priority = 5,dataProvider="getRegistrationData")
	public void createNewUser(String Uname, String pwd, String rpwd, String fname, String lname, String email,
			String phone, String address1, String address2, String city, String state, String zipcode, String country,
			String language, String category) {
	SignInPage = HomePage.clickOnEntertheStoreLink();
	LoginPage = SignInPage.ClickSignInClick(); //
	RegistrationPage = LoginPage.ClickRegisterNowClick();
	// RegistrationPage.enteruserdetails();
	RegistrationPage.enteruserdetailsType1(Uname, pwd,  rpwd,  fname,  lname,  email,
			phone,  address1,  address2,  city,  state,  zipcode, country,
			language,  category);
	LoginPage = RegistrationPage.clickSaveAccountInformation();
	}
	
	@Test(priority = 0)
	public void VerifyAddCart() {
	SignInPage= HomePage.clickOnEntertheStoreLink();
	HomePage=	PurchasePage.ClickOnLinks();
	PurchasePage= PurchasePage2.ClickOnLinks2();

	}

	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

}
