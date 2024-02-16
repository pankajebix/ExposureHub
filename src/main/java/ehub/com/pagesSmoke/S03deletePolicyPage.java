package ehub.com.pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;
import ehub.com.pages.CommonLocatorsAndMethod;

public class S03deletePolicyPage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S03deletePolicyPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username,AppConstants.password);
	}
	
	public void searchPolicy() {
		common.searchPolicyAndOpen(AppConstants.policy_Number+"S01update");
	}
	
	public Boolean deletLimit() {
		Boolean actual=common.deleteLimit();
		return actual;
	}
	public Boolean deleteLimitGroup() {
		Boolean actual=common.deleteLimitGroup();
		return actual;
	}
	public String deleteScheduleCyber(String message) {
		String deleteSchedule=common.deleteScheduleGeneric(AppConstants.class_Cyber_Fraction_Value,1, message);
		return deleteSchedule;
	}
	public String deleteScheduleOffshore(String message) {
		String deleteSchedule=common.deleteScheduleGeneric(AppConstants.class_Offshore_Fraction_Value,1, message);
		return deleteSchedule;
	}
	public String deleteScheduleOffshoreRenewables(String message) {
		String deleteSchedule=common.deleteScheduleGeneric(AppConstants.class_Offshore_Renewables_Fraction_Value, 1, message);
		return deleteSchedule;
	}
	public void deletePolicy() {
		common.deletePolicyFromPolicyPage(AppConstants.policy_Number+"S01update");
	}
	

}
