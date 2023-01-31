package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Wrapper.Wrapper;
import com.base.TestBase;

public class HomePageAkbarTravals extends TestBase {
Wrapper wrapper=new Wrapper();
@FindBy(id="liFrom") WebElement pFromDropDown;
@FindBy(id="liTo") WebElement pToDropDown;
@FindBy(xpath="//li[@id=\"liFrom\"]//h6") WebElement pFromPlace;
@FindBy(xpath="//li[@id=\"liTo\"]//h6") WebElement pToPlace;
@FindBy(xpath="//div[@class=\"firstbox\"]") WebElement pCalender;
public HomePageAkbarTravals() {
	PageFactory.initElements(driver, this);
}
public void selectFrom() {
	wrapper.waitForElement(pFromDropDown, 10);
	pFromDropDown.click();
	wrapper.getElementFromListById("DEL", driver);
}
public void selectTo() {
wrapper.waitForElement(pToDropDown, 5);
wrapper.getElementFromListById("CZL", driver);
wrapper.waitForElement(pCalender, 5);
pCalender.click();
}
public void verifySelectedPlace() {
	wrapper.compareString(pFromPlace, "New Delhi", 0);
	wrapper.compareString(pToPlace, "Constantine", 0);
}
}
s