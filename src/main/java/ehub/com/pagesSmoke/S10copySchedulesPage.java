package ehub.com.pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;
import ehub.com.pages.CommonLocatorsAndMethod;

public class S10copySchedulesPage {

	// private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S10copySchedulesPage(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}

	public String createNewPolicy(String policyNumber) {
		String actual = common.createNewPolicyWithClassNameAndCoverageRule(policyNumber,
				AppConstants.policy_Assured + "S10", 2, AppConstants.className_two_class_With_Same_Name);
		return actual;
	}

	public String addNewLimitGroup(String groupName) {
		String actual = common.addNewLimitGroup(groupName, AppConstants.country_US);
		return actual;
	}

	public String addNewLimit(String validationMessage) {
		String actual = common.addNewLimit(validationMessage);
		return actual;
	}

	public String addCoverage(String coverageName) {
		String actualCoverageName = common.addCoverageRule(coverageName, AppConstants.country_US);
		return actualCoverageName;
	}

	public String importSchedule(String verificationMessage) {
		String actual = common.importSchedule(AppConstants.class_Cyber_Fraction_Value, verificationMessage,
				AppConstants.import_File_Path_100_Onshore, "yes", "yes");
		return actual;
	}

	public String copySchedule() {
		String actual = common.copyScheduleFromPolicyPage(AppConstants.class_Cyber_Fraction_Value,
				AppConstants.policy_Number + "S01");
		return actual;
	}
}
