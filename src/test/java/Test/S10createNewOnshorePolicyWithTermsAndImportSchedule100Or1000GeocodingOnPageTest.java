package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S10createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOnPage;


public class S10createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOnPageTest extends BaseTest{	
	
	S10createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOnPage S10page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S10page = new S10createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOnPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S10page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"10";
		String actualCreatedPolicy=S10page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"10";
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
	public void importSchedule100() {
		String expected="import successful";
		String actual=S10page.importSchedule100(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 6, enabled = true)
	public void editAndimportSchedule900() {
		String expected="import successful";
		String actual=S10page.editAndimportSchedule900(expected);
		Assert.assertEquals(actual, expected);
	}

}
