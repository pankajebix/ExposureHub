package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S14createNewOnshorePolicyWithTermsAndImportSchedule10000GeocodingOffPage;

public class S14createNewOnshorePolicyWithTermsAndImportSchedule10000GeocodingOffPageTest extends BaseTest{
	
	S14createNewOnshorePolicyWithTermsAndImportSchedule10000GeocodingOffPage S14page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S14page = new S14createNewOnshorePolicyWithTermsAndImportSchedule10000GeocodingOffPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S14page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"14";
		String actualCreatedPolicy=S14page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"14";
		String actualGroupName=S14page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S14page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}	
	
	@Test(priority = 5, enabled = true)
	public void importSchedule10000() {
		String expected="import successful";
		String actual=S14page.importSchedule10000(expected);
		Assert.assertEquals(actual, expected);
	}

}
