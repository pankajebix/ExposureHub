package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S34bulkEditReviewTheChangesAndSaveOffshorePage;

public class S34bulkEditReviewTheChangesAndSaveOffshorePageTest extends BaseClass{
		
	S34bulkEditReviewTheChangesAndSaveOffshorePage S34page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S34page = new S34bulkEditReviewTheChangesAndSaveOffshorePage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S34page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedPolicyNumber=AppConstants.policy_Number+"34";
		String actual=S34page.createNewPolicy(expectedPolicyNumber);
		Assert.assertEquals(actual, expectedPolicyNumber);
	}
	
	@Test(priority = 3, enabled = true)
	public void addSchedule() {
		String expected="schedule added";
		String actual=S34page.addSchedule(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 4, enabled = true)
	public void editSchedule() {
		S34page.editSchedule();
	}

}
