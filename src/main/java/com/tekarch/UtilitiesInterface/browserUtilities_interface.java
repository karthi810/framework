package com.tekarch.UtilitiesInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface browserUtilities_interface {
	
	public void launchBrowser(String browser);
	public boolean waitForElementVisible(WebDriver driver, WebElement ele, int iTimeInSeconds);
	public void explicitWait(int sec, WebElement elem, WebDriver driver);
	public boolean waitForElementDisable(WebDriver driver, WebElement ele, int iTimeInSeconds);
	public boolean isDisplayed(WebElement ele);
	public void screenShotBrowser(WebDriver driver, String className);
	public void screenShotBrowserForWebElement(WebDriver driver, WebElement eleScreenArea, String className);
	public void isDisplayed(WebElement ele, String str);
	public boolean isAttribtuePresent(WebElement element, String attribute);
	public boolean ScrollToView(WebDriver driver, WebElement ele);
	public void ClickUsingJS(WebElement ele);
	public void ufClick(WebElement ele);
	public void ufSendKeys(WebElement ele, String keysToSend);
	public String ufGetText(WebElement ele);
	public boolean waitForElementVisible_old(WebDriver driver, WebElement ele, int iTimeInSeconds);
	public boolean waitForElementDisable_old(WebDriver driver, WebElement ele, int iTimeInSeconds);

}
