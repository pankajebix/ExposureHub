package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S11createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPage;


public class S11createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPageTest extends BaseTest{	

	S11createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPage S11page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S11page = new S11createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S11page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"11";
		String actualCreatedPolicy=S11page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"11";
		String actualGroupName=S11page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S11page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}	
	
	@Test(priority = 5, enabled = true)
	public void importSchedule100() {
		String expected="import successful";
		String actual=S11page.importSchedule100(expected);
		Assert.assertEquals(actual, expected);
	}
}
