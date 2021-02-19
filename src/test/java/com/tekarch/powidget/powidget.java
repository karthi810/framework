package com.tekarch.powidget;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tekarch.utilities.TestBase;

public class powidget extends TestBase{

	Logger log = Logger.getLogger(getClass().getSimpleName());
	
	public powidget(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Accordian')]")
	WebElement accordian;
	@FindBy(xpath = "//button[contains(text(),'Section 1')]")
	WebElement section1_button;	
	@FindBy(xpath = "//div[1]//p[1]")
	WebElement paraSection1;
	@FindBy(xpath = "//button[contains(text(),'Section 2')]")
	WebElement section2_button;
	@FindBy(xpath = "//body/div[@id='user_div']/div/div[2]/p[1]")
	WebElement paraSection2;
	
	public void displayAccordianText() throws Exception{
		
		log.info("Inside displayAccordian function");
		
		oBroUti.explicitWait(10, accordian, driver);
		oBroUti.ufClick(accordian);
		
		oBroUti.explicitWait(10, section1_button, driver);		
		oBroUti.ufClick(section1_button);		
		log.info(paraSection1.getText());
		
		oBroUti.explicitWait(10, section2_button, driver);
		oBroUti.ufClick(section2_button);
		log.info(paraSection2.getText());
	}
}
