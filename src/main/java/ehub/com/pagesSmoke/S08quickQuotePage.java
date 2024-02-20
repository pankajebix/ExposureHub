package ehub.com.pagesSmoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ehub.com.constants.AppConstants;
import ehub.com.pages.CommonLocatorsAndMethod;

public class S08quickQuotePage {

	//private WebDriver driver;
	CommonLocatorsAndMethod common;

	public S08quickQuotePage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}

	public void login() {
		common.login(AppConstants.username_UQ, AppConstants.password_UQ);
	}

	public String quickQuote() {
		String actualQuickQuotePolicy=common.quickQuote("bethel");
		return actualQuickQuotePolicy;
	}
}
