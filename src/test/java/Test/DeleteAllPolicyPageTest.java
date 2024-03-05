package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pages.CommonLocatorsAndMethod;

public class DeleteAllPolicyPageTest extends BaseTest {

	CommonLocatorsAndMethod common;

	@BeforeTest
	public void setupBrowser() {
		setup();
		common = new CommonLocatorsAndMethod(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}

	@Test(priority = 2, enabled = true)
	public void policySeach() {
		common.searchPolicyAndOpen(AppConstants.policy_Number + "01");
	}

	@Test(priority = 3, enabled = true)
	public void searchAndDeletePolicy() {
		String policyNumber = null;
		for (int i = 1; i <= 36; i++) {
			if (i <= 9) {
				policyNumber = AppConstants.policy_Number + "0" + i;
			} else {
				policyNumber = AppConstants.policy_Number + i;
			}
			common.deletePolicyFromPolicyPage(policyNumber);
		}
	}
}
