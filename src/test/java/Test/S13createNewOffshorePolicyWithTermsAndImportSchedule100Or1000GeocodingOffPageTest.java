package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S13createNewOffshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPage;


public class S13createNewOffshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPageTest extends BaseClass{
	
	
	S13createNewOffshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPage S13page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S13page = new S13createNewOffshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S13page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"13";
		String actualCreatedPolicy=S13page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"13";
		String actualGroupName=S13page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S13page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}	
	
	@Test(priority = 5, enabled = true)
	public void importSchedule100() {
		String expected="import successful";
		String actual=S13page.importSchedule100(expected);
		Assert.assertEquals(actual, expected);
	}
	
//	@Test(priority = 6, enabled = true)
//	public void editAndimportSchedule1000() {
//		String expected="import successful";
//		S13page.editAndimportSchedule1000(expected);
//	}
	
	

}
