package TestSmoke;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pagesSmoke.S02updatePolicyPage;
import ehub.com.utils.ExcelUtil;

public class S02updatePolicyPageTest extends BaseTest{
	
	S02updatePolicyPage S02page;
	ExcelUtil excUtil = new ExcelUtil(System.getProperty("user.dir") + AppConstants.pathofExcelDataAsPerEnv);

	@BeforeTest
	public void setupBrowser() {
		setup();
		S02page = new S02updatePolicyPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S02page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S02";
		String actualCreatedPolicy=S02page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"S02";
		String actualGroupName=S02page.addNewLimitGroup(ExpectedGroupName);		
		Assert.assertEquals(actualGroupName, ExpectedGroupName);
	}
	
	@Test(priority = 4, enabled = true)
	public void addNewLimit() {
		String expected="limit added";
		String actual=S02page.addNewLimit(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5, enabled = true)
	public void addBulkOnshoreSchedule() {
		String expected="schedule added";
		String actual=S02page.addBulkSchedule1(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 6, enabled = true)
	public void addBilkSchedule2() {
		String expected="schedule added";
		String actual=S02page.addBulkSchedule2(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 7, enabled = true)
	public void addBulkOffshoreSchedule() {
		String expected="schedule added";
		String actual=S02page.addBulkSchedule3(expected);
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 8, enabled = true)
	public void searchPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S02";
		String actualCreatedPolicy=S02page.searchPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 9, enabled = true)
	public void editPolicyDetails() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S02update";
		String actualCreatedPolicy=S02page.editPolicyDetails(expectedCreatedPolicy, AppConstants.policy_Assured+"S01update");		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 10, enabled = true)
	public void editLimitGroup() {
		String expectedGroupName=AppConstants.limit_Group_Name+"S02update";
		String actualGroupName=S02page.editLimitGroup(expectedGroupName);		
		Assert.assertEquals(actualGroupName, expectedGroupName);
	}
	
	@Test(priority = 11, enabled = true)
	public void copyAndCreateNewLimitGroup() {
		String expected="limit group updated";
		String actual=S02page.copyAndCreateNewLimitGroup(expected);		
		Assert.assertEquals(actual, expected);
	}	
	
	@Test(priority = 12, enabled = true)
	public void copyAndCreateNewLimit() {
		String expected="limit updated";
		String actual=S02page.copyAndCreateNewLimit(expected);		
		Assert.assertEquals(actual, expected);
	}	
	
	@Test(priority = 13, enabled = true)
	public void editOnshoreSchedule1() {
		S02page.editCyberSchedule();		
	}
	
	@Test(priority = 14, enabled = true)
	public void editSchedule2() {
		S02page.editOffshoreSchedule();		
	}	
	
	@Test(priority = 15, enabled = true)
	public void editOffshoreSchedule() {		
		S02page.editOffshoreRenewablesSchedule();
	}
	
	@Test(priority = 16, enabled = true)
	public void viewPointDataOnMap() {
		S02page.viewPointDataOnMap();
	}
}
