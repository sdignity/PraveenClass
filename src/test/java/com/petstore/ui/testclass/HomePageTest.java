package com.petstore.ui.testclass;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.petstore.ui.baseclass.Baseclass;
import com.petstore.ui.pages.HomePage;
import com.petstore.ui.pages.LoginPage;
import com.petstore.ui.pages.RegistrationPage;
import com.petstore.ui.pages.SignInPage;

public class HomePageTest extends Baseclass {
	HomePage HomePage;
	LoginPage LoginPage;
	SignInPage SignInPage;
	RegistrationPage RegistrationPage;
//	TestUtil testUtil;

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
//	testUtil = new TestUtil();
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



	/*
	 * @DataProvider public Object[][] getRegistrationData() throws Exception{
	 * Object data[][] = TestUtil.getTestData("Sheet1"); return data; }
	 */
	@Test(priority = 4)
	public void createNewUser() {
	SignInPage = HomePage.clickOnEntertheStoreLink();
	LoginPage = SignInPage.ClickSignInClick(); //
	RegistrationPage = LoginPage.ClickRegisterNowClick();
	// RegistrationPage.enteruserdetails();
	RegistrationPage.enteruserdetailsType1("kudil", "kudil@123","kudil@123", "Kudil", "sri", "kudil23@gmail.com",
	"123456", "1,North street", "south rampat", "thanjavur", "tn", "613001", "india",
	"english", "FISH");
	LoginPage = RegistrationPage.clickSaveAccountInformation();
	}

	@AfterMethod
	public void tearDown() {
	driver.quit();
	}

}
