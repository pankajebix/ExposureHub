package ehub.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;

public class S28createandRunOffshoreOrOnshoreAggregateReportPage {
	
	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S28createandRunOffshoreOrOnshoreAggregateReportPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username, AppConstants.password);
	}
	
	public String createAndRunAggregateReport(String reportName) {
		String actual=common.createNewReportWithMapToolsShapesEvent(reportName, AppConstants.class_Name_Offshore_Renewables_With_Entity_Name, AppConstants.aggegation_Select_Data_Policy_Type,AppConstants.peril_Name_War, AppConstants.coverage_Name_Damage_To_Existing_Property, AppConstants.shape_Name_Data, AppConstants.damage_Factor_Value_25km_Earthquake, AppConstants.event_Type_Select_Data_Shape, "200");
		return actual;
	}
}
