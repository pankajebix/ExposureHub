package TestSmoke;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pagesSmoke.S06importOnshoreSchedulesPage;

public class S06importOnshoreSchedulesPageTest extends BaseClass{

	S06importOnshoreSchedulesPage S06page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S06page = new S06importOnshoreSchedulesPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S06page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S06";
		String actualCreatedPolicy=S06page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"S06";
		String actualGroupName=S06page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S06page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, enabled = true)
	public void addCoverage() {
		String expectedCoverageName=AppConstants.coverage_Name+"S06";
		String actualCoverageName=S06page.addCoverage(expectedCoverageName);		
		Assert.assertEquals(actualCoverageName, expectedCoverageName);
	}
	
	@Test(priority = 6, enabled = true)
	public void importOnshoreSchedule() {
		String expected="import successful";
		String actual=S06page.importSchedule(expected);
		Assert.assertEquals(actual, expected);
	}
}
