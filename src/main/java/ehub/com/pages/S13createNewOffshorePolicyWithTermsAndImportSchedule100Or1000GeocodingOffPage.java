package ehub.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;

public class S13createNewOffshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S13createNewOffshorePolicyWithTermsAndImportSchedule100Or1000GeocodingOffPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}

	public String createNewPolicy(String policyNumber) {
		 String createdPolicyVerify =common.createNewPolicyWithClassName(policyNumber, AppConstants.policy_Assured + "13", 1, AppConstants.className_one);
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
		String actual=common.importSchedule(AppConstants.class_Offshore_Renewables_Fraction_Value, verificationMessage, AppConstants.import_File_Path_100_Offshore, "no", "no");
		return actual;
	}
	
//	public void editAndimportSchedule1000(String verificationMessage) {
//		common.importSchedule(AppConstants.class_Cyber_Fraction_Value, verificationMessage, AppConstants.import_File_Path_1000_Onshore, "no");
//	}

}
