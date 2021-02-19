package com.tekarch.widget;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tekarch.pocalculator.pocalculator;
import com.tekarch.pohome.pohome;
import com.tekarch.pologin.pologinTekApp;
import com.tekarch.powidget.powidget;
import com.tekarch.utilities.TestBase;

public class Accordian extends TestBase{
	
	pologinTekApp login;
	pohome home;
	powidget widget;
	
	Logger log = Logger.getLogger(getClass().getSimpleName());
	
	@BeforeTest
	public void settingUpEnvironment() throws Exception {
		sErrorMessage = "";
		sClassNameForScreenShot = getClass().getSimpleName();
		driver.get(oCons.getTekAppURL());
		login = new pologinTekApp(driver);
		home = new pohome(driver);
		widget = new powidget(driver);
		login.checkLoggedIntoTekAppOrNotElseLogin();
		home.navigateToWidget();
	}
	
	@AfterMethod
	public void settingReqURL() throws Exception {
		driver.get(oCons.getTekAppURL());
		home.navigateToCalculator();
	}
	
	@Test(priority = 1)
	public void To_check_whether_Accordian_widget_is_working_fine() throws Exception {
		widget.displayAccordianText();
		}

}
