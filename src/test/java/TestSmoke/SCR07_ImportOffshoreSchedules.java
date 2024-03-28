package TestSmoke;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pagesSmoke.S07importOffshoreSchedulesPage;

public class SCR07_ImportOffshoreSchedules extends BaseTest{
	
	S07importOffshoreSchedulesPage S07page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S07page = new S07importOffshoreSchedulesPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S07page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S07";
		String actualCreatedPolicy=S07page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"S07";
		String actualGroupName=S07page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S07page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, enabled = true)
	public void addCoverage() {
		String expectedCoverageName=AppConstants.coverage_Name+"S07";
		String actualCoverageName=S07page.addCoverage(expectedCoverageName);		
		Assert.assertEquals(actualCoverageName, expectedCoverageName);
	}
	
	@Test(priority = 6, enabled = true)
	public void importOffshoreSchedule() {
		String expected="import successful";
		String actual=S07page.importSchedule(expected);
		Assert.assertEquals(actual, expected);
	}

}
