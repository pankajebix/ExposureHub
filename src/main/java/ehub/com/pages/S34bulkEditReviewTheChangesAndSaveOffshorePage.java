package ehub.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;

public class S34bulkEditReviewTheChangesAndSaveOffshorePage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S34bulkEditReviewTheChangesAndSaveOffshorePage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}
	
	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}
	
	public String createNewPolicy(String policyNumber) {
		String actual=common.createNewPolicyWithClassName(policyNumber, AppConstants.policy_Assured+"34", 1, AppConstants.className_one);
		return actual;
	}
	
	public String addSchedule(String validationMessage) {
		String actual=common.addBulkScheduleGeneric(AppConstants.class_Offshore_Renewables_Fraction_Value, AppConstants.country_US, validationMessage);
		return actual;
	}
	
	public void editSchedule() {
		common.editSchedule(AppConstants.class_Offshore_Renewables_Fraction_Value, AppConstants.schedule_Option_Data_Assured_Interest, "99");
	}

}
