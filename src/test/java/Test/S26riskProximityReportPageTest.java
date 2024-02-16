package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S26riskProximityReportPage;


public class S26riskProximityReportPageTest extends BaseClass{	
	
	S26riskProximityReportPage S26page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S26page = new S26riskProximityReportPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S26page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void riskProximityReport() {
		String expected=AppConstants.report_Name+"26";
		String actual=S26page.riskProximityReport(expected);
		Assert.assertEquals(actual, expected);
	}
}
