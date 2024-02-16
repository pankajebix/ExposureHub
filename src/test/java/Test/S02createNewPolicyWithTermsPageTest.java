package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S02createNewPolicyWithTermsPage;

public class S02createNewPolicyWithTermsPageTest extends BaseClass{
	
	S02createNewPolicyWithTermsPage S02page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S02page = new S02createNewPolicyWithTermsPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S02page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"02";
		String actualCreatedPolicy=S02page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"02";
		String actualGroupName=S02page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {		
		String expected="limit added";
		String actual=S02page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	

}
