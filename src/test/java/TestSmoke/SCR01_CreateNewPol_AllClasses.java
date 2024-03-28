package TestSmoke;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pagesSmoke.S01createNewPolicyAllClassesPage;
import ehub.com.utils.ExcelUtil;

public class SCR01_CreateNewPol_AllClasses extends BaseTest{
	
	 
	S01createNewPolicyAllClassesPage S01page;
	ExcelUtil excUtil = new ExcelUtil(System.getProperty("user.dir") + AppConstants.pathofExcelDataAsPerEnv);

	@BeforeTest
	public void setupBrowser() {
		setup();
		S01page = new S01createNewPolicyAllClassesPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S01page.login();
	}

	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S01";
		String actualCreatedPolicy=S01page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"S01";
		String actualGroupName=S01page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S01page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, enabled = true)
	public void addSingleScheduleOnshore() {
		String expected="schedule added";
		String actual=S01page.addSingleSchedule1(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 6, enabled = true)
	public void addSingleSchedule2() {
		String expected="schedule added";
		String actual=S01page.addSingleSchedule2(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 7, enabled = true)
	public void addSingleScheduleOffshore() {
		String expected="schedule added";
		String actual=S01page.addSingleSchedule3(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 8, enabled = true)
	public void addBulkOnshoreSchedule() {
		String expected="schedule added";
		String actual=S01page.addCyberSchedule(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 9, enabled = true)
	public void addBilkSchedule2() {
		String expected="schedule added";
		String actual=S01page.addOffshoreSchedule(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 10, enabled = true)
	public void addBulkOffshoreSchedule() {
		String expected="schedule added";
		String actual=S01page.addOffshoreRenewablesSchedule(expected);
		Assert.assertEquals(actual, expected);
	}

}
