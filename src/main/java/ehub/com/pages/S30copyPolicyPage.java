package ehub.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;

public class S30copyPolicyPage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S30copyPolicyPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}
	
	public String createNewPolicy(String policyNumber) {
		String actual=common.createNewPolicyWithClassName(policyNumber, AppConstants.policy_Assured+"30", 1, AppConstants.className_one);
		return actual;
	}
	
	public String copyNewPolicy(String policyNumber) {
		String actual=common.copyNewPolicyFromPolicyPage(policyNumber, "No");
		return actual;
	}
}
