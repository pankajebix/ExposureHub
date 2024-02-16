package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S31renewPolicyPage;

public class S31renewPolicyPageTest extends BaseClass{	
	
	S31renewPolicyPage S31page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S31page = new S31renewPolicyPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S31page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedPolicyNumber=AppConstants.policy_Number+"31";
		String actual=S31page.createNewPolicy(expectedPolicyNumber);
		Assert.assertEquals(actual, expectedPolicyNumber);
	}
	
	@Test(priority = 3, enabled = true)
	public void renewPolicy() {
		String expectedPolicyNumber=AppConstants.policy_Number+"31renew";
		String actual=S31page.renewPolicy(expectedPolicyNumber);
		Assert.assertEquals(actual, expectedPolicyNumber);
	}
}
