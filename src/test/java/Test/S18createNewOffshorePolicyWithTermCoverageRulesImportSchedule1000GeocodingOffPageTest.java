package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S18createNewOffshorePolicyWithTermCoverageRulesImportSchedule1000GeocodingOffPage;

public class S18createNewOffshorePolicyWithTermCoverageRulesImportSchedule1000GeocodingOffPageTest extends BaseTest{	
	
	S18createNewOffshorePolicyWithTermCoverageRulesImportSchedule1000GeocodingOffPage S18page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S18page = new S18createNewOffshorePolicyWithTermCoverageRulesImportSchedule1000GeocodingOffPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S18page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"18";
		String actualCreatedPolicy=S18page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"18";
		String actualGroupName=S18page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S18page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, enabled = true)
	public void addCoverage() {
		String expectedCoverageName=AppConstants.coverage_Name+"18";
		String actualCoverageName=S18page.addCoverage(expectedCoverageName);		
		Assert.assertEquals(actualCoverageName, expectedCoverageName);
	}	
	
	@Test(priority = 6, enabled = true)
	public void importSchedule10000() {
		String expected="import successful";
		String actual=S18page.importSchedule1000(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 7, enabled = true)
	public void deleteSingleSchedule() {
		String expected="schedule deleted";
		S18page.deleteSchedule1(expected);
		//String actual=
		//Assert.assertEquals(actual, expected);
	}

}
