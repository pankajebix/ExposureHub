package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S20createNewOnshorePolicyWithoutSavingWarningMessageVisibleThenSavePage;

public class S20createNewOnshorePolicyWithoutSavingWarningMessageVisibleThenSavePageTest extends BaseClass{	
	
	S20createNewOnshorePolicyWithoutSavingWarningMessageVisibleThenSavePage S20page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S20page = new S20createNewOnshorePolicyWithoutSavingWarningMessageVisibleThenSavePage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S20page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicyWithoutSavingWarningMessage() {
		String expectedPolicyNumber=AppConstants.policy_Number+"20";
		S20page.createNewPolicyWithoutSavingWarningMessage(expectedPolicyNumber);
	}
	
	@Test(priority = 3, enabled = true)
	public void verifyCreatedPolicy() {
		String expectedPolicyNumber=AppConstants.policy_Number+"20";
		String actual=S20page.verifyCreatedPolicy(expectedPolicyNumber);
		Assert.assertEquals(actual, expectedPolicyNumber);
	}

}
