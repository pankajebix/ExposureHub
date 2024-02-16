package ehub.com.pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;
import ehub.com.pages.CommonLocatorsAndMethod;

public class S07importOffshoreSchedulesPage {

	// private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S07importOffshoreSchedulesPage(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}

	public String createNewPolicy(String policyNumber) {
		String actual = common.createNewPolicyWithClassNameAndCoverageRule(policyNumber,
				AppConstants.policy_Assured + "S07", 1, AppConstants.className_one);
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
		String actual = common.importSchedule(AppConstants.class_Offshore_Renewables_Fraction_Value, verificationMessage,
				AppConstants.import_File_Path_100_Offshore, "no", "no");
		return actual;
	}

}
