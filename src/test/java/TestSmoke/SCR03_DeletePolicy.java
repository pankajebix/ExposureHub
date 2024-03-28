package TestSmoke;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pagesSmoke.S03deletePolicyPage;
import ehub.com.utils.ExcelUtil;

public class SCR03_DeletePolicy extends BaseTest{
	
	S03deletePolicyPage S03page;
	ExcelUtil excUtil = new ExcelUtil(System.getProperty("user.dir") + AppConstants.pathofExcelDataAsPerEnv);

	@BeforeTest
	public void setupBrowser() {
		setup();
		S03page = new S03deletePolicyPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S03page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void searchPolicy() {
		S03page.searchPolicy();
	}
	
	@Test(priority = 3, enabled = true)
	public void deletLimit() {
		Boolean actual=S03page.deletLimit();
		Assert.assertTrue(actual);
	}
	
	@Test(priority = 4, enabled = true)
	public void deleteLimitGroup() {
		Boolean actual=S03page.deleteLimitGroup();
		Assert.assertTrue(actual);
	}
	
	
	@Test(priority = 5, enabled = true)
	public void deleteOnshoreSchedule() {
		String message="cyber schedule deleted";
		String actual=S03page.deleteScheduleCyber(message);
		Assert.assertEquals(actual, message);
	}
	
	@Test(priority = 6, enabled = true)
	public void deleteSchedule2() {
		String message="offshore schedule deleted";
		String actual=S03page.deleteScheduleOffshore(message);
		Assert.assertEquals(actual, message);
	}
	
	@Test(priority = 7, enabled = true)
	public void deleteOffshoreSchedule() {
		String message="offshore renewables schedule deleted";
		String actual=S03page.deleteScheduleOffshoreRenewables(message);
		Assert.assertEquals(actual, message);
	}
	
	@Test(priority = 8, enabled = true)
	public void deletePolicy() {
		S03page.deletePolicy();
	}

}
