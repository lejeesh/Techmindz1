package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Wrapper.Wrapper;
import com.base.TestBase;

public class HomePage extends TestBase {
	Wrapper wrapper = new Wrapper();
	@FindBy(id = "signin2")
	WebElement pSignUpButton;
	@FindBy(id = "login2")
	WebElement pLogInButton;
	@FindBy(xpath = "(//button[@class=\"btn btn-secondary\"])[2]")
	WebElement pCancelSignUp;
	@FindBy(xpath = "(//button[@class=\"btn btn-secondary\"])[3]")
	WebElement pCancelLogin;
	@FindBy(xpath = "(//ul[@class=\"navbar-nav ml-auto\"]//li)[1]")
	WebElement pHomeButton;
	@FindBy(xpath = "//a[@data-target=\"#exampleModal\"]")
	WebElement pContactButton;
	@FindBy(xpath = "(//button[@class=\"btn btn-secondary\"])[1]")
	WebElement pCancelContact;
	@FindBy(xpath = "(//ul[@class=\"navbar-nav ml-auto\"]//li)[3]")
	WebElement pAboutAs;
	@FindBy(xpath = "(//button[@class=\"btn btn-secondary\"])[4]")
	WebElement pCancelAboutAs;
	@FindBy(xpath = "(//ul[@class=\"navbar-nav ml-auto\"]//li)[4]")
	WebElement pCart;
	@FindBy(id = "recipient-email")
	WebElement pContactEmail;
	@FindBy(id = "recipient-name")
	WebElement pContactName;
	@FindBy(id = "message-text")
	WebElement pContactMessage;
	@FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[1]")
	WebElement pSendMessage;
	@FindBy(xpath = "//input[@id=\"loginusername\"]")
	WebElement pLoginUserName;
	@FindBy(xpath = "//input[@id=\"loginpassword\"]")
	WebElement pLoginPassword;
	@FindBy(xpath = "//button[@onclick=\"logIn()\"]")
	WebElement pLoginLoginButton;
	@FindBy(id = "sign-username")
	WebElement signUpUserName;
	@FindBy(id = "sign-password")
	WebElement signUpPassword;
	@FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[2]")
	WebElement signUpWindowSignUpButton;
	@FindBy(id = "nameofuser")
	WebElement welcomeUserName;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnSignUpButton() {
		pSignUpButton.click();
	}

	public void cancelSignUp() {
		wrapper.waitForElement(pCancelSignUp, 10);
		pCancelSignUp.click();
	}

	public void clickLoginButton() {
		pLogInButton.click();
	}

	public void cancelLogin() {
		wrapper.waitForElement(pCancelLogin, 10);
		pCancelLogin.click();
	}

	public void clickOnHomeButton() {
		wrapper.waitForElement(pHomeButton, 10);
		pHomeButton.click();
	}

	public void clickOnContactButton() {
		wrapper.waitForElement(pContactButton, 10);
		pContactButton.click();
	}

	public void cancelContactButton() {
		wrapper.waitForElement(pCancelContact, 10);
		pCancelContact.click();
	}

	public void clickOnAboutAs() {
		wrapper.waitForElement(pAboutAs, 10);
		pAboutAs.click();
	}

	public void cancelAboutAs() {
		wrapper.waitForElement(pCancelAboutAs, 10);
		pCancelAboutAs.click();
	}

	public void clickOnCart() {
		wrapper.waitForElement(pCart, 10);
		pCart.click();
	}

	public void addContactDetails() {
		wrapper.looipForElementClick(pContactButton);
		wrapper.waitForElement(pContactName, 10);
		wrapper.enterText(pContactEmail, "sample@gmail.com");
		wrapper.enterText(pContactName, "Test Name");
		wrapper.enterText(pContactMessage, "Test message");
		pSendMessage.click();
		wrapper.handleAlert();
	}

	public void invalidLogin() {
		wrapper.waitForElement(pLogInButton, 10);
		pLogInButton.click();
		wrapper.waitForElement(pLoginUserName, 10);
		wrapper.enterText(pLoginUserName, "Test");
		wrapper.enterText(pLoginPassword, "test");
		pLoginLoginButton.click();
		wrapper.waitForAlert(driver, 10);
		wrapper.handleAlert();

	}

	public void clearFields() {
		wrapper.clearText(pLoginUserName);
		wrapper.clearText(pLoginPassword);
		pCancelLogin.click();
	}

	public void signUp() {
		wrapper.waitForElement(pSignUpButton, 10);
		pSignUpButton.click();
		wrapper.waitForElement(signUpUserName, 10);
		wrapper.enterText(signUpUserName, "SampleName");
		wrapper.enterText(signUpPassword, "11223344");
		signUpWindowSignUpButton.click();
		wrapper.waitForAlert(driver, 10);
		wrapper.handleAlert();
		pCancelSignUp.click();
	}

	public void validLogin() {
		wrapper.waitForElement(pLogInButton, 10);
		pLogInButton.click();
		wrapper.enterText(pLoginUserName, "SampleName");
		wrapper.enterText(pLoginPassword, "11223344");
		pLoginLoginButton.click();
		// wrapper.waitForAlert(driver, 10);
		// wrapper.handleAlert();
	}

	public void userNameVerification() {
		wrapper.compareString(welcomeUserName, "SampleName", 8);
		

}
}
