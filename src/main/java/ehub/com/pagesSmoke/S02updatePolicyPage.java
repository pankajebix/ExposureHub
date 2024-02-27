package ehub.com.pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;
import ehub.com.pages.CommonLocatorsAndMethod;

public class S02updatePolicyPage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S02updatePolicyPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}
	
	public String searchPolicy(String policyNumber) {
		String actual=common.searchPolicyAndOpen(policyNumber);
		return actual;
	}
	public String editPolicyDetails(String policyReferenceDataUpdated, String assuredDataUpdated) {
		String actual=common.editPolicyDetails(policyReferenceDataUpdated, assuredDataUpdated);
		return actual;
	}
	
	public String editLimitGroup(String newGroupName) {
		String actual=common.editLimitGroup(AppConstants.limit_Group_Name+"S01", newGroupName, AppConstants.country_Australia);
		return actual;
	}
	
	public String copyAndCreateNewLimitGroup(String validationMessage) {
		String actual=common.copyLimitGroup(AppConstants.limit_Group_Name+"S01update", validationMessage);
		return actual;
	}
	public String copyAndCreateNewLimit(String validationMessage) {
		String actual=common.copyLimit(validationMessage);
		return actual;
	}
	public boolean editCyberSchedule() {
		boolean actual = common.editSchedule(AppConstants.class_Cyber_Fraction_Value, AppConstants.schedule_Option_Data_Assured_Interest, "80");
		return actual;
	}
	
	public boolean editOffshoreSchedule() {
		boolean actual = common.editSchedule(AppConstants.class_Offshore_Fraction_Value, AppConstants.schedule_Option_Data_Assured_Interest, "85");
		return actual;
	}
	
	public boolean editOffshoreRenewablesSchedule() {
		boolean actual = common.editSchedule(AppConstants.class_Offshore_Renewables_Fraction_Value, AppConstants.schedule_Option_Data_Assured_Interest, "95");
		return actual;
	}
	
	public void viewPointDataOnMap() {
		common.viewPointDataOnMaps();
	}

}
