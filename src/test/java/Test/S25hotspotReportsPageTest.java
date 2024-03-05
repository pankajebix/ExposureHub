package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S25hotspotReportsPage;


public class S25hotspotReportsPageTest extends BaseTest{	
	
	S25hotspotReportsPage S25page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S25page = new S25hotspotReportsPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S25page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createHotspotReport() {
		String expected=AppConstants.report_Name+"25";
		String actual=S25page.createHotspotReport(expected);
		Assert.assertEquals(actual, expected);
	}
}
