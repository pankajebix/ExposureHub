package ehub.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ehub.com.constants.AppConstants;

public class S31renewPolicyPage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S31renewPolicyPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}
	
	public String createNewPolicy(String policyNumber) {
		String actual=common.createNewPolicyWithClassName(policyNumber, AppConstants.policy_Assured+"31", 2, AppConstants.className_two_class_With_Same_Name);
		return actual;
	}
	
	public String renewPolicy(String renewPolicyNumber) {
		String actual=common.renewPolicy(AppConstants.policy_Number+"31", renewPolicyNumber);
		return actual;
	}
}
