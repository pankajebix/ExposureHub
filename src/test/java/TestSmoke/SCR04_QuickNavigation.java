package TestSmoke;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import ehub.com.constants.AppConstants;
import ehub.com.pagesSmoke.S04quickNavigationPage;
import ehub.com.utils.ExcelUtil;

public class SCR04_QuickNavigation extends BaseTest{
	
	S04quickNavigationPage S04page;
	ExcelUtil excUtil = new ExcelUtil(System.getProperty("user.dir") + AppConstants.pathofExcelDataAsPerEnv);

	@BeforeTest
	public void setupBrowser() {
		setup();
		S04page = new S04quickNavigationPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S04page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void createNewPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S04";
		String actualCreatedPolicy=S04page.createNewPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void addNewLimitGroup() {
		String ExpectedGroupName=AppConstants.limit_Group_Name+"S04";
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
	public void addBulkOnshoreSchedule() {
		String expected="schedule added";
		String actual=S04page.addCyberSchedule(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 6, enabled = true)
	public void addBilkSchedule2() {
		String expected="schedule added";
		String actual=S04page.addOffshoreSchedule(expected);
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 7, enabled = true)
	public void addBulkOffshoreSchedule() {
		String expected="schedule added";
		String actual=S04page.addOffshoreRenewablesSchedule(expected);
		Assert.assertEquals(actual, expected);
	}
	//====

	@Test(priority = 8, enabled = true)
	public void searchPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S04";
		String actualCreatedPolicy=S04page.searchPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 9, enabled = true)
	public void clickOnTerms() {
		String expectedCurrentTermsURL="#Terms";
		String actualCurrentTermsURL=S04page.clickOnTerms();
		Assert.assertTrue(actualCurrentTermsURL.contains(expectedCurrentTermsURL));		
	}
	
	@Test(priority = 10, enabled = true)
	public void scheduleOnshore() {
		String classNameXpath=AppConstants.class_Cyber_Fraction_Value;
		S04page.schedule_1(classNameXpath);
	}
	
	@Test(priority = 11, enabled = true)
	public void schedule2() {
		String classNameXpath=AppConstants.class_Offshore_Fraction_Value;
		S04page.schedule_2(classNameXpath);
	}
	
	@Test(priority = 12, enabled = true)
	public void scheduleOffshore() {
		String classNameXpath=AppConstants.class_Offshore_Renewables_Fraction_Value;
		S04page.schedule_3(classNameXpath);
	}
	
	@Test(priority = 13, enabled = true)
	public void clickOnMap() {
		String expected="#Map";
		String actual=S04page.clickOnMap();
		Assert.assertTrue(actual.contains(expected));
	}
	
	@Test(priority = 14, enabled = true)
	public void clickOnReport() {
		String expected="#Report";
		String actual=S04page.clickOnReport();
		Assert.assertTrue(actual.contains(expected));
	}	
	
	@Test(priority = 15, enabled = true)
	public void clickOnResult() {
		String expected="#Result";
		String actual=S04page.clickOnResult();
		Assert.assertTrue(actual.contains(expected));
	}
	
	@Test(priority = 16, enabled = true)
	public void clickOnLeftMenuNavigation() {
		String expected="#Hub";
		String actual=S04page.leftMenuNavigation();
		Assert.assertTrue(actual.contains(expected));
	}
}
