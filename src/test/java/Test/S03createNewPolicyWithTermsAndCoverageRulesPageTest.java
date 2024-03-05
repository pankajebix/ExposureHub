package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S03createNewPolicyWithTermsAndCoverageRulesPage;

public class S03createNewPolicyWithTermsAndCoverageRulesPageTest extends BaseTest{
	
	S03createNewPolicyWithTermsAndCoverageRulesPage S03page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S03page = new S03createNewPolicyWithTermsAndCoverageRulesPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S03page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"03";
		String actualCreatedPolicy=S03page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"03";
		String actualGroupName=S03page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S03page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, enabled = true)
	public void addCoverage() {
		String expectedCoverageName=AppConstants.coverage_Name+"03";
		String actualCoverageName=S03page.addCoverage(expectedCoverageName);		
		Assert.assertEquals(actualCoverageName, expectedCoverageName);
	}
}
