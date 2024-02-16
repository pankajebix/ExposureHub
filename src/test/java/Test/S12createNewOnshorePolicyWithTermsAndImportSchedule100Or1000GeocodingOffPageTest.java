package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S12createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPage;

public class S12createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPageTest extends BaseClass{
	
	S12createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPage S12page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S12page = new S12createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S12page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"12";
		String actualCreatedPolicy=S12page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = false)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"12";
		String actualGroupName=S12page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = false)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S12page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}	
	
	@Test(priority = 5, enabled = true)
	public void importSchedule100() {
		String expected="import successful";
		String actual=S12page.importSchedule100(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 6, enabled = false)
	public void editAndimportSchedule1000() {
		String expected="import successful";
		String actual=S12page.editAndimportSchedule1000(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 7, enabled = true)
	public void deleteSingleSchedule() {
		String expected="schedule deleted";
		String actual=S12page.deleteSingleSchedule(expected);		
		Assert.assertEquals(actual, expected);
	}
}
