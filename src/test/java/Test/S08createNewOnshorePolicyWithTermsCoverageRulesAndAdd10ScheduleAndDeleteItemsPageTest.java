package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S08createNewOnshorePolicyWithTermsCoverageRulesAndAdd10ScheduleAndDeleteItemsPage;


public class S08createNewOnshorePolicyWithTermsCoverageRulesAndAdd10ScheduleAndDeleteItemsPageTest extends BaseClass{
	
	
	S08createNewOnshorePolicyWithTermsCoverageRulesAndAdd10ScheduleAndDeleteItemsPage S08page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S08page = new S08createNewOnshorePolicyWithTermsCoverageRulesAndAdd10ScheduleAndDeleteItemsPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S08page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"08";
		String actualCreatedPolicy=S08page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"08";
		String actualGroupName=S08page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S08page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, enabled = true)
	public void addCoverage() {
		String expectedCoverageName=AppConstants.coverage_Name+"08";
		String actualCoverageName=S08page.addCoverage(expectedCoverageName);		
		Assert.assertEquals(actualCoverageName, expectedCoverageName);
	}
	
	@Test(priority = 6, enabled = true)
	public void addBulkSchedule10() {
		String expectedMessage="bulk schedule 10 added";
		String actualMessage=S08page.addBulkSchedule10(expectedMessage);
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	@Test(priority = 7, enabled = true)
	public void deleteSchedule() {
		String expectedMessage="schedule deleted";
		String actualMessage=S08page.deleteSchedule(expectedMessage);
		Assert.assertEquals(actualMessage, expectedMessage);
	}

}
