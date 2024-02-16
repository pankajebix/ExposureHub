package TestSmoke;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.CommonLocatorsAndMethod;

public class DeleteAllPolicyPageTest extends BaseClass {

	CommonLocatorsAndMethod common;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		common = new CommonLocatorsAndMethod(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}

	@Test(priority = 2, enabled = true)
	public void policySeach() {
		common.searchPolicyAndOpen(AppConstants.policy_Number + "S06");
	}

	@Test(priority = 3, enabled = true)
	public void searchAndDeletePolicy() {
		String policyNumber = null;
		for (int i = 6; i <=7; i++) {
			if (i <= 7) {
				policyNumber = AppConstants.policy_Number + "S0" + i;
			} 
			common.deletePolicyFromPolicyPage(policyNumber);
		}
	}
}
