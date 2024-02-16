package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S29editReportRunAndDeletePage;


public class S29editReportRunAndDeletePageTest extends BaseClass{	
	
	S29editReportRunAndDeletePage S29page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S29page = new S29editReportRunAndDeletePage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S29page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewReport() {
		String expected=AppConstants.report_Name+"29";
		String actual=S29page.createNewReport(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 3, enabled = true)
	public void editReport() {
		S29page.editReport();
	}	
	
	@Test(priority = 4, enabled = true)
	public void deleteReport() {
		S29page.deleteReport();
	}

}
