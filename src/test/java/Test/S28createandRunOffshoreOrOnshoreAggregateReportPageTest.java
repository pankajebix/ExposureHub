package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S28createandRunOffshoreOrOnshoreAggregateReportPage;


public class S28createandRunOffshoreOrOnshoreAggregateReportPageTest extends BaseTest{
	
	S28createandRunOffshoreOrOnshoreAggregateReportPage S28page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S28page = new S28createandRunOffshoreOrOnshoreAggregateReportPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S28page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createAndRunAggregateReport() {
		String expected=AppConstants.report_Name+"28";
		String actual=S28page.createAndRunAggregateReport(expected);
		Assert.assertEquals(actual, expected);
	}

}
