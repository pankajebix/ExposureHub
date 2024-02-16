package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S36reverseGeocodingMapSearchPage;


public class S36reverseGeocodingMapSearchPageTest extends BaseClass{	
	
	S36reverseGeocodingMapSearchPage S36page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S36page = new S36reverseGeocodingMapSearchPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S36page.login();
	}
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedPolicyNumber=AppConstants.policy_Number+"36";
		String actual=S36page.createNewPolicy(expectedPolicyNumber);
		Assert.assertEquals(actual, expectedPolicyNumber);
	}
	
	@Test(priority = 3, enabled = true)
	public void addSchedule() {
		String expected="schedule added";
		String actual=S36page.addSchedule(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 4, enabled = true)
	public void reverseGeocodesearch() {
		S36page.reverseGeocodesearch();
	}
}
