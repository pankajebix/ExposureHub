package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S19createNewOnshorePolicyWithoutSavingWarningMessageVisiblePage;


public class S19createNewOnshorePolicyWithoutSavingWarningMessageVisiblePageTest extends BaseClass{
	
	S19createNewOnshorePolicyWithoutSavingWarningMessageVisiblePage S19page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
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
