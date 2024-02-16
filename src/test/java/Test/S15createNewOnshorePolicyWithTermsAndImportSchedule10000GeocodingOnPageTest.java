package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S15createNewOnshorePolicyWithTermsAndImportSchedule10000GeocodingOnPage;

public class S15createNewOnshorePolicyWithTermsAndImportSchedule10000GeocodingOnPageTest extends BaseClass{	
	
	S15createNewOnshorePolicyWithTermsAndImportSchedule10000GeocodingOnPage S15page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S15page = new S15createNewOnshorePolicyWithTermsAndImportSchedule10000GeocodingOnPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S15page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"15";
		String actualCreatedPolicy=S15page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"15";
		String actualGroupName=S15page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S15page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}	
	
	@Test(priority = 5, enabled = true)
	public void importSchedule10000() {
		String expected="import successful";
		String actual=S15page.importSchedule10000(expected);
		Assert.assertEquals(actual, expected);
	}
}
