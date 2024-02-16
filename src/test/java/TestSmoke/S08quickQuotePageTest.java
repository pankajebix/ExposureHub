package TestSmoke;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ehub.com.baseLibrary.BaseClass;
import ehub.com.constants.AppConstants;
import ehub.com.pagesSmoke.S08quickQuotePage;
import ehub.com.utils.Excelutility;

public class S08quickQuotePageTest extends BaseClass{
	
	S08quickQuotePage S08page;
	Excelutility excUtil = new Excelutility(System.getProperty("user.dir") + AppConstants.pathofExcelDataAsPerEnv);

	@BeforeTest
	public void setupBrowser() {
		initilization();
		S08page = new S08quickQuotePage(driver);
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		S08page.login();
	}
	
	@Test(priority = 2, enabled = true)
	public void quickQuote() {
		S08page.quickQuote();
	}

}
