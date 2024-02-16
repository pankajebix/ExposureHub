package ehub.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;

public class S16createOnshorePolicyWithCoverageRulesAndScheduleItemsGeocodingOffPage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S16createOnshorePolicyWithCoverageRulesAndScheduleItemsGeocodingOffPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}

	public String createNewPolicy(String policyNumber) {
		 String createdPolicyVerify =common.createNewPolicyWithClassNameAndCoverageRule(policyNumber, AppConstants.policy_Assured + "16", 2, AppConstants.className_two_class_With_Same_Name);
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
	
	public String importSchedule1000(String verificationMessage) {
		String actual=common.importSchedule(AppConstants.class_Cyber_Fraction_Value, verificationMessage, AppConstants.import_File_Path_1000_Onshore, "no", "yes");
		return actual;
	}

}
