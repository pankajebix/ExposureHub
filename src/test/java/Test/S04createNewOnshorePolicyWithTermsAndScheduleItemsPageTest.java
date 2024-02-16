package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S04createNewOnshorePolicyWithTermsAndScheduleItemsPage;


public class S04createNewOnshorePolicyWithTermsAndScheduleItemsPageTest extends BaseClass{
	
	S04createNewOnshorePolicyWithTermsAndScheduleItemsPage S04page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S04page = new S04createNewOnshorePolicyWithTermsAndScheduleItemsPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S04page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"04";
		String actualCreatedPolicy=S04page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"04";
		String actualGroupName=S04page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S04page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, enabled = true)
	public void addSchedule() {
		String expectedMessage="schedule added";
		String actualMessage=S04page.addSchedule(expectedMessage);
		Assert.assertEquals(actualMessage, expectedMessage);
	}

}
