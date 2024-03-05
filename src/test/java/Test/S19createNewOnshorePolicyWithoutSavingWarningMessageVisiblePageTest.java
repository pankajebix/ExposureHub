package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S19createNewOnshorePolicyWithoutSavingWarningMessageVisiblePage;


public class S19createNewOnshorePolicyWithoutSavingWarningMessageVisiblePageTest extends BaseTest{
	
	S19createNewOnshorePolicyWithoutSavingWarningMessageVisiblePage S19page;

	@BeforeTest
	public void setupBrowser() {
		setup();
		S19page = new S19createNewOnshorePolicyWithoutSavingWarningMessageVisiblePage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S19page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicyWithoutSavingWarningMessage() {
		String expectedPolicyNumber=AppConstants.policy_Number+"19";
		S19page.createNewPolicyWithoutSavingWarningMessage(expectedPolicyNumber);		
	}

}
