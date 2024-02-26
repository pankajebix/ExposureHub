package ehub.com.constants;

import java.util.Arrays;
import java.util.List;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.utils.ExcelUtil;

public class AppConstants {

	public static final String pathofExcelDataAsPerEnv =BaseClass.chooseTestEnvironment();
	static ExcelUtil excUtil = new ExcelUtil(
			System.getProperty("user.dir") +pathofExcelDataAsPerEnv );

	public static final int DEFAULT_MEDIUM_TIME_OUT = 10;
	public static final int DEFAULT_SHORT_TIME_OUT = 5;
	public static final int DEFAULT_LONG_TIME_OUT = 20;

	public static final String LOGIN_PAGE_TITLE_VALUE = "ExposureHub";
	public static final String LOGIN_PAGE_URL_FRACTION_VALUE = "ebixexchange.com/login";

	public static final String userID_Label = "User Id *";
	public static final String password_Label = "Password *";
	public static final String login_Button_Text = "LOGIN";
	public static final String powered_By_Text = "Powered By";

	public static final String Expected_Error_Login_Message = "Message(s)";
	public static final String Expected_userId_Error_Message = "User Id is required";
	public static final String Expected_Password_Error_Message = "Password is required";

	public static final String URL_After_User_Login = "";
	public static final String Title_After_User_Login = "";

	public static final List<String> verify_Error_Message_Of_LoginPage = Arrays.asList("Message(s)",
			"User Id is required", "Password is required");

	public static final List<String> expected_URL_and_Title_List_After_Login = Arrays.asList(URL_After_User_Login,
			Title_After_User_Login);	
	
	// *********************Sheet Names***********************//
	public static final String REGISTER_SHEET_NAME = "register";

	// *******************************************************************************************************
	public static final String username = excUtil.getCellData("loginCredentials", "Username", 2);
	public static final String password = excUtil.getCellData("loginCredentials", "Password", 2);
	
	public static final String username_UQ = excUtil.getCellData("loginCredentials", "Username", 3);
	public static final String password_UQ = excUtil.getCellData("loginCredentials", "Password", 3);

	public static final String policy_Number = excUtil.getCellData("policyNumber", "Value", 2);
	public static final String policy_Assured = excUtil.getCellData("policyNumber", "Value", 3);

	public static final String limit_Group_Name = excUtil.getCellData("policyNumber", "Value", 4);

	public static final String report_Name = excUtil.getCellData("policyNumber", "Value", 5);
	public static final String coverage_Name = excUtil.getCellData("policyNumber", "Value", 6);

	// **********************************************************************************************
	public static final String input_Data_Country_North_Korea = "North Korea";

	// **********************************************************************************************
	public static final String country_Australia = "Australia";
	public static final String country_Brazil = "";
	public static final String country_Bangladesh = "Bangladesh";
	public static final String country_Afghanistan = "Afghanistan";
	public static final String country_US = "United States";

	// *************************************************************************************
//	public static final String className_one = "Offshore Renewables";
//	public static final String className_two_class_With_Same_Name = "Cyber,Cyber";
//	public static final String className_two_class_With_Different_Name = "Offshore,Offshore Renewables";
	
	public static final String className_one = excUtil.getCellData("classDetailsForFramework", "className_one", 2);
	public static final String className_two_class_With_Same_Name = excUtil.getCellData("classDetailsForFramework", "className_two_class_With_Same_Name", 2);
	public static final String className_two_class_With_Different_Name = excUtil.getCellData("classDetailsForFramework", "className_two_class_With_Different_Name", 2);


	// *****************************************************************************************************************
	//property class=home
	//terrorism=grade
	//cyber class=timer
	//offshore class=invert_colors
	//offshore renewables=wind_power
	
//	public static final String class_Cyber_Fraction_Value = "timer";
//	public static final String class_Offshore_Fraction_Value = "invert_colors";
//	public static final String class_Offshore_Renewables_Fraction_Value = "wind_power";
	
	public static final String class_Cyber_Fraction_Value = excUtil.getCellData("classDetailsForFramework", "className_two_class_With_Same_Name", 3);
	public static final String class_Offshore_Fraction_Value = excUtil.getCellData("classDetailsForFramework", "className_two_class_With_Different_Name", 3);
	public static final String class_Offshore_Renewables_Fraction_Value = excUtil.getCellData("classDetailsForFramework", "className_one", 3);

	// ****************************************************************************************************
	public static final String class_Name_Offshore = "Offshore";
	public static final String class_Name_Offshore_Renewables = "Offshore Renewables";
	public static final String class_Name_Cyber = "Cyber";

	// ******************************************************************************************
	//public static final String class_Name_Offshore_Renewables_With_Entity_Name = "Offshore Renewables (Syndicate)";
	
	public static final String class_Name_Offshore_Renewables_With_Entity_Name = excUtil.getCellData("classDetailsForFramework", "class_Name_Offshore_Renewables_With_Entity_Name", 2);

	// ******************************************************************************************************
	public static final String aggegation_Select_Data_Policy_Type = "Policy Type (Policy)";

	// ************************************************************************************************************
	public static final String coverage_Name_Damage_To_Existing_Property = "Damage To Existing Property";

	public static final String storm_Name_Data = "KATRINA (Aug 2005)";
	public static final String shape_Name_Data = "Shape45";

	// *******************************************************************************************
	public static final String event_Type_Select_Data_Hotspot = "Hotspot";
	public static final String event_Type_Select_Data_Shape = "Shape";

	// *****************************************************************************************

	public static final String damage_Factor_Value_Hurricane_50_Nautical_Miles = "Hurricane 50 Nautical Miles Simple";
	public static final String damage_Factor_Value_25km_Earthquake = "25km earthquake";

	// *****************************************************************************************************************
	public static final String peril_Name_War = excUtil.getCellData("classDetailsForFramework", "peril_Name", 2);

	// *******************************************************************************************************************

	public static final String schedule_Option_Data_Assured_Interest = "Assured Interest";
	public static final String schedule_Option_Data_Inception_Date = "Inception Date";
	public static final String schedule_Option_Data_Expiry_Date = "Expiry Date";

	// ***********************************************************************************************************************

	public static final String import_File_Path_100_Onshore = "\\src\\test\\resources\\importData\\Onshore_100_Rows.xls";
	public static final String import_File_Path_1000_Onshore = "\\src\\\\test\\resources\\importData\\Onshore_1000_5000.xlsx";
	public static final String import_File_Path_100_Offshore = "\\src\\test\\resources\\importData\\Offshore_1000_Rows.xls";
}

//test data : excel/DB/json/xml//static test data
//constants: final static 
//env data: properties