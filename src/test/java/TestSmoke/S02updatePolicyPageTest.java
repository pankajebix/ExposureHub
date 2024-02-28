package TestSmoke;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pagesSmoke.S02updatePolicyPage;
import ehub.com.utils.ExcelUtil;

public class S02updatePolicyPageTest extends BaseClass{
	
	S02updatePolicyPage S02page;
	ExcelUtil excUtil = new ExcelUtil(System.getProperty("user.dir") + AppConstants.pathofExcelDataAsPerEnv);

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S02page = new S02updatePolicyPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S02page.login();
	}

	@Test(priority = 2, enabled = true)
	public void searchPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S01";
		String actualCreatedPolicy=S02page.searchPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = false)
	public void editPolicyDetails() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S01update";
		String actualCreatedPolicy=S02page.editPolicyDetails(expectedCreatedPolicy, AppConstants.policy_Assured+"S01update");		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 4, enabled = false)
	public void editLimitGroup() {
		String expectedGroupName=AppConstants.limit_Group_Name+"S01update";
		String actualGroupName=S02page.editLimitGroup(expectedGroupName);		
		Assert.assertEquals(actualGroupName, expectedGroupName);
	}
	
	@Test(priority = 5, enabled = false)
	public void copyAndCreateNewLimitGroup() {
		String expected="limit group updated";
		String actual=S02page.copyAndCreateNewLimitGroup(expected);		
		Assert.assertEquals(actual, expected);
	}	
	
	@Test(priority = 6, enabled = false)
	public void copyAndCreateNewLimit() {
		String expected="limit updated";
		String actual=S02page.copyAndCreateNewLimit(expected);		
		Assert.assertEquals(actual, expected);
	}	
	
	@Test(priority = 7, enabled = true)
	public void editCyberSchedule() {
		S02page.editCyberSchedule();		
	}
	
	@Test(priority = 8, enabled = true)
	public void editOffshoreSchedule() {
		S02page.editOffshoreSchedule();		
	}	
	
	@Test(priority = 9, enabled = true)
	public void editOffshoreRenewablesSchedule() {		
		S02page.editOffshoreRenewablesSchedule();
	}
	
	@Test(priority = 10, enabled = true)
	public void viewPointDataOnMap() {
		S02page.viewPointDataOnMap();
	}
	

}
