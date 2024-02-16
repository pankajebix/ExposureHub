package TestSmoke;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pagesSmoke.S04quickNavigationPage;
import ehub.com.utils.Excelutility;

public class S04quickNavigationPageTest extends BaseClass{
	
	S04quickNavigationPage S04page;
	Excelutility excUtil = new Excelutility(System.getProperty("user.dir") + AppConstants.pathofExcelDataAsPerEnv);

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S04page = new S04quickNavigationPage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S04page.login();
	}

	@Test(priority = 2, enabled = true)
	public void searchPolicy() {
		String expectedCreatedPolicy=AppConstants.policy_Number+"S01update";
		String actualCreatedPolicy=S04page.searchPolicy(expectedCreatedPolicy);		
		Assert.assertEquals(actualCreatedPolicy, expectedCreatedPolicy);
	}
	
	@Test(priority = 3, enabled = true)
	public void clickOnTerms() {
		String expectedCurrentTermsURL="#Terms";
		String actualCurrentTermsURL=S04page.clickOnTerms();
		Assert.assertTrue(actualCurrentTermsURL.contains(expectedCurrentTermsURL));		
	}
	
	@Test(priority = 4, enabled = true)
	public void scheduleOnshore() {
		String classNameXpath=AppConstants.class_Cyber_Fraction_Value;
		S04page.schedule_1(classNameXpath);
	}
	
	@Test(priority = 5, enabled = true)
	public void schedule2() {
		String classNameXpath=AppConstants.class_Offshore_Fraction_Value;
		S04page.schedule_2(classNameXpath);
	}
	
	@Test(priority = 6, enabled = true)
	public void scheduleOffshore() {
		String classNameXpath=AppConstants.class_Offshore_Renewables_Fraction_Value;
		S04page.schedule_3(classNameXpath);
	}
	
	@Test(priority = 7, enabled = true)
	public void clickOnMap() {
		String expected="#Map";
		String actual=S04page.clickOnMap();
		Assert.assertTrue(actual.contains(expected));
	}
	
	@Test(priority = 8, enabled = true)
	public void clickOnReport() {
		String expected="#Report";
		String actual=S04page.clickOnReport();
		Assert.assertTrue(actual.contains(expected));
	}	
	
	@Test(priority = 9, enabled = true)
	public void clickOnResult() {
		String expected="#Result";
		String actual=S04page.clickOnResult();
		Assert.assertTrue(actual.contains(expected));
	}
	
	@Test(priority = 10, enabled = true)
	public void clickOnLeftMenuNavigation() {
		String expected="#Hub";
		String actual=S04page.leftMenuNavigation();
		Assert.assertTrue(actual.contains(expected));
	}
}
