package com.Wrapper;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.TestBase;

public class Wrapper extends TestBase {
	public void waitForElement(WebElement element, int time) {
		WebDriverWait time1 = new WebDriverWait(driver, Duration.ofSeconds(time));
		time1.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void Sleep(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public void handleAlert() {
		Alert alt = driver.switchTo().alert();

		alt.dismiss();
	}

	public void enterText(WebElement element, String inputdata) {
		waitForElement(element, 10);
		element.sendKeys(inputdata);
	}

	public void waitForAlert(WebDriver driver, int time) {
		WebDriverWait time1 = new WebDriverWait(driver, Duration.ofSeconds(time));
		time1.until(ExpectedConditions.alertIsPresent());
	}

	public void clearText(WebElement element) {
		waitForElement(element, 10);
		element.clear();
	}

	public void looipForElementClick(WebElement element) {
		for (int i = 1; i <= 2; i++) {
			try {
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void getElementFromlistIndex(String xpath, int index, WebDriver driver) {
		List<WebElement> list = driver.findElements(By.xpath(xpath));
		list.get(index).click();
	}

	public void getElementFromListById(String id, WebDriver driver) {
		WebElement element = driver.findElement(By.id(id));
		element.click();
	}
	public void compareString(WebElement actualDta,String expectedDta,int startingIndex) {
		WebDriverWait time1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		time1.until(ExpectedConditions.elementToBeClickable(actualDta));
		String actualData=actualDta.getText().substring(startingIndex, actualDta.getText().length());
		String expectedData= expectedDta;
		assertEquals(actualData, expectedData, "Error:String not matching");
		System.out.println("Actual Data"+"      "+"ExpectedData");
		System.out.println(actualData   +"      "+ expectedData);
	}
}
