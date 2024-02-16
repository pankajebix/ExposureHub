package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S33bulkEditReviewTheChangesAndSaveOnshorePage;

public class S33bulkEditReviewTheChangesAndSaveOnshorePageTest extends BaseClass{	
	
	S33bulkEditReviewTheChangesAndSaveOnshorePage S33page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S33page = new S33bulkEditReviewTheChangesAndSaveOnshorePage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S33page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedPolicyNumber=AppConstants.policy_Number+"33";
		String actual=S33page.createNewPolicy(expectedPolicyNumber);
		Assert.assertEquals(actual, expectedPolicyNumber);
	}
	
	@Test(priority = 3, enabled = true)
	public void addSchedule() {
		String expected="schedule added";
		String actual=S33page.addSchedule(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 4, enabled = true)
	public void editSchedule() {
		S33page.editSchedule();
	}

}
