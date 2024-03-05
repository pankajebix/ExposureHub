package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S22createAndRunAHurricaneReportPage;


public class S22createAndRunAHurricaneReportPageTest extends BaseTest{	
	
	S22createAndRunAHurricaneReportPage S22page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S22page = new S22createAndRunAHurricaneReportPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S22page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void CreateNewReport() {
		String expected=AppConstants.report_Name+"22";
		String actual=S22page.createNewReport(expected);
		Assert.assertEquals(actual, expected);
	}

}
