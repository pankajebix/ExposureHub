package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pages.S07createNewOffshorePolicyWithTermsAndScheduleAndDeleteItemsPage;

public class S07createNewOffshorePolicyWithTermsAndScheduleAndDeleteItemsPageTest extends BaseClass{
	
	S07createNewOffshorePolicyWithTermsAndScheduleAndDeleteItemsPage S07page;

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S07page = new S07createNewOffshorePolicyWithTermsAndScheduleAndDeleteItemsPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S07page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"07";
		String actualCreatedPolicy=S07page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"07";
		String actualGroupName=S07page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S07page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, enabled = true)
	public void addCoverage() {
		String expectedCoverageName=AppConstants.coverage_Name+"07";
		String actualCoverageName=S07page.addCoverage(expectedCoverageName);		
		Assert.assertEquals(actualCoverageName, expectedCoverageName);
	}
	
	@Test(priority = 6, enabled = true)
	public void addSchedule() {
		String expectedMessage="schedule added";
		String actualMessage=S07page.addSchedule(expectedMessage);
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	@Test(priority = 7, enabled = true)
	public void addBulkSchedule() {
		String expectedMessage="schedule added";
		String actualMessage=S07page.addBulkSchedule(expectedMessage);
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	
	@Test(priority = 8, enabled = true)
	public void deleteSchedule() {
		String expectedMessage="schedule deleted";
		String actualMessage=S07page.deleteSchedule(expectedMessage);
		Assert.assertEquals(actualMessage, expectedMessage);
	}

}
