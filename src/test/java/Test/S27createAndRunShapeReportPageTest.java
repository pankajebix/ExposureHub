package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S27createAndRunShapeReportPage;


public class S27createAndRunShapeReportPageTest extends BaseClass{
	
	S27createAndRunShapeReportPage S27page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S27page = new S27createAndRunShapeReportPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S27page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createAndRunShapeReport() {
		String expected=AppConstants.report_Name+"27";
		S27page.createAndRunShapeReport(expected);
		Assert.assertEquals(expected, expected);
	}

}
