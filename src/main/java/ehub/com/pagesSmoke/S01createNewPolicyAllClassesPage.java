package ehub.com.pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;
import ehub.com.pages.CommonLocatorsAndMethod;

public class S01createNewPolicyAllClassesPage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S01createNewPolicyAllClassesPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}
	
	public String createNewPolicy(String policyNumber) {
		String actual=common.createNewPolicyWithClassName(policyNumber, AppConstants.policy_Assured+"S01", 2, AppConstants.className_two_class_With_Different_Name);
		return actual;
	}
	
	public String addNewLimitGroup(String groupName) {
		String actual=common.addNewLimitGroup(groupName, AppConstants.country_Australia);
		return actual;
	}
	
	public String addNewLimit(String validationMessage) {
		String actual=common.addNewLimit(validationMessage);
		return actual;
	}
	
	public String addSingleSchedule1(String validationMessage) {
		String actual=common.addSingleScheduleGeneric(AppConstants.class_Cyber_Fraction_Value, validationMessage);
		return actual;
	}
	
	public String addSingleSchedule2(String validationMessage) {
		String actual=common.addSingleScheduleGeneric(AppConstants.class_Offshore_Fraction_Value, validationMessage);
		return actual;
	}
	
	public String addSingleSchedule3(String validationMessage) {
		String actual=common.addSingleScheduleGeneric(AppConstants.class_Offshore_Renewables_Fraction_Value, validationMessage);
		return actual;
	}
	
	public String addCyberSchedule(String validationMessage) {
		String actual=common.addBulkScheduleGeneric(AppConstants.class_Cyber_Fraction_Value, AppConstants.country_Australia, validationMessage);
		return actual;
	}
	
	public String addOffshoreSchedule(String validationMessage) {
		String actual=common.addBulkScheduleGeneric(AppConstants.class_Offshore_Fraction_Value, AppConstants.country_US, validationMessage);
		return actual;
	}
	
	public String addOffshoreRenewablesSchedule(String validationMessage) {
		String actual=common.addBulkScheduleGeneric(AppConstants.class_Offshore_Renewables_Fraction_Value, AppConstants.country_US, validationMessage);
		return actual;
	}
	
	public void viewPointDataOnMaps() {
		common.viewPointDataOnMaps();
	}

}
