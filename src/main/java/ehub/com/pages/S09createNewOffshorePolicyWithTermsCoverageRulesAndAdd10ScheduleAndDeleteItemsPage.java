package ehub.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;

public class S09createNewOffshorePolicyWithTermsCoverageRulesAndAdd10ScheduleAndDeleteItemsPage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S09createNewOffshorePolicyWithTermsCoverageRulesAndAdd10ScheduleAndDeleteItemsPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}

	public String createNewPolicy(String policyNumber) {
		 String createdPolicyVerify =common.createNewPolicyWithClassNameAndCoverageRule(policyNumber, AppConstants.policy_Assured + "09", 1, AppConstants.className_one);
		 return createdPolicyVerify;
	}
	
	public String addNewLimitGroup(String groupName) {
		String actual=common.addNewLimitGroup(groupName, AppConstants.country_Australia);
		return actual;
	}
	
	public String addNewLimit(String validationMessage) {
		String actual=common.addNewLimit(validationMessage);
		return actual;
	}
	
	public String addCoverage(String coverageName) {
		String actualCoverageName=common.addCoverageRule(coverageName, AppConstants.country_Australia);
		return actualCoverageName;
	}
	
	public String addBulkSchedule10(String validationMessage) {
		String actual=common.addBulkSchedule10Generic(AppConstants.class_Offshore_Renewables_Fraction_Value, AppConstants.country_US, validationMessage);
		return actual;
	}
	
	public String deleteSchedule(String validationMessage) {
		String actual=common.deleteScheduleGeneric(AppConstants.class_Offshore_Renewables_Fraction_Value, 1, validationMessage);
		return actual;
	}
}
