package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;

public class HomePageTestCases extends TestBase {
HomePage homePage;
public HomePageTestCases() {
	super();
}
@BeforeClass
public void setUp() {
	initialization();
	homePage=new HomePage();
}
@Test(enabled=false)
public void clickSignUpButton() {
	homePage.clickOnSignUpButton();
	homePage.cancelSignUp();
}
@Test(enabled=false)
public void clickLoginButton() {
	homePage.clickLoginButton();
	homePage.cancelLogin();
}
@Test(enabled=false)
public void clickOnHomeButton() {
	homePage.clickOnHomeButton();
}
@Test(enabled=false)
public void clickOnContactButton() {
	homePage.clickOnContactButton();
	homePage.cancelContactButton();
}
@Test(enabled=false)
public void clickOnCartButton() {
	homePage.clickOnCart();
}
@Test(enabled=false)
public void clickOnAboutAs() {
	homePage.clickOnAboutAs();
	homePage.cancelAboutAs();
}
@Test(enabled=false)
public void enterDataOnContact() {
	homePage.addContactDetails();
}
@Test(enabled=false)
public void invalidLogin()  {
	homePage.invalidLogin();
	
}
@Test(enabled=false)
public void clearFields()  {
	homePage.clearFields();
}
public void signUp() {
	homePage.signUp();
}
@Test(priority=1)
public void validLogin() {
	homePage.validLogin();
}
@Test(priority=2)
public void userNameVerification() {
	homePage.userNameVerification();
}
}
	

