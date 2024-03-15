package ehub.com.pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;
import ehub.com.pages.CommonLocatorsAndMethod;

public class S02updatePolicyPage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S02updatePolicyPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}
	
	public String createNewPolicy(String policyNumber) {
		String actual=common.createNewPolicyWithClassName(policyNumber, AppConstants.policy_Assured+"S02", 2, AppConstants.className_two_class_With_Different_Name);
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
	
	public String addBulkSchedule1(String validationMessage) {
		String actual=common.addBulkScheduleGeneric(AppConstants.class_Cyber_Fraction_Value, AppConstants.country_Australia, validationMessage);
		return actual;
	}
	
	public String addBulkSchedule2(String validationMessage) {
		String actual=common.addBulkScheduleGeneric(AppConstants.class_Offshore_Fraction_Value, AppConstants.country_US, validationMessage);
		return actual;
	}
	
	public String addBulkSchedule3(String validationMessage) {
		String actual=common.addBulkScheduleGeneric(AppConstants.class_Offshore_Renewables_Fraction_Value, AppConstants.country_US, validationMessage);
		return actual;
	}
	
	public String searchPolicy(String policyNumber) {
		String actual=common.searchPolicyFromPolicyPageAndOpen(policyNumber);
		return actual;
	}
	public String editPolicyDetails(String policyReferenceDataUpdated, String assuredDataUpdated) {
		String actual=common.editPolicyDetails(policyReferenceDataUpdated, assuredDataUpdated);
		return actual;
	}
	
	public String editLimitGroup(String newGroupName) {
		String actual=common.editLimitGroup(AppConstants.limit_Group_Name+"S02", newGroupName, AppConstants.country_Australia);
		return actual;
	}
	
	public String copyAndCreateNewLimitGroup(String validationMessage) {
		String actual=common.copyLimitGroup(AppConstants.limit_Group_Name+"S02update", validationMessage);
		return actual;
	}
	public String copyAndCreateNewLimit(String validationMessage) {
		String actual=common.copyLimit(validationMessage);
		return actual;
	}
	public void editCyberSchedule() {
		common.editSchedule(AppConstants.class_Cyber_Fraction_Value, AppConstants.schedule_Option_Data_Assured_Interest, "80");
	}
	
	public void editOffshoreSchedule() {
		common.editSchedule(AppConstants.class_Offshore_Fraction_Value, AppConstants.schedule_Option_Data_Assured_Interest, "85");
	}
	
	public void editOffshoreRenewablesSchedule() {
		common.editSchedule(AppConstants.class_Offshore_Renewables_Fraction_Value, AppConstants.schedule_Option_Data_Assured_Interest, "95");
	}
	
	public void viewPointDataOnMap() {
		common.viewPointDataOnMaps();
	}

}
