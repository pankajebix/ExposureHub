package ehub.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;

public class S19createNewOnshorePolicyWithoutSavingWarningMessageVisiblePage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S19createNewOnshorePolicyWithoutSavingWarningMessageVisiblePage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}
	
	public void createNewPolicyWithoutSavingWarningMessage(String policyNumber) {
		common.createNewPolicyWithClassNameWithoutSavingWarningMessageVisible(policyNumber, AppConstants.policy_Assured+"19", 2, AppConstants.className_two_class_With_Same_Name, "no");		
	}

}
