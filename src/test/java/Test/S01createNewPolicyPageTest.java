package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S01createNewPolicyPage;

public class S01createNewPolicyPageTest extends BaseClass {

	S01createNewPolicyPage S01page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S01page = new S01createNewPolicyPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S01page.login();
	}

	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"01";
		String actualCreatedPolicy=S01page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
}
