package TestSmoke;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.CommonLocatorsAndMethod;
import ehub.com.pagesSmoke.S08quickQuotePage;
import ehub.com.utils.ExcelUtil;

public class SCR08_QuickQuote extends BaseTest{
	
	S08quickQuotePage S08page;
	CommonLocatorsAndMethod common;
	ExcelUtil excUtil = new ExcelUtil(System.getProperty("user.dir") + AppConstants.pathofExcelDataAsPerEnv);

	@BeforeTest
	public void setupBrowser() {
		setup();
		S08page = new S08quickQuotePage(driver);
		common = new CommonLocatorsAndMethod(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S08page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void quickQuote() {
		String expected=S08page.quickQuote();
		String actual=common.searchPolicyFromPolicyPageAndOpen(expected);
		Assert.assertEquals(actual, expected);
	}

}
