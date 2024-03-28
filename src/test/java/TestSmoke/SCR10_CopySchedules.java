package TestSmoke;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pagesSmoke.S10copySchedulesPage;

public class SCR10_CopySchedules extends BaseTest{
	
	S10copySchedulesPage S10page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S10page = new S10copySchedulesPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S10page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S10";
		String actualCreatedPolicy=S10page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"S10";
		String actualGroupName=S10page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S10page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, enabled = true)
	public void addCoverage() {
		String expectedCoverageName=AppConstants.coverage_Name+"S10";
		String actualCoverageName=S10page.addCoverage(expectedCoverageName);		
		Assert.assertEquals(actualCoverageName, expectedCoverageName);
	}
	
	@Test(priority = 6, enabled = true)
	public void importOnshoreSchedule() {
		String expected="import successful";
		String actual=S10page.importSchedule(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 7, enabled = true)
	public void copySchedule() {
		String expected="Schedules copied successfully";
		String actual=S10page.copySchedule();
		Assert.assertEquals(actual, expected);
	}

}
