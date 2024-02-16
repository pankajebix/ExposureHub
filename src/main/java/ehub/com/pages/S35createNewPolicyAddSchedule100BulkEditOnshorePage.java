package ehub.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;

public class S35createNewPolicyAddSchedule100BulkEditOnshorePage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S35createNewPolicyAddSchedule100BulkEditOnshorePage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}
	
	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}
	
	public String createNewPolicy(String policyNumber) {
		String actual=common.createNewPolicyWithClassName(policyNumber, AppConstants.policy_Assured+"35", 2, AppConstants.className_two_class_With_Same_Name);
		return actual;
	}
	
	public String addSchedule100(String validationMessage) {
		String actual=common.importSchedule(AppConstants.class_Cyber_Fraction_Value, validationMessage, AppConstants.import_File_Path_100_Onshore, "no", "yes");
		return actual;
	}
	
	public void editSchedule() {
		common.editScheduleSelectAll(AppConstants.class_Cyber_Fraction_Value, AppConstants.schedule_Option_Data_Inception_Date, "08/12/2023");
	}

}
