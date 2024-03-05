package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S16createOnshorePolicyWithCoverageRulesAndScheduleItemsGeocodingOffPage;

public class S16createOnshorePolicyWithCoverageRulesAndScheduleItemsGeocodingOffPageTest extends BaseTest{
	
	S16createOnshorePolicyWithCoverageRulesAndScheduleItemsGeocodingOffPage S16page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S16page = new S16createOnshorePolicyWithCoverageRulesAndScheduleItemsGeocodingOffPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S16page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"16";
		String actualCreatedPolicy=S16page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"16";
		String actualGroupName=S16page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S16page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, enabled = true)
	public void addCoverage() {
		String expectedCoverageName=AppConstants.coverage_Name+"16";
		String actualCoverageName=S16page.addCoverage(expectedCoverageName);		
		Assert.assertEquals(actualCoverageName, expectedCoverageName);
	}	
	
	@Test(priority = 6, enabled = true)
	public void importSchedule10000() {
		String expected="import successful";
		String actual=S16page.importSchedule1000(expected);
		Assert.assertEquals(actual, expected);
	}	

}
