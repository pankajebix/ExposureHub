package ehub.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;

public class S10createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOnPage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S10createNewOnshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOnPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}

	public String createNewPolicy(String policyNumber) {
		 String createdPolicyVerify =common.createNewPolicyWithClassNameAndCoverageRule(policyNumber, AppConstants.policy_Assured + "10", 2, AppConstants.className_two_class_With_Same_Name);
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
	
	public String importSchedule100(String verificationMessage) {
		String actual=common.importSchedule(AppConstants.class_Cyber_Fraction_Value, verificationMessage, AppConstants.import_File_Path_100_Onshore, "yes", "yes");
		return actual;
	}
	
	public String editAndimportSchedule900(String verificationMessage) {
		String actual=common.importSchedule(AppConstants.class_Cyber_Fraction_Value, verificationMessage, AppConstants.import_File_Path_1000_Onshore, "yes", "yes");
		return actual;
	}

}
