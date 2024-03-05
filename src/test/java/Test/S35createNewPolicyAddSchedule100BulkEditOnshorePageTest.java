package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S35createNewPolicyAddSchedule100BulkEditOnshorePage;

public class S35createNewPolicyAddSchedule100BulkEditOnshorePageTest extends BaseTest{
	
	S35createNewPolicyAddSchedule100BulkEditOnshorePage S35page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S35page = new S35createNewPolicyAddSchedule100BulkEditOnshorePage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S35page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedPolicyNumber=AppConstants.policy_Number+"35";
		String actual=S35page.createNewPolicy(expectedPolicyNumber);
		Assert.assertEquals(actual, expectedPolicyNumber);
	}
	
	@Test(priority = 3, enabled = true)
	public void addSchedule100() {
		String expected="schedule added";
		String actual=S35page.addSchedule100(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 4, enabled = true)
	public void editSchedule() {
		//String expected="schedule added";
		S35page.editSchedule();
	}

}
