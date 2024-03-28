package TestSmoke;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pagesSmoke.S09copyPolicyPage;

public class SCR09_CopyPolicy extends BaseTest{
	
	S09copyPolicyPage S09page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S09page = new S09copyPolicyPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S09page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S09";
		String actualCreatedPolicy=S09page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"S09";
		String actualGroupName=S09page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S09page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, enabled = true)
	public void addCoverage() {
		String expectedCoverageName=AppConstants.coverage_Name+"S09";
		String actualCoverageName=S09page.addCoverage(expectedCoverageName);		
		Assert.assertEquals(actualCoverageName, expectedCoverageName);
	}
	
	@Test(priority = 6, enabled = true)
	public void importOnshoreSchedule() {
		String expected="import successful";
		String actual=S09page.importSchedule(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 7, enabled = true)
	public void copyPolicy() {
		String expected=AppConstants.policy_Number+"S09copyPolicy";
		String actual=S09page.copyPolicy(expected);
		Assert.assertEquals(actual, expected);
	}

}
