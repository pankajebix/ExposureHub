package ehub.com.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;

public class S01createNewPolicyPage {

	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S01createNewPolicyPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}

	public String createNewPolicy(String policyNumber) {
		 String createdPolicyVerify =common.createNewPolicyWithClassName(policyNumber, AppConstants.policy_Assured + "01", 2, AppConstants.className_two_class_With_Different_Name);
		return createdPolicyVerify;
	}

}
