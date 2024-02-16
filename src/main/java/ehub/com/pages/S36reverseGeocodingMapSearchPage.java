package ehub.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;

public class S36reverseGeocodingMapSearchPage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S36reverseGeocodingMapSearchPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}
	
	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}
	public String createNewPolicy(String policyNumber) {
		String actual=common.createNewPolicyWithClassName(policyNumber, AppConstants.policy_Assured+"36", 2, AppConstants.className_two_class_With_Same_Name);
		return actual;
	}
	
	public String addSchedule(String validationMessage) {
		String actual=common.addBulkScheduleGeneric(AppConstants.class_Cyber_Fraction_Value, AppConstants.country_US, validationMessage);
		return actual;
	}
	
	public void reverseGeocodesearch() {
		common.openSchedule(AppConstants.class_Cyber_Fraction_Value, AppConstants.country_Afghanistan);
	}

}
