package ehub.com.pages;

import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import ehub.com.constants.AppConstants;
import ehub.com.utils.ElementUtil;
import ehub.com.utils.ExcelUtil;
import ehub.com.utils.JavaScriptUtil;

public class CommonLocatorsAndMethod {

	private WebDriver driver;
	public ElementUtil eleUtil;
	public JavaScriptUtil jsUtil;
	public ExcelUtil excUtil;
	LoginPage loginPage;

	static Logger log = Logger.getLogger(CommonLocatorsAndMethod.class);

	public CommonLocatorsAndMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		eleUtil = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);
		excUtil = new ExcelUtil(System.getProperty("user.dir") + AppConstants.pathofExcelDataAsPerEnv);
		loginPage = new LoginPage(driver);
	}

	@FindBy(xpath = "//span[contains(.,'Policy')]")
	public WebElement HomePage_PolicyLinkButton;

	@FindBy(xpath = "//span[contains(.,'Report')]")
	public WebElement HomePage_ReportLinkButton;

	@FindBy(xpath = "//span[contains(.,'Result')]")
	public WebElement HomePage_ResultLinkButton;

	@FindBy(xpath = "//div[@class='nav-border-bottom']/div/ul/li/a[@target='_blank' and text()='Report']")
	public WebElement reportHeaderLinkFromPolicyPage;

	@FindBy(xpath = "//div[@class='nav-border-bottom']/div/ul/li/a[@target='_blank' and text()='Policy']")
	public WebElement policyHeaderLinkFromPolicyPage;

	@FindBy(xpath = "//mat-icon[contains(.,'add_circle_outline')]")
	public WebElement PolicyPlus_Button;
	
	@FindBy(xpath = "//mat-icon[contains(.,'add_circle_outline')]/parent::span[text()='QuickQuote ']")
	public WebElement quickQuotePlus_Button;

	@FindBy(xpath = "(//mat-select[contains(@id,'mat-select-')])[2]")
	// (//span[contains(.,'Syndicate')])[2]
	public WebElement ClickOn_Entity;

	@FindBy(xpath = "(//div[@class='cdk-overlay-pane']/div/div/mat-option)[1]")
	//(//span[contains(.,'Syndicate')])[3]		
	public WebElement SelectEntity;

	@FindBy(xpath = "//div/mat-select[@id='Class']")
	public WebElement classField;

	@FindBy(xpath = "//span[text()=' Offshore ']")
	public WebElement classOffshore;

	@FindBy(xpath = "//span[text()=' Offshore Renewables ']")
	public WebElement classOffshoreRenewable;

	@FindBy(xpath = "//div/mat-select[@id='Perils']")
	public WebElement PerilsField;

	@FindBy(id = "Coverages")
	public WebElement coveragesField;

	@FindBy(xpath = "//mat-select[@formcontrolname='coverages']")
	public WebElement coveragesFieldReportPage;

	@FindBy(xpath = "//mat-label[contains(text(),'Policy Reference')]/parent::label/parent::span/../input")
	public WebElement policyReference;

	@FindBy(xpath = "//input[contains(@data-placeholder,'Assured')]")
	public WebElement EnterAssured;

	@FindBy(xpath = "//h4[contains(.,'Other Fields')]")
	public WebElement other_Field_text;

	@FindBy(xpath = "//span[contains(.,'saveSave')]")
	public WebElement PolicySave;

	@FindBy(xpath = "(//img[@src='assets/images/journey-menu-icons/POL.png'])[1]")
	public WebElement PolicyNavigationImage;

	@FindBy(xpath = "(//img[@src='assets/images/journey-menu-icons/REP.png'])[1]")
	public WebElement reportNavigationImage;

	@FindBy(xpath = "(//img[@src='assets/images/journey-menu-icons/RES.png'])[1]")
	public WebElement resultNavigationImage;
	
	@FindBy(xpath = "//div/span[text()='reorder']")
	public WebElement leftMenuNavigation;

	@FindBy(xpath = "//mat-icon[contains(.,'exit_to_app')]")
	public WebElement LogOut;

	@FindBy(xpath = "(//div[@class='panel-title-summary'])[1]/div[2]/h4")
	public WebElement verifyCreatedPolicy;

	@FindBy(xpath = "//span[@class='material-icons'][contains(.,'account_balance')]")
	public WebElement TermsNavigationImage;

	@FindBy(xpath = "//span[@class='material-icons'][contains(.,'add_task')]")
	public WebElement coverageRuleNavigationImage;

	@FindBy(xpath = "(//span[@class='material-icons'][contains(.,'timer')])[1]")
	public WebElement ScheduleCyberNavigationImage;

	@FindBy(xpath = "(//span[@class='material-icons'][contains(.,'invert_colors')])[1]")
	public WebElement ScheduleOffshoreNavigationImage;

	@FindBy(xpath = "(//span[@class='material-icons'][contains(.,'wind_power')])[1]")
	public WebElement ScheduleOffshoreRenewablesNavigationImage;

	@FindBy(xpath = "(//span[contains(.,'Edit')])[4]")
	public WebElement Edit_TermsButton;

	@FindBy(xpath = "(//span[contains(.,'Edit')])[5]")
	public WebElement Edit_coverageRuleButton;

	@FindBy(xpath = "(//span[@class='material-icons' and text()='add'])[1]")
	public WebElement Add_LimitGroupSign;

	@FindBy(xpath = "//div[@col-id='LimitGroupDescription' and text()='SS']/parent::div/div[@col-id='params']/div/span/app-terms-grid-child-icon/span/span[text()='content_copy']")
	public WebElement copyLimitGroup;

	@FindBy(xpath = "//span[@class='aligned-with-icon'][contains(.,'Add rule')]")
	public WebElement Click_AddRule;

	@FindBy(xpath = "//input[@placeholder='Enter...']")
	public WebElement CountryName;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'Preview')]")
	public WebElement PreviewButton;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'Run')]")
	public WebElement runButton;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'Map Tools ')]")
	public WebElement mapToolsButton;

	@FindBy(xpath = "//mat-select[@placeholder='Select Type'][contains(.,'Select Type')]")
	public WebElement eventTypeField;

	@FindBy(xpath = "//div[@class='mat-tab-label-content'][contains(.,'Storms')]")
	public WebElement stormsButton;

	@FindBy(xpath = "//div//input[@data-placeholder='Type a name to draw or search']")
	public WebElement stormsNameInputBox;

	@FindBy(xpath = "//div//input[@aria-label='Shape name']")
	public WebElement shapeNameInputBox;

	@FindBy(xpath = "//input[contains(@aria-label,'ReportName')]")
	public WebElement reportNameInputBox;

	@FindBy(xpath = "//mat-select[@formcontrolname='Perils']")
	public WebElement perilFieldReportPage;

	@FindBy(xpath = "(//div//mat-select[@placeholder='Select'])[1]")
	public WebElement classEntityFieldReportPage;

	@FindBy(xpath = "//mat-select[@formcontrolname='AggGrouping']")
	public WebElement aggregationFieldReportPage;

	@FindBy(xpath = "//span[contains(.,'Select a Damage Factor Set')]")
	public WebElement damageFactorSetField;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'doneSave')]")
	public WebElement saveButton;
	
	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'Save')]/parent::button")
	public WebElement saveButton2;

	@FindBy(xpath = "(//span[@class='mat-button-wrapper'][contains(.,'cancelCancel')])[last()]")
	public WebElement cancelButton;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'doneSave')]")
	// span[@class='mat-button-wrapper'][contains(.,'saveSave')]
	public WebElement SaveGroupLimits;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'Save')]")
	public WebElement saveTerms;

	@FindBy(xpath = "(//span[@class='material-icons' and text()='add'])[4]")
	public WebElement Add_NewLimit;

	@FindBy(xpath = "(//span[@class='material-icons'][contains(.,'delete')])[5]")
	public WebElement deleteLimit5;

	@FindBy(xpath = "(//span[@class='material-icons'][contains(.,'delete')])[3]")
	public WebElement deleteLimitGroup3;

	@FindBy(xpath = "(//div[@col-id='LimitGroupDescription'])[4]")
	public WebElement actualGroupNameElement;

	@FindBys(@FindBy(xpath = "//span[@class='material-icons'][contains(.,'add')]"))
	public List<WebElement> newLimitAddedVerify;

	@FindBy(xpath = "//div[@class='class-icon-set-margin class-icon']/span[text()='timer']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']")
	public WebElement editScheduleCyber;

	@FindBy(xpath = "//div[@class='class-icon-set-margin class-icon']/span[text()='invert_colors']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']")
	public WebElement editScheduleOffshore;

	@FindBy(xpath = "//div[@class='class-icon-set-margin class-icon']/span[text()='wind_power']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']")
	public WebElement editScheduleOffshoreRenewables;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'saveSave')]")
	public WebElement saveScheduleCyber;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'Add Single ')]")
	public WebElement addSingleScheduleButton;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'Import ')]")
	public WebElement importScheduleButton;

	@FindBy(xpath = "//button/span[contains(.,'Search')]")
	public WebElement addSingleScheduleSearch;

	@FindBy(xpath = "(//div[@class='ag-center-cols-container']/div[@row-index='0']/div[@col-id='LocationType'])[last()]")
	public WebElement addSingleScheduleData;	
	
	@FindBy(xpath = "(//button/span[contains(.,'Save')])[last()]")
	public WebElement saveSingleSchedule;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'add_circle_outlineSchedule')]")
	public WebElement addBulkSchedule;

	@FindBy(xpath = "//input[contains(@formcontrolname,'wildcardSearch')]")
	public WebElement bulkScheduleCountryName;

	@FindBy(xpath = "(//input[contains(@formcontrolname,'wildcardSearch')]/following::input[@ref='eInput'])[last()]")
	// (//input[contains(@formcontrolname,'wildcardSearch')]/following::input[@ref='eInput'])[13]/parent::div
	public WebElement selectBulkCountryName1;

	@FindBy(xpath = "(//input[contains(@formcontrolname,'wildcardSearch')]/following::input[@ref='eInput'])[last()-1]")
	public WebElement selectBulkCountryName2;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'check_circle_outlineSave')]")
	public WebElement applyBulkSchedule;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'cancelClose')]")
	public WebElement closeBulkSchedule;

	@FindBy(xpath = "//img[@alt='../../../../assets/images/icons/map.svg']")
	public WebElement mapNavigationImage;

	@FindBy(xpath = "//button[@type='submit']//span[@class='mat-tooltip-trigger'][normalize-space()='Edit']")
	public WebElement editPolicy;

	@FindBy(xpath = "//span[contains(.,'saveSave')]")
	public WebElement savePolicy;

	@FindBy(xpath = "//button/span[text()=' Yes ']")
	public WebElement removeClassConfirmation;

	@FindBys(@FindBy(xpath = "(//div[@class='chipdrag'])[1]/div"))
	public List<WebElement> classSize;

	@FindBy(xpath = "(//img[@src='assets/images/journey-menu-icons/HUB.png'])[1]")
	public WebElement hubNavigation;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchPolicyInputBox;

	@FindBy(xpath = "//input[@placeholder='Report Name']")
	public WebElement searchReportInputBox;

	@FindBy(xpath = "//div[@col-id='[Pol].PolicyReference' and @role='gridcell']")
	public WebElement searchedPolicyData;

	@FindBy(xpath = "//div[@col-id='[RRP].Description' and @role='gridcell']")
	public WebElement searchedReportData;

	@FindBy(xpath = "//button/span[text()=' Yes ']")
	public WebElement deleteLimitConfirmationYes;

	@FindBy(xpath = "//button/span[text()=' Yes ']")
	public WebElement confirmationYes;

	@FindBy(xpath = "//button/span[contains(text(),'OK')]")
	public WebElement confirmationOk;

	@FindBy(xpath = "//button/span[text()=' No ']")
	public WebElement confirmationNo;

	@FindBys(@FindBy(xpath = "//span[@class='material-icons'][contains(.,'delete')]"))
	public List<WebElement> limitSize;

	@FindBys(@FindBy(xpath = "//span[@class='material-icons'][contains(.,'delete')]"))
	public List<WebElement> rowSize;
	
	@FindBys(@FindBy(xpath = "//div[@col-id='actions' and @role='gridcell']//button"))
	public List<WebElement> rowSizeOfPolicySearched;

	@FindBy(xpath = "//div[@col-id='actions' and @role='gridcell']//button")
	public WebElement rowActionSearchedPolicy;

	@FindBy(xpath = "//div[@role='menu']/div/ul/li[text()='Delete']")
	public WebElement rowActionDeleteButton;

	@FindBy(xpath = "//div[@role='menu']/div/ul/li[text()='Edit']")
	public WebElement rowActionEditButton;
	
	@FindBy(xpath = "//div[@role='menu']/div/ul/li[text()='Copy Schedule']")
	public WebElement rowActionCopyScheduleButton;

	@FindBy(xpath = "//div[@role='menu']/div/ul/li[text()='Open']")
	public WebElement rowActionOpenButton;

	@FindBy(xpath = "//div[@class='bulk-edit-grid']/mat-form-field/div")
	public WebElement editScheduleEditPopup;

	@FindBy(xpath = "//div/input[@formcontrolname='Edit']")
	public WebElement editScheduleEditPopupInputBox;

	@FindBy(xpath = "//div[@ref='eViewport']/div[@role='rowgroup']")
	public WebElement verifyDeletedPolicy;

	@FindBy(xpath = "//mat-icon[@role='img' and text()=' refresh ']")
	public WebElement refreshPolicy;

	@FindBy(xpath = "(//div[@class='class-icon-set-margin class-icon']/span[text()='timer']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div )[1]/div[@col-id='row_selection']/div/div/div[@ref='eCheckbox']")
	public WebElement selectRow1Cyber;

	@FindBy(xpath = "//div[@class='class-icon-set-margin class-icon']/span[text()='timer']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div[@row-id='0']/div[@col-id='actions']/app-row-actions/button")
	public WebElement rowAction1Cyber;

	@FindBy(xpath = "(//ag-grid-angular[@id='policyHubGrid']/div/div/div[@ref='gridBody']/div[@ref='eBodyViewport']/div/div)[1]/div/app-row-actions/button")
	public WebElement rowActionButtonPolicyHub;

	@FindBy(xpath = "//ag-grid-angular[@class='ag-theme-balham custom-primary-table']/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div[@row-id='0']/div[@col-id='actions']/app-common-row-actions/button")
	public WebElement rowActionReportFirstRow;

	@FindBys(@FindBy(xpath = "//div[@class='class-icon-set-margin class-icon']/span[text()='timer']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div"))
	public List<WebElement> rowSizeCyber;

	@FindBys(@FindBy(xpath = "//div[@class='class-icon-set-margin class-icon']/span[text()='invert_colors']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div"))
	public List<WebElement> rowSizeOffshore;

	@FindBys(@FindBy(xpath = "//mat-select[@id='Perils']//div[@class='chipdrag']/div"))
	public List<WebElement> perilsSizeOfSelectedData;

	@FindBys(@FindBy(xpath = "//mat-select[@id='Coverages']//div[@class='chipdrag']/div"))
	public List<WebElement> coverageSizeOfSelectedData;

	@FindBy(xpath = "//mat-label[text()='Group Name']/../../../input")
	public WebElement groupNameInputBox;

	@FindBy(xpath = "//span[@class='mat-checkbox-label'][contains(text(),'Has Coverage Rules')]")
	public WebElement hasCoverageRule;

	@FindBy(xpath = "//input[@class='file-upload']")
	public WebElement chooseFile;

	@FindBy(xpath = "//span[@class='mat-button-wrapper'][contains(.,'done Finish')]")
	public WebElement finishButton;

	@FindBy(xpath = "//span[@class='mat-tooltip-trigger'][contains(.,'Copy/Renew')]")
	public WebElement copyRenewButton;
		
	@FindBy(xpath = "//button/span[text()='Search']")
	public WebElement searchButton;
	
	@FindBy(xpath = "(//div[@ref='eLabel']/span[text()='County'])[2]/../../../../../div[@class='ag-header-row ag-header-row-column-filter']/div[@aria-colindex='6']/div[@ref='eFloatingFilterBody']/app-customfloatinglocationpoup/div/div/mat-form-field/div/div/div/input")
	public WebElement countyInputGrid;
	
	@FindBy(xpath = "(//div[contains(.,'NoGeocoding')])[13]/mat-select")
	public WebElement ClickOnGeocoding;
	
	@FindBy(xpath = "//span[contains(.,'refresh Refresh')]")
	public WebElement refreshButton;
	
	@FindBy(xpath = "(//div[@class='import-policy-title']/span)[1]")
	public WebElement quickQuoteAutomaticPolicyNumberEle;
	
	@FindBy(xpath = "(//div[@class='schedule-upload']/mat-toolbar-top/button)[1]/span[@class='mat-button-wrapper']")
	public WebElement precessedCount;
	
	@FindBy(xpath = "//span[contains(.,'refresh Refresh')]")
	public WebElement refreshButtonOnlyOnePlaceUse;
	
	@FindBy(xpath = "//div[@class='current-import-grid-title']/mat-icon")
	public WebElement copySchedulePopupFilterButton;
	
	@FindBy(xpath = "(//div[@ref='eLabel']/span[text()='Policy Reference'])[2]/../../../../../div[2]/div[7]/div/app-customfloatingfilter/div/div/mat-form-field/div/div/div/input")
	public WebElement ingridPolicySeachCopySchedule;
	
	@FindBy(xpath = "//button/span[text()='Copy ']")
	public WebElement copyButtonForCopySchedule;
	
	public void login(String userName, String password) {
		loginPage.doLogin(userName, password);
	}

	public String createNewPolicyWithClassName(String policyReferenceData, String policyAssuredData, int howManyClass,
			String classNameWithCommaSeprated) {
		String createdPolicyVerify = null;
		try {
			HomePage_PolicyLinkButton.click();
			log.info("Clicked on Policy");

			eleUtil.waitForElementVisibleAndToBeClickable(PolicyPlus_Button, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			PolicyPlus_Button.click();
			log.info("Clicked on Add Policy");

			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(PolicyNavigationImage);

			eleUtil.waitForElementVisibleAndToBeClickable(ClickOn_Entity, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			ClickOn_Entity.click();
			log.info("Clicked on Entity Grid");

			eleUtil.waitForElementVisibleAndToBeClickable(SelectEntity, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			SelectEntity.click();
			log.info("Select Entity");

			eleUtil.waitForElementVisibleAndToBeClickable(classField, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			classField.click();
			log.info("Clicked on Class Grid");
			Thread.sleep(3000);

			for (int i = 0; i < howManyClass; i++) {
				String className[] = classNameWithCommaSeprated.split(",");
				WebElement classNameValue = driver
						.findElement(By.xpath("//span[text()='" + " " + className[i] + " " + "']"));

				eleUtil.waitForElementVisibleAndToBeClickable(classNameValue, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

				jsUtil.clickElementByJS(classNameValue);
				Thread.sleep(500);
				log.info("Select Class - " + classNameValue);
			}

			eleUtil.clickTab();
			Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(PerilsField, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(PerilsField);

			log.info("Clicked on Perils Grid");

			eleUtil.clickTab();

			eleUtil.waitForElementVisibleAndToBeClickable(policyReference, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			policyReference.sendKeys(policyReferenceData);
			log.info("Enter Policy Reference : " + policyReferenceData);

			eleUtil.waitForElementVisibleAndToBeClickable(EnterAssured, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			EnterAssured.sendKeys(policyAssuredData);
			log.info("Enter Assured : " + policyAssuredData);

			jsUtil.scrollIntoViewTrue(other_Field_text);
			log.info("Scroll till other field text");

			eleUtil.waitForElementVisibleAndToBeClickable(other_Field_text, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(other_Field_text);
			log.info("Clicked on Other Field");
			Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(PolicySave);

			eleUtil.waitForElementVisibleAndToBeClickable(PolicySave, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicySave.click();
			log.info("Clicked on Save");

			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			PolicyNavigationImage.click();
			log.info("Clicked on Policy Navigation Link");

			eleUtil.waitForElementVisible(verifyCreatedPolicy, AppConstants.DEFAULT_LONG_TIME_OUT);

			createdPolicyVerify = verifyCreatedPolicy.getText();
			Thread.sleep(1000);
			log.info("Verify created Policy");

		} catch (Exception e) {
			System.out.println("Issue in Common.createNewPolicyWithClassName " + e);
		}
		return createdPolicyVerify;
	}

	public String createNewPolicyWithClassNameAndCoverageRule(String policyReferenceData, String policyAssuredData,
			int howManyClass, String classNameWithCommaSeprated) {
		String createdPolicyVerify = null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(HomePage_PolicyLinkButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			HomePage_PolicyLinkButton.click();
			log.info("Clicked on Policy");

			eleUtil.waitForElementVisibleAndToBeClickable(PolicyPlus_Button, AppConstants.DEFAULT_LONG_TIME_OUT);

			PolicyPlus_Button.click();
			log.info("Clicked on Add Policy");

			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(PolicyNavigationImage);

			eleUtil.waitForElementVisibleAndToBeClickable(ClickOn_Entity, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			ClickOn_Entity.click();
			log.info("Clicked on Entity Grid");

			eleUtil.waitForElementVisibleAndToBeClickable(SelectEntity, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			SelectEntity.click();
			log.info("Select Entity");
	
			eleUtil.waitForElementVisibleAndToBeClickable(classField, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			classField.click();
			log.info("Clicked on Class Grid");
			Thread.sleep(3000);

			for (int i = 0; i < howManyClass; i++) {
				String className[] = classNameWithCommaSeprated.split(",");
				WebElement classNameValue = driver
						.findElement(By.xpath("//span[text()='" + " " + className[i] + " " + "']"));
				
				eleUtil.waitForElementVisibleAndToBeClickable(classNameValue, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

				jsUtil.clickElementByJS(classNameValue);
				Thread.sleep(500);
				log.info("Select Class - " + classNameValue);
			}

			eleUtil.clickTab();
			Thread.sleep(2000);
			eleUtil.waitForElementVisibleAndToBeClickable(PerilsField, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(PerilsField);
			
			log.info("Clicked on Perils Grid");

			eleUtil.clickTab();

			eleUtil.waitForElementVisibleAndToBeClickable(policyReference, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			policyReference.sendKeys(policyReferenceData);
			log.info("Enter Policy Reference : " + policyReferenceData);

			// Thread.sleep(3000);

			eleUtil.waitForElementVisibleAndToBeClickable(EnterAssured, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			EnterAssured.sendKeys(policyAssuredData);
			log.info("Enter Assured : " + policyAssuredData);

			jsUtil.scrollIntoViewTrue(other_Field_text);
			log.info("Scroll till other field text");
			// Thread.sleep(5000);

			eleUtil.waitForElementVisibleAndToBeClickable(other_Field_text, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(other_Field_text);
			log.info("Clicked on Other Field");
			// Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(hasCoverageRule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(hasCoverageRule);
			// Thread.sleep(2000);
			log.info("Clicked on Coverage Rule");

			jsUtil.scrollIntoViewTrue(PolicySave);
			// Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(PolicySave, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicySave.click();
			log.info("Clicked on Save");
			// Thread.sleep(4000);
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicyNavigationImage.click();
			log.info("Clicked on Policy Navigation Link");
			// Thread.sleep(5000);

			eleUtil.waitForElementVisible(verifyCreatedPolicy, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			createdPolicyVerify = verifyCreatedPolicy.getText();
			Thread.sleep(1000);
			log.info("Verify created Policy");

		} catch (Exception e) {
			System.out.println("Issue in Common.createNewPolicyWithClassNameAndCoverageRule " + e);
		}
		return createdPolicyVerify;
	}

	public void createNewPolicyWithClassNameWithoutSavingWarningMessageVisible(String policyReferenceData,
			String policyAssuredData, int howManyClass, String classNameWithCommaSeprated, String saveChangesYesOrNo) {
		// String createdPolicyVerify = null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(HomePage_PolicyLinkButton, AppConstants.DEFAULT_LONG_TIME_OUT);
			HomePage_PolicyLinkButton.click();
			log.info("Clicked on Policy");
			
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyPlus_Button, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicyPlus_Button.click();
			log.info("Clicked on Add Policy");

			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(PolicyNavigationImage);

			eleUtil.waitForElementVisibleAndToBeClickable(ClickOn_Entity, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			ClickOn_Entity.click();
			log.info("Clicked on Entity Grid");
			
			eleUtil.waitForElementVisibleAndToBeClickable(SelectEntity, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			SelectEntity.click();
			log.info("Select Entity");
			
			eleUtil.waitForElementVisibleAndToBeClickable(classField, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			classField.click();
			log.info("Clicked on Class Grid");
			Thread.sleep(3000);

			for (int i = 0; i < howManyClass; i++) {
				String className[] = classNameWithCommaSeprated.split(",");
				WebElement classNameValue = driver
						.findElement(By.xpath("//span[text()='" + " " + className[i] + " " + "']"));
				Thread.sleep(1000);

				jsUtil.clickElementByJS(classNameValue);
				Thread.sleep(1000);
				log.info("Select Class - " + classNameValue);
			}

			eleUtil.clickTab();
			
			eleUtil.waitForElementVisibleAndToBeClickable(PerilsField, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(PerilsField);;
			log.info("Clicked on Perils Grid");

			eleUtil.clickTab();
			
			eleUtil.waitForElementVisibleAndToBeClickable(policyReference, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			policyReference.sendKeys(policyReferenceData);
			log.info("Enter Policy Reference : " + policyReferenceData);
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, EnterAssured);
			EnterAssured.sendKeys(policyAssuredData);
			log.info("Enter Assured : " + policyAssuredData);

			jsUtil.scrollIntoViewTrue(other_Field_text);
			log.info("Scroll till other field text");
			
			eleUtil.waitForElementVisibleAndToBeClickable(policyHeaderLinkFromPolicyPage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			policyHeaderLinkFromPolicyPage.click();
			log.info("Clicked on Report Link");

			if (saveChangesYesOrNo.toLowerCase().trim().equals("no")) {
				WebElement saveChangesNo = driver.findElement(By.xpath(
						"//div[@class='mat-dialog-actions custom-dialog-btn']/div/button/span[contains(text(),'No')]"));
				eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, saveChangesNo);
		
				saveChangesNo.click();
				log.info("Save Changes - No");

			} else if (saveChangesYesOrNo.toLowerCase().trim().equals("yes")) {
				WebElement saveChangesYes = driver.findElement(By.xpath(
						"//div[@class='mat-dialog-actions custom-dialog-btn']/div/button/span[contains(text(),'Yes')]"));
				eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, saveChangesYes);
				saveChangesYes.click();
				log.info("Save Changes - Yes");
				Thread.sleep(3000);
			}

		} catch (Exception e) {
			System.out.println("Issue in Common.createNewPolicyWithClassNameWithoutSavingWarningMessageVisible " + e);
		}
	}

	// edit policy details-
	public String editPolicyDetails(String policyReferenceData, String policyAssuredData) {
		String createdPolicyVerify = null;
		try {
			PolicyNavigationImage.click();
			log.info("Clicked on Policy Navigation");
			Thread.sleep(3000);

			jsUtil.scrollIntoViewTrue(editPolicy);
			log.info("Scroll - Edit");
			Thread.sleep(2000);
			jsUtil.clickElementByJS(editPolicy);
			log.info("Clicked on Edit");
			Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(policyReference);
			log.info("Scroll - Policy Reference");
			Thread.sleep(2000);

			policyReference.clear();
			policyReference.sendKeys(policyReferenceData);
			log.info("Enter Policy Reference : " + policyReferenceData);

			Thread.sleep(3000);

			EnterAssured.clear();
			EnterAssured.sendKeys(policyAssuredData);
			log.info("Enter Assured : " + policyAssuredData);

			jsUtil.scrollIntoViewTrue(PolicySave);
			Thread.sleep(2000);

			PolicySave.click();
			log.info("Clicked on Save");
			Thread.sleep(4000);

			PolicyNavigationImage.click();
			log.info("Clicked on Policy Navigation Link");
			Thread.sleep(5000);

			createdPolicyVerify = verifyCreatedPolicy.getText();
			Thread.sleep(1000);
			log.info("Verify created Policy");

		} catch (Exception e) {
			System.out.println("Issue in Common.editPolicyDetails " + e);
		}
		return createdPolicyVerify;
	}

	public String addNewLimitGroup(String groupName, String countryName) {
		String actualGroupName = null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			TermsNavigationImage.click();
			log.info("Clicked on Terms Navigation");

			eleUtil.waitForElementVisibleAndToBeClickable(Edit_TermsButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			Edit_TermsButton.click();
			log.info("Clicked on Terms Edit");

			eleUtil.waitForElementVisibleAndToBeClickable(Add_LimitGroupSign, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			Add_LimitGroupSign.click();
			log.info("Clicked on Add Limit Group");

			Thread.sleep(2000);
			Actions LimitGroup_Tab = new Actions(driver);
			Thread.sleep(3000);
			LimitGroup_Tab.sendKeys(Keys.TAB).sendKeys(groupName).build().perform();
			log.info("Enter Limit Group Name : " + groupName);

			eleUtil.waitForElementVisibleAndToBeClickable(Click_AddRule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(Click_AddRule);
			log.info("Clicked on Add Rule Limit Group");


			eleUtil.waitForElementVisibleAndToBeClickable(CountryName, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(CountryName);
			log.info("Clicked on Country Name");

			CountryName.sendKeys(countryName);
			log.info("Enter Country Name : " + countryName);

			eleUtil.waitForElementVisibleAndToBeClickable(PreviewButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			PreviewButton.click();
			log.info("Clicked on Preview Group");

			eleUtil.waitForElementVisibleAndToBeClickable(SaveGroupLimits, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			SaveGroupLimits.click();
			log.info("Clicked on Save Group");

			eleUtil.waitForElementVisibleAndToBeClickable(saveTerms, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			saveTerms.click();
			log.info("Clicked on Save Terms");
			
			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			driver.navigate().refresh();
			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(TermsNavigationImage);
			
			eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_LONG_TIME_OUT, 2,
					actualGroupNameElement);
			eleUtil.waitForElementVisible(actualGroupNameElement, AppConstants.DEFAULT_LONG_TIME_OUT);

			Thread.sleep(1000);
			actualGroupName=eleUtil.retryWebElementGetText(actualGroupNameElement, 30);
			log.info("Verify created Group Name");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.addNewLimitGroup " + e);
		}
		return actualGroupName;
	}

	public String editLimitGroup(String previousGroupName, String newGroupName, String countryName) {
		String actualGroupName = null;
		try {

			TermsNavigationImage.click();
			log.info("Clicked on Terms Navigation");
			// Thread.sleep(5000);

			eleUtil.waitForElementVisibleAndToBeClickable(Edit_TermsButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(Edit_TermsButton);
			log.info("Clicked on Terms Edit");
			// Thread.sleep(5000);

			WebElement editGroupNameAndDetails = driver
					.findElement(By.xpath("//div[@col-id='LimitGroupDescription' and text()='" + previousGroupName
							+ "']/parent::div/div[@col-id='params']/div/span/app-terms-grid-child-icon/span/mat-icon[@data-mat-icon-name='advanced_search']"));

			eleUtil.waitForElementVisibleAndToBeClickable(editGroupNameAndDetails,
					AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			editGroupNameAndDetails.click();
			log.info("Clicked on Edit Limit Group Name and Details");
			// Thread.sleep(2000);
			eleUtil.waitForElementVisibleAndToBeClickable(groupNameInputBox, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			groupNameInputBox.clear();
			groupNameInputBox.sendKeys(newGroupName);
			log.info("Enter Limit Group Name : " + newGroupName);

			// Thread.sleep(3000);
			eleUtil.waitForElementVisibleAndToBeClickable(CountryName, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(CountryName);
			log.info("Clicked on Country Name");

			CountryName.clear();
			CountryName.sendKeys(countryName);
			log.info("Enter Country Name : " + countryName);
			// Thread.sleep(3000);
			eleUtil.waitForElementVisibleAndToBeClickable(PreviewButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			PreviewButton.click();
			log.info("Clicked on Preview Group");
			// Thread.sleep(6000);
			eleUtil.waitForElementVisibleAndToBeClickable(SaveGroupLimits, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			SaveGroupLimits.click();
			log.info("Clicked on Save Group");
			// Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(saveTerms, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			saveTerms.click();
			log.info("Clicked on Save Terms");
			// Thread.sleep(8000);
			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			TermsNavigationImage.click();
			// Thread.sleep(2000);
			eleUtil.waitForElementVisible(actualGroupNameElement, AppConstants.DEFAULT_LONG_TIME_OUT);

			actualGroupName = actualGroupNameElement.getText();
			log.info("Verify created Group Name");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.editLimitGroup " + e);
		}
		return actualGroupName;
	}

	public String addNewLimit(String validationMessage) {
		String validationMessageVerify=null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(Edit_TermsButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(Edit_TermsButton);
			log.info("Clicked on Edit Terms");

			int sizeBefore=rowSize.size();
			
			eleUtil.waitForElementVisibleAndToBeClickable(Add_NewLimit, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(Add_NewLimit);
			log.info("Clicked on Add New Limit");

			eleUtil.waitForElementVisibleAndToBeClickable(saveTerms, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			
			int sizeAfter=rowSize.size();
			
			if(sizeBefore<sizeAfter) {
				validationMessageVerify=validationMessage;
			}
			
			jsUtil.clickElementByJS(saveTerms);
			log.info("Clicked on Save Terms");			
			
			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

		} catch (Exception e) {
			System.out.println("Issue in Common.addNewLimit " + e);
		}
		return validationMessageVerify;
	}

	public String addCoverageRule(String coverageName, String countryName) {
		String actualCoverageGroupName = null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(coverageRuleNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			coverageRuleNavigationImage.click();
			log.info("Clicked on Coverage Navigation");
			// Thread.sleep(5000);

			eleUtil.waitForElementVisibleAndToBeClickable(Edit_coverageRuleButton,
					AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			Edit_coverageRuleButton.click();
			log.info("Clicked on Coverage Edit");
			// Thread.sleep(7000);
			eleUtil.waitForElementVisibleAndToBeClickable(Add_LimitGroupSign, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(Add_LimitGroupSign);
			log.info("Clicked on Add Coverage Group");

			Thread.sleep(2000);
			Actions LimitGroup_Tab = new Actions(driver);
			Thread.sleep(3000);
			LimitGroup_Tab.sendKeys(Keys.TAB).sendKeys(coverageName).build().perform();
			log.info("Enter Coverage Name : " + coverageName);

			// Thread.sleep(3000);
			eleUtil.waitForElementVisibleAndToBeClickable(Click_AddRule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(Click_AddRule);
			// Click_AddRule.click();
			log.info("Clicked on Add Rule Coverage");
			// Thread.sleep(3000);

			eleUtil.waitForElementVisibleAndToBeClickable(CountryName, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(CountryName);
			log.info("Clicked on Country Name");

			CountryName.sendKeys(countryName);
			log.info("Enter Country Name : " + countryName);
			// Thread.sleep(3000);

			eleUtil.waitForElementVisibleAndToBeClickable(PreviewButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			PreviewButton.click();
			log.info("Clicked on Preview Group");
			// Thread.sleep(6000);

			eleUtil.waitForElementVisibleAndToBeClickable(SaveGroupLimits, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			SaveGroupLimits.click();
			log.info("Clicked on Save Coverage");
			Thread.sleep(2000);

			eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_MEDIUM_TIME_OUT, 2, cancelButton);
			eleUtil.waitForElementVisibleAndToBeClickable(cancelButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			// cancelButton.click();
			jsUtil.clickElementByJS(cancelButton);
			log.info("Clicked on Cancel Coverage");
			// Thread.sleep(8000);

			// eleUtil.waitForElementVisible(actualGroupNameElement,
			// AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			WebElement actualCoverageGroupNamePre = driver
					.findElement(By.xpath("(//div[@col-id='CoverageGroupDescription'])[4]"));
			eleUtil.waitForElementVisible(actualCoverageGroupNamePre, AppConstants.DEFAULT_LONG_TIME_OUT);
			log.info("Verify created Coverage Name");
			
			actualCoverageGroupName=eleUtil.retryWebElementGetText(actualCoverageGroupNamePre, 5);
			//actualCoverageGroupName = actualCoverageGroupNamePre.getText();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.addCoverageRule " + e);
		}
		return actualCoverageGroupName;
	}

	public String addSingleScheduleGeneric(String classNameXpath, String verifiedAddedScheduleMessage) {
		String verifyAddedSchedule = null;
		try {
			WebElement scheduleNavigationImage = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			scheduleNavigationImage.click();
			// Thread.sleep(1000);

			log.info("Clicked on Class Navigation");
			// Thread.sleep(5000);

			WebElement editSchedule = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']"));

			eleUtil.waitForElementVisibleAndToBeClickable(editSchedule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			editSchedule.click();
			log.info("Clicked on Edit Schedule");
			// Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(addSingleScheduleButton,
					AppConstants.DEFAULT_MEDIUM_TIME_OUT);

//			List<WebElement> rowSizeSchedule=driver.findElements(By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='"+classNameXpath+"']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div"));
//			int rowSizeBeforeAdded=rowSizeSchedule.size();

			addSingleScheduleButton.click();
			log.info("Clicked on Add Single Schedule");
			// Thread.sleep(5000);
			eleUtil.waitForElementVisibleAndToBeClickable(addSingleScheduleSearch,
					AppConstants.DEFAULT_LONG_TIME_OUT);

			addSingleScheduleSearch.click();
			log.info("Clicked on Single Schedule Search");
			Thread.sleep(5000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(addSingleScheduleData, AppConstants.DEFAULT_LONG_TIME_OUT);
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_LONG_TIME_OUT, addSingleScheduleData);
			
			jsUtil.clickElementByJS(addSingleScheduleData);
			//addSingleScheduleData.click();
			log.info("Add Single Schedule Data");
			Thread.sleep(5000);
			eleUtil.waitForElementVisibleAndToBeClickable(saveSingleSchedule, AppConstants.DEFAULT_LONG_TIME_OUT);

			saveSingleSchedule.click();
			log.info("Clicked on Save Single Schedule");
			Thread.sleep(5000);
			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);

			WebElement editSchedule2 = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']"));

			eleUtil.waitForElementVisibleAndToBeClickable(editSchedule2, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(editSchedule2);
			log.info("Clicked on Edit Schedule Again");
			Thread.sleep(1000);

			List<WebElement> rowSizeScheduleAfter = driver.findElements(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div"));
			Thread.sleep(1000);
			int rowSizeAfterAdded = rowSizeScheduleAfter.size();
			Thread.sleep(1000);
			if (rowSizeAfterAdded > 0) {
				verifyAddedSchedule = verifiedAddedScheduleMessage;
			}
			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, saveSingleSchedule);
			saveSingleSchedule.click();
			log.info("Clicked on Save Schedule");
			// Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("Issue in Common.addSingleScheduleGeneric " + e);
		}
		return verifyAddedSchedule;
	}

	public String addBulkScheduleGeneric(String classNameXpath, String countryName,
			String verifiedAddedScheduleMessage) {
		String verifyAddedSchedule = null;
		try {
			WebElement scheduleNavigationImage = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));

			scheduleNavigationImage.click();
			Thread.sleep(1000);

			log.info("Clicked on Class Navigation");
			// Thread.sleep(5000);

			WebElement editSchedule = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']"));

			eleUtil.waitForElementVisibleAndToBeClickable(editSchedule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			editSchedule.click();
			log.info("Clicked on Edit Schedule");
			// Thread.sleep(1000);
			eleUtil.waitForElementVisibleAndToBeClickable(addBulkSchedule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			addBulkSchedule.click();
			log.info("Clicked on Add Bulk Schedule");
			// Thread.sleep(5000);
			eleUtil.waitForElementVisibleAndToBeClickable(bulkScheduleCountryName,
					AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			bulkScheduleCountryName.click();
			// Thread.sleep(3000);

			bulkScheduleCountryName.clear();
			bulkScheduleCountryName.sendKeys(countryName);
			log.info("Enter Country Name : " + countryName);
			Thread.sleep(8000);

			// selectBulkCountryName1.click();
			jsUtil.scrollIntoViewTrue(selectBulkCountryName1);
			Thread.sleep(2000);
			// eleUtil.waitForElementVisibleAndToBeClickable(selectBulkCountryName1,
			// AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			jsUtil.clickElementByJS(selectBulkCountryName1);
			Thread.sleep(1000);
			log.info("Select Data 1");
			// Thread.sleep(3000);

			// selectBulkCountryName2.click();
			jsUtil.scrollIntoViewTrue(selectBulkCountryName2);
			// Thread.sleep(1000);
			jsUtil.clickElementByJS(selectBulkCountryName2);
			log.info("Select Data 2");
			// Thread.sleep(3000);

			eleUtil.waitForElementVisibleAndToBeClickable(applyBulkSchedule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			applyBulkSchedule.click();
			log.info("Clicked on Apply (Schedule)");
			// Thread.sleep(5000);
			eleUtil.waitForElementVisibleAndToBeClickable(closeBulkSchedule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			closeBulkSchedule.click();
			log.info("Clicked on Close (Schedule)");

			saveScheduleCyber.click();
			log.info("Clicked on Save (Schedule)");
			// Thread.sleep(5000);
			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			WebElement editSchedule2 = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']"));

			eleUtil.waitForElementVisibleAndToBeClickable(editSchedule2, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			editSchedule2.click();
			log.info("Clicked on Edit Schedule Again");
			Thread.sleep(1000);

			List<WebElement> rowSizeScheduleAfter = driver.findElements(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div"));
			Thread.sleep(1000);
			int rowSizeAfterAdded = rowSizeScheduleAfter.size();
			// Thread.sleep(1000);
			if (rowSizeAfterAdded > 0) {
				verifyAddedSchedule = verifiedAddedScheduleMessage;
			}
			
			eleUtil.waitForElementVisibleAndToBeClickable(saveSingleSchedule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			saveSingleSchedule.click();
			log.info("Clicked on Save Schedule");
			// Thread.sleep(5000);

			WebElement scheduleNavigationImage2 = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));

			eleUtil.waitForElementVisibleAndToBeClickable(scheduleNavigationImage2,
					AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			scheduleNavigationImage2.click();
			log.info("Clicked on Policy Navigation");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.addBulkScheduleGeneric " + e);
		}
		return verifyAddedSchedule;
	}

	public String addBulkSchedule10Generic(String classNameXpath, String countryName,
			String verifiedAddedScheduleMessage) {
		String verifyAddedSchedule = null;
		try {
			WebElement scheduleNavigationImage = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			scheduleNavigationImage.click();
			log.info("Clicked on Class Navigation");

			WebElement editSchedule = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']"));

			eleUtil.waitForElementVisibleAndToBeClickable(editSchedule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			editSchedule.click();
			log.info("Clicked on Edit Schedule");

			eleUtil.waitForElementVisibleAndToBeClickable(addBulkSchedule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			addBulkSchedule.click();
			log.info("Clicked on Add Bulk Schedule");

			eleUtil.waitForElementVisibleAndToBeClickable(bulkScheduleCountryName,
					AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			bulkScheduleCountryName.click();

			bulkScheduleCountryName.clear();
			bulkScheduleCountryName.sendKeys(countryName);
			log.info("Enter Country Name : " + countryName);
			Thread.sleep(5000);

			jsUtil.scrollIntoViewTrue(selectBulkCountryName1);
			Thread.sleep(3000);
			
			jsUtil.clickElementByJS(selectBulkCountryName1);
			log.info("Select Data 1");

			jsUtil.scrollIntoViewTrue(selectBulkCountryName2);

			jsUtil.clickElementByJS(selectBulkCountryName2);
			log.info("Select Data 2");


			WebElement selectBulkCountryName3 = driver.findElement(By.xpath(
					"(//input[contains(@formcontrolname,'wildcardSearch')]/following::input[@ref='eInput'])[last()-2]"));
			Thread.sleep(500);
			jsUtil.clickElementByJS(selectBulkCountryName3);
			log.info("Select Data 3");

			WebElement selectBulkCountryName4 = driver.findElement(By.xpath(
					"(//input[contains(@formcontrolname,'wildcardSearch')]/following::input[@ref='eInput'])[last()-3]"));
			jsUtil.clickElementByJS(selectBulkCountryName4);
			log.info("Select Data 4");

			WebElement selectBulkCountryName5 = driver.findElement(By.xpath(
					"(//input[contains(@formcontrolname,'wildcardSearch')]/following::input[@ref='eInput'])[last()-4]"));
			Thread.sleep(500);
			jsUtil.clickElementByJS(selectBulkCountryName5);
			log.info("Select Data 5");

			WebElement selectBulkCountryName6 = driver.findElement(By.xpath(
					"(//input[contains(@formcontrolname,'wildcardSearch')]/following::input[@ref='eInput'])[last()-5]"));
			Thread.sleep(500);
			jsUtil.clickElementByJS(selectBulkCountryName6);
			log.info("Select Data 6");

			WebElement selectBulkCountryName7 = driver.findElement(By.xpath(
					"(//input[contains(@formcontrolname,'wildcardSearch')]/following::input[@ref='eInput'])[last()-6]"));
			Thread.sleep(500);
			jsUtil.clickElementByJS(selectBulkCountryName7);
			log.info("Select Data 7");

			WebElement selectBulkCountryName8 = driver.findElement(By.xpath(
					"(//input[contains(@formcontrolname,'wildcardSearch')]/following::input[@ref='eInput'])[last()-7]"));
			Thread.sleep(500);
			jsUtil.clickElementByJS(selectBulkCountryName8);
			log.info("Select Data 8");
			Thread.sleep(500);

			WebElement selectBulkCountryName9 = driver.findElement(By.xpath(
					"(//input[contains(@formcontrolname,'wildcardSearch')]/following::input[@ref='eInput'])[last()-8]"));
			Thread.sleep(500);
			jsUtil.clickElementByJS(selectBulkCountryName9);
			log.info("Select Data 9");

			WebElement selectBulkCountryName10 = driver.findElement(By.xpath(
					"(//input[contains(@formcontrolname,'wildcardSearch')]/following::input[@ref='eInput'])[last()-9]"));
			Thread.sleep(500);
			jsUtil.clickElementByJS(selectBulkCountryName10);
			log.info("Select Data 10");

			applyBulkSchedule.click();
			log.info("Clicked on Apply (Bulk Schedule)");
			eleUtil.waitForElementVisibleAndToBeClickable(closeBulkSchedule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			closeBulkSchedule.click();
			log.info("Clicked on Close (Bulk Schedule)");

			eleUtil.waitForElementVisibleAndToBeClickable(saveScheduleCyber, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			saveScheduleCyber.click();
			log.info("Clicked on Save (Bulk Schedule)");
			
			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

			WebElement editSchedule2 = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']"));

			eleUtil.waitForElementVisibleAndToBeClickable(editSchedule2, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(editSchedule2);

			log.info("Clicked on Edit Schedule Again");
			Thread.sleep(1000);

			List<WebElement> rowSizeScheduleAfter = driver.findElements(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div"));
			Thread.sleep(1000);
			int rowSizeAfterAdded = rowSizeScheduleAfter.size();

			if (rowSizeAfterAdded > 0) {
				verifyAddedSchedule = verifiedAddedScheduleMessage;
			}

			eleUtil.waitForElementVisibleAndToBeClickable(saveSingleSchedule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			saveSingleSchedule.click();
			log.info("Clicked on Save Schedule");

			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			WebElement scheduleNavigationImage2 = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));

			eleUtil.waitForElementVisibleAndToBeClickable(scheduleNavigationImage2,
					AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			scheduleNavigationImage2.click();
			log.info("Clicked on Schedule Navigation");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.addBulkSchedule10Generic " + e);
		}
		return verifyAddedSchedule;
	}

	public void viewPointDataOnMaps() {
		try {
			mapNavigationImage.click();
			log.info("Clicked on Map Navigation");
			Thread.sleep(8000);

		} catch (Exception e) {
			System.out.println("Issue in Common.viewPointDataOnMaps " + e);
		}
	}

	public Boolean removeClass(WebElement classNameWebElement) {

		boolean removeClassVerify = false;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicyNavigationImage.click();
			log.info("Clicked on Policy Navigation");
			Thread.sleep(2000);

			jsUtil.scrollIntoViewTrue(editPolicy);
			log.info("Scroll - Edit Policy");
			// Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(editPolicy, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			editPolicy.click();
			log.info("Clicked on Edit Policy");
			// Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicyNavigationImage.click();
			log.info("Clicked on Policy Navigation");
			Thread.sleep(1000);

			int classSizeVerifyBefore = classSize.size() - 1;

			eleUtil.waitForElementVisibleAndToBeClickable(classField, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			classField.click();
			log.info("Clicked on Class Grid");
			// Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(classNameWebElement, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			classNameWebElement.click();
			log.info("Deselect Class : " + classNameWebElement);
			// Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(confirmationYes, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			confirmationYes.click();
			log.info("Clicked on Remove Class Confirmation - Yes");
			Thread.sleep(2000);

			eleUtil.clickTab();
			log.info("Clicked on Tab Button");
			Thread.sleep(5000);

			jsUtil.scrollIntoViewTrue(savePolicy);
			log.info("Scroll - Save Policy");
			Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(savePolicy, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			savePolicy.click();
			log.info("Clicked on Save Policy");
			// Thread.sleep(5000);

			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicyNavigationImage.click();
			log.info("Clicked on Policy Navigation");
			Thread.sleep(2000);

			int classSizeVerifyAfter = classSize.size() - 1;
			if (classSizeVerifyAfter == classSizeVerifyBefore - 1) {
				removeClassVerify = true;
			}

		} catch (Exception e) {
			System.out.println("Issue in Common.removeClass " + e);
		}
		return removeClassVerify;
	}

	public String seachPolicyAfterLogin(String policyNumberSearchData) {
		String verifySearchedPolicy = null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(HomePage_PolicyLinkButton,
					AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			HomePage_PolicyLinkButton.click();
			log.info("Clicked on Policy Link from Home Page");
			// Thread.sleep(5000);

			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			hubNavigation.click();
			// Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(searchPolicyInputBox, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			searchPolicyInputBox.click();
			log.info("Clicked on Search Input Box");
			Thread.sleep(500);

			searchPolicyInputBox.clear();
			searchPolicyInputBox.sendKeys(policyNumberSearchData);
			log.info("Enter Policy Number : " + policyNumberSearchData);
			Thread.sleep(4000);

			eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_LONG_TIME_OUT, 3, searchedPolicyData);
			verifySearchedPolicy = searchedPolicyData.getText();
			log.info("Verify Searched Policy");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.seachPolicyAfterLogin " + e);
		}
		return verifySearchedPolicy;
	}

	public String seachReportAfterLogin(String reportSearchData) {
		String verifySearchedReport = null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(HomePage_ReportLinkButton, AppConstants.DEFAULT_LONG_TIME_OUT);
			HomePage_ReportLinkButton.click();
			log.info("Clicked on Report Link from Home Page");
			//Thread.sleep(5000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(hubNavigation);
			//Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(searchReportInputBox, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(searchReportInputBox);
			log.info("Clicked on Search Input Box");
			Thread.sleep(500);
			searchReportInputBox.clear();

			searchReportInputBox.sendKeys(reportSearchData);
			Thread.sleep(4000);
			
			eleUtil.waitForElementVisible(searchedReportData, AppConstants.DEFAULT_LONG_TIME_OUT);
			verifySearchedReport = searchedReportData.getText();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.seachReportAfterLogin " + e);
		}
		return verifySearchedReport;
	}

	public String searchPolicyFromPolicyPage(String policyNumberSearchData) {
		String verifySearchedPolicy = null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			hubNavigation.click();
			log.info("Clicked on Hub Navigation");
			// Thread.sleep(2000);

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, searchPolicyInputBox);
			searchPolicyInputBox.click();
			Thread.sleep(500);

			searchPolicyInputBox.clear();
			Thread.sleep(500);

			searchPolicyInputBox.sendKeys(policyNumberSearchData);
			log.info("Enter Policy Number : " + policyNumberSearchData);
			Thread.sleep(4000);

			eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_MEDIUM_TIME_OUT, 2, searchedPolicyData);
			verifySearchedPolicy = searchedPolicyData.getText();
			log.info("Verify Policy Number Searched Data");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.searchPolicyFromPolicyPage " + e);
		}
		return verifySearchedPolicy;
	}

	public String searchPolicyFromPolicyPageAndOpen(String policyNumberSearchData) {
		String verifySearchedPolicy = null;
		try {
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, hubNavigation);
			hubNavigation.click();
			log.info("Clicked on Hub Navigation Image");
			//Thread.sleep(2000);
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, searchPolicyInputBox);
			searchPolicyInputBox.click();
			//Thread.sleep(500);

			searchPolicyInputBox.clear();
			//Thread.sleep(500);

			searchPolicyInputBox.sendKeys(policyNumberSearchData);
			log.info("Enter Policy Number : "+policyNumberSearchData);
			
			Thread.sleep(4000);
			eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_LONG_TIME_OUT, 2, searchedPolicyData);
			verifySearchedPolicy = searchedPolicyData.getText();
			Thread.sleep(1000);
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_LONG_TIME_OUT, searchedPolicyData);
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_LONG_TIME_OUT, searchedPolicyData);
			searchedPolicyData.click();
			log.info("Clicked on Searched Policy");
			//Thread.sleep(4000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicyNavigationImage.click();
			log.info("Clicked on Policy Navigation Image");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.searchPolicyFromPolicyPageAndOpen " + e);
		}
		return verifySearchedPolicy;
	}

	public void addClassWithoutSearchedPolicyData(WebElement ele) {
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(PolicyNavigationImage);
			log.info("Clicked on Plicy Navigation");
			Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(editPolicy);
			Thread.sleep(1000);
			eleUtil.waitForElementVisibleAndToBeClickable(editPolicy, AppConstants.DEFAULT_SHORT_TIME_OUT);
			jsUtil.clickElementByJS(editPolicy);
			log.info("Clicked on Edit Policy");

			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(PolicyNavigationImage);
			
			eleUtil.waitForElementVisibleAndToBeClickable(classField, AppConstants.DEFAULT_SHORT_TIME_OUT);
			jsUtil.clickElementByJS(classField);
			log.info("Clicked on Class Grid");

			ele.click();
			log.info("Select Class");
			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(4000);

			jsUtil.scrollIntoViewTrue(savePolicy);
			Thread.sleep(1000);
			log.info("Scroll to - Save Button");
			
			eleUtil.waitForElementVisibleAndToBeClickable(savePolicy, AppConstants.DEFAULT_SHORT_TIME_OUT);
			jsUtil.clickElementByJS(savePolicy);
			log.info("Clicked on Save Policy");
			Thread.sleep(4000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_SHORT_TIME_OUT);
			jsUtil.clickElementByJS(PolicyNavigationImage);
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.addClass " + e);
		}
	}

	public String searchPolicyAndOpen(String policyNumberSearchData) {
		String verifySearchedPolicy = null;
		try {
			verifySearchedPolicy = seachPolicyAfterLogin(policyNumberSearchData);
			searchedPolicyData.click();
			log.info("Clicked on Searched Policy Data");

			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicyNavigationImage.click();
			log.info("Clicked on Policy Navigation");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.searchPolicyAndOpen " + e);
		}
		return verifySearchedPolicy;
	}

	public String searchReportAndOpen(String reportSearchData) {
		String verifySearchedReport = null;
		try {
			verifySearchedReport = seachReportAfterLogin(reportSearchData);
			eleUtil.waitForElementVisibleAndToBeClickable(searchedReportData, AppConstants.DEFAULT_LONG_TIME_OUT);
			searchedReportData.click();
			log.info("Clicked on Searched Report Data");			
			Thread.sleep(4000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			PolicyNavigationImage.click();
			log.info("Clicked on Policy Navigation");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.searchReportAndOpen " + e);
		}
		return verifySearchedReport;
	}

	public void addClassWithSearchedPolicyData(String policyNumberSearchData, WebElement eleClassName) {
		try {
			searchPolicyAndOpen(policyNumberSearchData);
			addClassWithoutSearchedPolicyData(eleClassName);

		} catch (Exception e) {
			System.out.println("Issue in Common.addClass " + e);
		}
	}

	public Boolean deleteLimit() {
		Boolean verifyDeletedLimit = false;
		try {
			TermsNavigationImage.click();
			Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(Edit_TermsButton);
			// Thread.sleep(1000);
			eleUtil.waitForElementVisibleAndToBeClickable(Edit_TermsButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			Edit_TermsButton.click();
			Thread.sleep(1000);
			log.info("Clicked on Edit Terms");

			int sizeBefore = limitSize.size();

			jsUtil.scrollIntoViewTrue(deleteLimit5);
			// Thread.sleep(1000);
			eleUtil.waitForElementVisibleAndToBeClickable(deleteLimit5, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			deleteLimit5.click();
			log.info("Clicked on Delete Limit");
			// Thread.sleep(1000);
			eleUtil.waitForElementVisibleAndToBeClickable(deleteLimitConfirmationYes,
					AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			deleteLimitConfirmationYes.click();
			log.info("Clicked on Delete Confirmation - Yes");
			Thread.sleep(3000);

			int sizeAfter = limitSize.size();
			if (sizeAfter == sizeBefore - 1) {
				verifyDeletedLimit = true;
			}

			saveTerms.click();
			// Thread.sleep(3000);

			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			TermsNavigationImage.click();
			log.info("Clicked on Terms Navigation");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.deleteLimit " + e);
		}
		return verifyDeletedLimit;
	}

	public Boolean deleteLimitGroup() {
		Boolean verifyDeletedLimitGroup = false;
		try {
			TermsNavigationImage.click();
			// Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(Edit_TermsButton);
			eleUtil.waitForElementVisibleAndToBeClickable(Edit_TermsButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			// Thread.sleep(1000);
			Edit_TermsButton.click();
			Thread.sleep(1000);

			int sizeBefore = limitSize.size();

			jsUtil.scrollIntoViewTrue(deleteLimitGroup3);
			eleUtil.waitForElementVisibleAndToBeClickable(deleteLimitGroup3, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			deleteLimitGroup3.click();
			// Thread.sleep(1000);
			eleUtil.waitForElementVisibleAndToBeClickable(deleteLimitConfirmationYes,
					AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			deleteLimitConfirmationYes.click();
			Thread.sleep(3000);

			int sizeAfter = limitSize.size();
			if (sizeAfter < sizeBefore) {
				verifyDeletedLimitGroup = true;
			}

			saveTerms.click();
			// Thread.sleep(3000);

			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			TermsNavigationImage.click();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("Issue in Common.deleteLimitGroup " + e);
		}
		return verifyDeletedLimitGroup;
	}

	public void deletePolicyFromPolicyPage(String policyNumberSearchData) {
		// Boolean verifyDeletedPolicyStatus=false;
		try {
			searchPolicyFromPolicyPage(policyNumberSearchData);
			Thread.sleep(5000);

			eleUtil.waitForElementVisibleAndToBeClickable(rowActionSearchedPolicy,
					AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			
			jsUtil.clickElementByJS(rowActionSearchedPolicy);
			log.info("Clicked on Row Action Button");
			Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(rowActionDeleteButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(rowActionDeleteButton);
			log.info("Clicked on Delete Button");
			Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(deleteLimitConfirmationYes,
					AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			deleteLimitConfirmationYes.click();
			log.info("Delete Confirmation - Yes");
			Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			hubNavigation.click();
			log.info("Clicked on Hub Navigation");

			eleUtil.waitForElementVisibleAndToBeClickable(refreshPolicy, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			refreshPolicy.click();
			log.info("Clicked on Refresh Button - Policy");

			eleUtil.waitForElementVisibleAndToBeClickable(searchPolicyInputBox, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			searchPolicyInputBox.click();
			log.info("Clicked on Search Policy");

			eleUtil.waitForElementVisibleAndToBeClickable(searchPolicyInputBox, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			searchPolicyInputBox.clear();

			searchPolicyInputBox.sendKeys(policyNumberSearchData);
			log.info("Eneter Deleted Policy Number : "+policyNumberSearchData);
			Thread.sleep(4000);

			// String actual=verifyDeletedPolicy.getText();

		} catch (Exception e) {
			System.out.println("Issue in Common.deletePolicyFromPolicyPage " + e);
		}
	}

	public String deleteScheduleGeneric(String classNameXpath, int deletionTime, String verifiedDeletedMessage) {
		String verifyDeleteSchedule = null;
		try {
			WebElement scheduleNavigationImage = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			eleUtil.waitForElementVisibleAndToBeClickable(scheduleNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			scheduleNavigationImage.click();
			log.info("Clicked on Schedule Navigation");
			Thread.sleep(1000);
			
			WebElement pagerRowSize=driver.findElement(By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='"+classNameXpath+"']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/app-paginator/div[@class='pager-submodules']/p"));
			eleUtil.waitForElementVisible(pagerRowSize, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.scrollIntoViewTrue(pagerRowSize);
			eleUtil.waitForElementVisible(pagerRowSize, AppConstants.DEFAULT_LONG_TIME_OUT);
			String rowSize1[]=pagerRowSize.getText().split("/");
			
			String rowSizeBeforeString=rowSize1[1].trim();
			String rowSizeB=rowSizeBeforeString.replace(")", "");			

			// editSchedule.click();
			WebElement editSchedule = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']"));
			jsUtil.scrollIntoViewTrue(editSchedule);
			Thread.sleep(1000);
			eleUtil.waitForElementVisibleAndToBeClickable(editSchedule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			editSchedule.click();
			log.info("Clicked on Edit Schedule");
			Thread.sleep(1000);

			WebElement scheduleNavigationImage33 = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			scheduleNavigationImage33.click();
			Thread.sleep(3000);

//			List<WebElement> rowSizeSchedule = driver.findElements(
//					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
//							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div"));
//			Thread.sleep(1000);
//			int rowSizeBeforeDelete = rowSizeSchedule.size();
//			log.info("Getting row size");
//			Thread.sleep(1000);

			for (int i = 1; i <= deletionTime; i++) {
				
				eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
				WebElement rowActionGeneric = driver.findElement(
						By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
								+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div[@row-id='0']/div[@col-id='actions']/app-row-actions/button"));

				eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_LONG_TIME_OUT, 2, rowActionGeneric);
				eleUtil.waitForElementVisibleAndToBeClickable(rowActionGeneric, AppConstants.DEFAULT_LONG_TIME_OUT);
				
				jsUtil.clickElementByJS(rowActionGeneric);
				log.info("Clicked on Row Action");

				eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_LONG_TIME_OUT, 2,
						rowActionDeleteButton);
				eleUtil.waitForElementVisibleAndToBeClickable(rowActionDeleteButton,
						AppConstants.DEFAULT_LONG_TIME_OUT);
				rowActionDeleteButton.click();
				log.info("Clicked on Option Delete");
				Thread.sleep(1000);

				eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_LONG_TIME_OUT, 2,
						deleteLimitConfirmationYes);
				eleUtil.waitForElementVisibleAndToBeClickable(deleteLimitConfirmationYes,
						AppConstants.DEFAULT_LONG_TIME_OUT);
				deleteLimitConfirmationYes.click();
				log.info("Clicked on Confirmation - Yes");
				Thread.sleep(5000);
			}
//			List<WebElement> rowSizeScheduleAfter = driver.findElements(
//					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
//							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div"));
//			Thread.sleep(1000);
//			int rowSizeAfterDelete = rowSizeScheduleAfter.size();
//			log.info("Clicked on Row Size");
//			Thread.sleep(1000);
			
			WebElement pagerRowSizeAfter=driver.findElement(By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='"+classNameXpath+"']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/app-paginator/div[@class='pager-submodules']/p"));
			eleUtil.waitForElementVisible(pagerRowSizeAfter, AppConstants.DEFAULT_LONG_TIME_OUT);
			eleUtil.waitForElementVisible(pagerRowSizeAfter, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.scrollIntoViewTrue(pagerRowSizeAfter);
			eleUtil.waitForElementVisible(pagerRowSizeAfter, AppConstants.DEFAULT_LONG_TIME_OUT);
			String rowSize12[]=pagerRowSizeAfter.getText().split("/");

			String rowSizeAfterString=rowSize12[1].trim();
			String rowSizeA=rowSizeAfterString.replace(")", "");	
				
			Thread.sleep(1000);
			
			if (!rowSizeA.equals(rowSizeB)) {
				Thread.sleep(1000);
				verifyDeleteSchedule = verifiedDeletedMessage;
				Thread.sleep(1000);
			}
			eleUtil.waitForElementVisibleAndToBeClickable(saveScheduleCyber, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.scrollIntoViewTrue(saveScheduleCyber);
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, saveScheduleCyber);
			saveScheduleCyber.click();
			log.info("Clicked on Save Schedule");
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println("Issue in Common.deleteScheduleGeneric " + e);
		}
		return verifyDeleteSchedule;
	}

	public String addNewPerilAfterLogin(String searchPolicyData, String perilName,
			String perilsAddedValidationMessages) {
		String perilsAddedValidationMessage = null;
		try {
			searchPolicyAndOpen(searchPolicyData);

			jsUtil.scrollIntoViewTrue(editPolicy);
			Thread.sleep(1000);

			editPolicy.click();
			Thread.sleep(1000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeBefore = perilsSizeOfSelectedData.size();

			PerilsField.click();
			Thread.sleep(1000);

			WebElement perilNameOption = driver.findElement(
					By.xpath("//div[@role='listbox']/mat-option/span[text()='" + " " + perilName + " " + "']"));
			Thread.sleep(500);
			perilNameOption.click();
			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(5000);

			savePolicy.click();
			Thread.sleep(5000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeAfter = perilsSizeOfSelectedData.size();
			if (sizeAfter > sizeBefore) {
				perilsAddedValidationMessage = perilsAddedValidationMessages;
			}

		} catch (Exception e) {
			System.out.println("Issue in Common.addNewPerilAfterLogin " + e);
		}
		return perilsAddedValidationMessage;
	}

	public String addNewPerilFromOpenedPolicy(String perilName, String perilsAddedValidationMessages) {
		String perilsAddedValidationMessage = null;
		try {
			// searchPolicyAndOpen(searchPolicyData);
			PolicyNavigationImage.click();
			Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(editPolicy);
			Thread.sleep(1000);

			editPolicy.click();
			Thread.sleep(1000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeBefore = perilsSizeOfSelectedData.size();

			PerilsField.click();
			Thread.sleep(1000);

			WebElement perilNameOption = driver.findElement(
					By.xpath("//div[@role='listbox']/mat-option/span[text()='" + " " + perilName + " " + "']"));
			Thread.sleep(500);
			perilNameOption.click();
			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(5000);

			jsUtil.scrollIntoViewTrue(savePolicy);
			Thread.sleep(1000);

			savePolicy.click();
			Thread.sleep(5000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeAfter = perilsSizeOfSelectedData.size();
			if (sizeAfter > sizeBefore) {
				perilsAddedValidationMessage = perilsAddedValidationMessages;
			}

		} catch (Exception e) {
			System.out.println("Issue in Common.addNewPerilFromOpenedPolicy " + e);
		}
		return perilsAddedValidationMessage;
	}

	public String removePerilFromOpenedPolicy(String perilName, String perilsAddedValidationMessages) {
		String perilsAddedValidationMessage = null;
		try {
			// searchPolicyAndOpen(searchPolicyData);
			PolicyNavigationImage.click();
			Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(editPolicy);
			Thread.sleep(1000);

			editPolicy.click();
			Thread.sleep(1000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeBefore = perilsSizeOfSelectedData.size();

			PerilsField.click();
			Thread.sleep(1000);

			WebElement perilNameOption = driver.findElement(
					By.xpath("//div[@role='listbox']/mat-option/span[text()='" + " " + perilName + " " + "']"));
			Thread.sleep(500);
			perilNameOption.click();
			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(5000);

			jsUtil.scrollIntoViewTrue(savePolicy);
			Thread.sleep(1000);

			savePolicy.click();
			Thread.sleep(5000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeAfter = perilsSizeOfSelectedData.size();
			if (sizeAfter < sizeBefore) {
				perilsAddedValidationMessage = perilsAddedValidationMessages;
			}

		} catch (Exception e) {
			System.out.println("Issue in Common.removePerilFromOpenedPolicy " + e);
		}
		return perilsAddedValidationMessage;
	}

	public String removePerilAfterLogin(String searchPolicyData, String perilName,
			String perilsAddedValidationMessages) {
		String perilsAddedValidationMessage = null;
		try {
			searchPolicyAndOpen(searchPolicyData);
			PolicyNavigationImage.click();
			Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(editPolicy);
			Thread.sleep(1000);

			editPolicy.click();
			Thread.sleep(1000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeBefore = perilsSizeOfSelectedData.size();

			PerilsField.click();
			Thread.sleep(1000);

			WebElement perilNameOption = driver.findElement(
					By.xpath("//div[@role='listbox']/mat-option/span[text()='" + " " + perilName + " " + "']"));
			Thread.sleep(500);
			perilNameOption.click();
			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(5000);

			jsUtil.scrollIntoViewTrue(savePolicy);
			Thread.sleep(1000);

			savePolicy.click();
			Thread.sleep(5000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeAfter = perilsSizeOfSelectedData.size();
			if (sizeAfter < sizeBefore) {
				perilsAddedValidationMessage = perilsAddedValidationMessages;
			}

		} catch (Exception e) {
			System.out.println("Issue in Common.removePerilAfterLogin " + e);
		}
		return perilsAddedValidationMessage;
	}

	public String addNewCoverageFromOpenedPolicy(String coverageName, String coverageAddedValidationMessages) {
		String coverageAddedValidationMessage = null;
		try {
			// searchPolicyAndOpen(searchPolicyData);
			PolicyNavigationImage.click();
			Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(editPolicy);
			Thread.sleep(1000);

			editPolicy.click();
			Thread.sleep(1000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeBefore = coverageSizeOfSelectedData.size();

			jsUtil.scrollIntoViewTrue(coveragesField);
			coveragesField.click();
			Thread.sleep(1000);

			WebElement coverageNameOption = driver.findElement(
					By.xpath("//div[@role='listbox']/mat-option/span[text()='" + " " + coverageName + " " + "']"));
			Thread.sleep(500);
			jsUtil.scrollIntoViewTrue(coverageNameOption);
			coverageNameOption.click();
			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(5000);

			jsUtil.scrollIntoViewTrue(savePolicy);
			Thread.sleep(1000);

			savePolicy.click();
			Thread.sleep(5000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeAfter = coverageSizeOfSelectedData.size();
			if (sizeAfter > sizeBefore) {
				coverageAddedValidationMessage = coverageAddedValidationMessages;
			}

		} catch (Exception e) {
			System.out.println("Issue in Common.addNewCoverageFromOpenedPolicy " + e);
		}
		return coverageAddedValidationMessage;
	}

	public String addNewCoverageAfterLogin(String searchPolicyData, String coverageName,
			String coverageAddedValidationMessages) {
		String coverageAddedValidationMessage = null;
		try {
			searchPolicyAndOpen(searchPolicyData);
			PolicyNavigationImage.click();
			Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(editPolicy);
			Thread.sleep(1000);

			editPolicy.click();
			Thread.sleep(1000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeBefore = coverageSizeOfSelectedData.size();

			jsUtil.scrollIntoViewTrue(coveragesField);
			coveragesField.click();
			Thread.sleep(1000);

			WebElement coverageNameOption = driver.findElement(
					By.xpath("//div[@role='listbox']/mat-option/span[text()='" + " " + coverageName + " " + "']"));
			Thread.sleep(500);
			jsUtil.scrollIntoViewTrue(coverageNameOption);
			coverageNameOption.click();
			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(5000);

			jsUtil.scrollIntoViewTrue(savePolicy);
			Thread.sleep(1000);

			savePolicy.click();
			Thread.sleep(5000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeAfter = coverageSizeOfSelectedData.size();
			if (sizeAfter > sizeBefore) {
				coverageAddedValidationMessage = coverageAddedValidationMessages;
			}

		} catch (Exception e) {
			System.out.println("Issue in Common.addNewCoverageAfterLogin " + e);
		}
		return coverageAddedValidationMessage;
	}

	public String removeCoverageFromOpenedPolicy(String coverageName, String coverageRemoveValidationMessages) {
		String coverageRemoveValidationMessageVerify = null;
		try {
			// searchPolicyAndOpen(searchPolicyData);
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			PolicyNavigationImage.click();
			Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(editPolicy);
			Thread.sleep(1000);

			editPolicy.click();
			Thread.sleep(1000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeBefore = coverageSizeOfSelectedData.size();

			jsUtil.scrollIntoViewTrue(coveragesField);
			coveragesField.click();
			Thread.sleep(1000);

			WebElement coverageNameOption = driver.findElement(
					By.xpath("//div[@role='listbox']/mat-option/span[text()='" + " " + coverageName + " " + "']"));
			Thread.sleep(500);

			jsUtil.scrollIntoViewTrue(coverageNameOption);
			Thread.sleep(1000);
			jsUtil.clickElementByJS(coverageNameOption);

			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(5000);

			jsUtil.scrollIntoViewTrue(savePolicy);
			Thread.sleep(1000);

			savePolicy.click();
			Thread.sleep(5000);

			PolicyNavigationImage.click();
			Thread.sleep(1000);

			int sizeAfter = coverageSizeOfSelectedData.size();
			if (sizeAfter < sizeBefore) {
				coverageRemoveValidationMessageVerify = coverageRemoveValidationMessages;
			}

		} catch (Exception e) {
			System.out.println("Issue in Common.removeCoverageFromOpenedPolicy " + e);
		}
		return coverageRemoveValidationMessageVerify;
	}

	public String removeCoverageAfterLogin(String searchPolicyData, String coverageName,
			String coverageRemoveValidationMessages) {
		String coverageRemoveValidationMessageVerify = null;
		try {
			searchPolicyAndOpen(searchPolicyData);
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			PolicyNavigationImage.click();
			log.info("Clicked on Policy Navigation");
			Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(editPolicy);
			log.info("Scroll to - Edit Policy");
			Thread.sleep(1000);

			jsUtil.clickElementByJS(editPolicy);
			log.info("Clicked on Edit Policy");
			Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(SelectEntity, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(PolicyNavigationImage);
			Thread.sleep(1000);

			int sizeBefore = coverageSizeOfSelectedData.size();

			eleUtil.waitForElementVisibleAndToBeClickable(coveragesField, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(coveragesField);
			log.info("Clicked on Coverage Grid");
			Thread.sleep(2000);

			WebElement coverageNameOption = driver.findElement(
					By.xpath("//div[@role='listbox']/mat-option/span[text()='" + " " + coverageName + " " + "']"));
			Thread.sleep(500);

			jsUtil.scrollIntoViewTrue(coverageNameOption);
			log.info("Scroll to - "+coverageName);
			Thread.sleep(1000);
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, coverageNameOption);
			jsUtil.clickElementByJS(coverageNameOption);
			log.info("Clicked on "+coverageName);

			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(5000);

			jsUtil.scrollIntoViewTrue(savePolicy);
			log.info("Scroll to - Save Button");
			Thread.sleep(1000);

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, savePolicy);
			jsUtil.clickElementByJS(savePolicy);
			log.info("Clicked on Save");

			eleUtil.waitForElementVisibleAndToBeClickable(PolicyNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(PolicyNavigationImage);
			Thread.sleep(1000);

			int sizeAfter = coverageSizeOfSelectedData.size();
			if (sizeAfter < sizeBefore) {
				coverageRemoveValidationMessageVerify = coverageRemoveValidationMessages;
			}

		} catch (Exception e) {
			System.out.println("Issue in Common.removeCoverageAfterLogin " + e);
		}
		return coverageRemoveValidationMessageVerify;
	}

	public String copyLimitGroup(String previousGroupName, String copyLimitGroupvalidationMessage) {
		String copyLimitGroupvalidationMessageVerify = null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			TermsNavigationImage.click();
			Thread.sleep(1000);
			log.info("Clicked on Terms Navigation");

			eleUtil.waitForElementVisibleAndToBeClickable(Edit_TermsButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(Edit_TermsButton);
			log.info("Clicked on Edit Terms");
			Thread.sleep(1000);

			int sizeBefore = rowSize.size();

			WebElement copyGroupName = driver.findElement(By.xpath("//div[@col-id='LimitGroupDescription' and text()='"
					+ previousGroupName
					+ "']/parent::div/div[@col-id='params']/div/span/app-terms-grid-child-icon/span/span[text()='content_copy']"));
			Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(copyGroupName, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(copyGroupName);
			log.info("Clicked on Copy Group Name");
			Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(confirmationYes, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			confirmationYes.click();
			log.info("Clicked on Confirmation - Yes");
			Thread.sleep(1000);

			int sizeAfter = rowSize.size();
			if (sizeAfter > sizeBefore) {
				copyLimitGroupvalidationMessageVerify = copyLimitGroupvalidationMessage;
			}

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, saveTerms);
			jsUtil.scrollIntoViewTrue(saveTerms);
			eleUtil.waitForElementVisibleAndToBeClickable(saveTerms, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			saveTerms.click();
			log.info("Clicked on Save Terms");
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println("Issue in Common.copyLimitGroup " + e);
		}
		return copyLimitGroupvalidationMessageVerify;
	}

	public String copyLimit(String copyLimitvalidationMessage) {
		String copyLimitvalidationMessageVerify = null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			TermsNavigationImage.click();
			log.info("Clicked on Terms Navigation");
			Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(Edit_TermsButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(Edit_TermsButton);
			log.info("Clicked on Edit Terms");
			Thread.sleep(1000);

			int sizeBefore = rowSize.size();
			Thread.sleep(1000);

			WebElement copyLimit = driver
					.findElement(By.xpath("(//span[@class='material-icons'][contains(.,'content_copy')])[last()]"));
			Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(copyLimit, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(copyLimit);
			log.info("Clicked on Copy Limit");
			Thread.sleep(5000);

			// confirmationYes.click();
			Thread.sleep(1000);
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, saveTerms);
			int sizeAfter = rowSize.size();
			if (sizeAfter > sizeBefore) {
				copyLimitvalidationMessageVerify = copyLimitvalidationMessage;
			}

			jsUtil.scrollIntoViewTrue(saveTerms);
			Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(saveTerms, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(saveTerms);
			log.info("Clicked on Save Terms");
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println("Issue in Common.copyLimit " + e);
		}
		return copyLimitvalidationMessageVerify;
	}

	public String deleteCopyLimitGroup(String groupName, String deleteCopyLimitGroupvalidationMessage) {
		String deleteCopyLimitGroupvalidationMessageVerify = null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(TermsNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			TermsNavigationImage.click();
			log.info("Clicked on Terms Navigation");
			Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(Edit_TermsButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			Edit_TermsButton.click();
			log.info("Clicked on Edit Terms");
			Thread.sleep(1000);

			int sizeBefore = rowSize.size();

			WebElement copyGroupName = driver.findElement(By.xpath("//div[@col-id='LimitGroupDescription' and text()='"
					+ groupName
					+ "']/parent::div/div[@col-id='params']/div/span/app-terms-grid-child-icon/span/span[text()='delete']"));
			Thread.sleep(1000);
			copyGroupName.click();
			log.info("Clicked on Delete Group Name");
			Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(confirmationYes, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			confirmationYes.click();
			log.info("Clicked on Confirmation - Yes");
			Thread.sleep(1000);

			int sizeAfter = rowSize.size();
			if (sizeAfter < sizeBefore) {
				deleteCopyLimitGroupvalidationMessageVerify = deleteCopyLimitGroupvalidationMessage;
			}

			eleUtil.waitForElementVisibleAndToBeClickable(saveTerms, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			saveTerms.click();
			log.info("Clicked on Save Terms");
			Thread.sleep(1000);

			eleUtil.waitForElementVisible(copyGroupName, 10);

		} catch (Exception e) {
			System.out.println("Issue in Common.deleteCopyLimitGroup " + e);
		}
		return deleteCopyLimitGroupvalidationMessageVerify;
	}

	public void editSchedule(String classNameXpath, String selectOptionData, String inputData) {
		//String updatedStatus= null;
		try {
			WebElement scheduleNavigationImage = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			scheduleNavigationImage.click();
			Thread.sleep(1000);

			log.info("Clicked on Schedule Navigation");
			Thread.sleep(5000);

			WebElement editSchedule = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']"));

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, editSchedule);
			editSchedule.click();
			log.info("Clicked on Edit Schedule");
			Thread.sleep(1000);

			WebElement rowAction = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div[@row-id='0']/div[@col-id='actions']/app-row-actions/button"));
			Thread.sleep(1000);
			rowAction.click();
			log.info("Clicked on Row Action");
			Thread.sleep(1000);

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, rowActionEditButton);
			rowActionEditButton.click();
			log.info("Clicked on Row Action - Edit");
			Thread.sleep(3000);

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, editScheduleEditPopup);
			editScheduleEditPopup.click();
			Thread.sleep(1000);

			WebElement selectData = driver.findElement(
					By.xpath("//div[@role='listbox']/mat-option/span[text()='" + " " + selectOptionData + " " + "']"));
			jsUtil.scrollIntoViewTrue(selectData);
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, selectData);
			jsUtil.clickElementByJS(selectData);
			log.info("Select Option Data : " + selectOptionData);
			Thread.sleep(1000);

			editScheduleEditPopupInputBox.clear();
			editScheduleEditPopupInputBox.sendKeys(inputData);
			log.info("Option Input Data : " + inputData);

			eleUtil.waitForElementVisibleAndToBeClickable(PreviewButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PreviewButton.click();
			log.info("Clicked on Preview");

			eleUtil.waitForElementVisibleAndToBeClickable(saveButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			saveButton.click();
			log.info("Clicked on Save");

			eleUtil.waitForElementVisibleAndToBeClickable(cancelButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			cancelButton.click();
			log.info("Clicked on Cancel");
			
			eleUtil.waitForElementVisibleAndToBeClickable(saveTerms, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			saveTerms.click();
			log.info("Clicked on Save Terms");
			Thread.sleep(1000);

			WebElement scheduleNavigationImage2 = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			scheduleNavigationImage2.click();
			Thread.sleep(1000);
			
//			if(selectOptionData.equalsIgnoreCase("Assured Interest")) {
//				WebElement updatedValueofSchedule1Row=driver.findElement(By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath + "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='centerContainer']/div/div/div[1]/div[@col-id='[Sch].AssuredInterest']"));
//				
//				eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_MEDIUM_TIME_OUT, 3, updatedValueofSchedule1Row);
//				String actualUpdatedValue=updatedValueofSchedule1Row.getText();	
//				Thread.sleep(1000);
//				System.out.println("========================================================="+actualUpdatedValue);
//				
//				if(actualUpdatedValue.equalsIgnoreCase(inputData+"%")) {
//					updatedStatus="Schedule updated successfully";					
//				}
//			}else {
//				updatedStatus="Schedule updated successfully";
//			}

		} catch (Exception e) {
			System.out.println("Issue in Common.editSchedule " + e);
		}
		//return updatedStatus;
	}

	public void editScheduleSelectAll(String classNameXpath, String selectOptionData, String inputData) {
		try {
			WebElement scheduleNavigationImage = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			scheduleNavigationImage.click();
			Thread.sleep(1000);

			log.info("Clicked on Class Navigation");
			Thread.sleep(5000);

			WebElement editSchedule = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']"));
			jsUtil.scrollIntoViewTrue(editSchedule);
			Thread.sleep(1000);
			editSchedule.click();
			log.info("Clicked on Edit Schedule");
			Thread.sleep(1000);

			WebElement scheduleNavigationImage222 = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			scheduleNavigationImage222.click();
			Thread.sleep(1000);

			WebElement selectAllCheckBox = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='gridHeader']/div[@class='ag-pinned-left-header']/div/div[@col-id='row_selection']/div[@class='ag-labeled ag-label-align-right ag-checkbox ag-input-field ag-header-select-all']/div[@ref='eWrapper']"));
			selectAllCheckBox.click();
			Thread.sleep(1000);
			log.info("Clicked on - Select All Check Box");

			WebElement rowAction = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div[@row-id='0']/div[@col-id='actions']/app-row-actions/button"));
			Thread.sleep(1000);
			rowAction.click();
			Thread.sleep(1000);

			rowActionEditButton.click();
			Thread.sleep(3000);

			editScheduleEditPopup.click();
			Thread.sleep(1000);

			WebElement selectData = driver.findElement(
					By.xpath("//div[@role='listbox']/mat-option/span[text()='" + " " + selectOptionData + " " + "']"));
			jsUtil.scrollIntoViewTrue(selectData);
			jsUtil.clickElementByJS(selectData);
			Thread.sleep(1000);

			editScheduleEditPopupInputBox.clear();
			editScheduleEditPopupInputBox.sendKeys(inputData);
			Thread.sleep(1000);

			PreviewButton.click();
			Thread.sleep(1000);

			saveButton.click();
			Thread.sleep(1000);

			cancelButton.click();
			Thread.sleep(5000);

			jsUtil.scrollIntoViewTrue(saveTerms);
			Thread.sleep(1000);
			saveTerms.click();
			Thread.sleep(1000);

			WebElement scheduleNavigationImage2 = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			scheduleNavigationImage2.click();
			Thread.sleep(1000);

			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println("Issue in Common.editScheduleSelectAll " + e);
		}
	}

	public void updatePolicyOptionData(String policyNumberData, String selectOptionData, String inputData) {
		try {
			searchPolicyFromPolicyPage(policyNumberData);

			rowActionButtonPolicyHub.click();
			log.info("Clicked on Row Action Button - Policy Hub");
			Thread.sleep(1000);

			rowActionEditButton.click();
			log.info("Clicked on Action - Edit");
			Thread.sleep(1000);

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, editScheduleEditPopup);
			editScheduleEditPopup.click();
			Thread.sleep(1000);

			WebElement selectData = driver.findElement(
					By.xpath("//div[@role='listbox']/mat-option/span[text()='" + " " + selectOptionData + " " + "']"));
			jsUtil.scrollIntoViewTrue(selectData);

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, selectData);
			jsUtil.clickElementByJS(selectData);
			log.info("Select Option Data : " + selectOptionData);
			Thread.sleep(1000);

			editScheduleEditPopupInputBox.clear();
			editScheduleEditPopupInputBox.sendKeys(inputData);
			log.info("Enter Option Input Data : " + inputData);

			eleUtil.waitForElementVisibleAndToBeClickable(PreviewButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PreviewButton.click();
			log.info("Clicked on Preview");

			eleUtil.waitForElementVisibleAndToBeClickable(saveButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			saveButton.click();
			log.info("Clicked on Save");

			eleUtil.waitForElementVisibleAndToBeClickable(cancelButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			cancelButton.click();
			log.info("Clicked on Cancel");

			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			hubNavigation.click();
			log.info("Clicked on Hub Navigation");
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("Issue in Common.updatePolicyOptionData " + e);
		}
	}

	public void quickNavigation() {
		try {

		} catch (Exception e) {
			System.out.println("Issue in Common.quickNavigation " + e);
		}
	}

	public String importSchedule(String classNameXpath, String verifiedAddedScheduleMessage, String importFilePath,
			String geocoingStatusYesOrNo, String geocodingClikableYesorNo) {
		String importScheduleVerify=null;
		try {
			WebElement scheduleNavigationImage = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			eleUtil.waitForElementVisibleAndToBeClickable(scheduleNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			scheduleNavigationImage.click();
			Thread.sleep(1000);

			log.info("Clicked on Class Navigation");
			Thread.sleep(5000);

			WebElement editSchedule = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']"));
			jsUtil.scrollIntoViewTrue(editSchedule);
			Thread.sleep(1000);

			editSchedule.click();
			log.info("Clicked on Edit Schedule");
			Thread.sleep(1000);

			WebElement scheduleNavigationImage33 = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			
			scheduleNavigationImage33.click();
			Thread.sleep(1000);

			eleUtil.waitForElementVisible(addSingleScheduleButton, 5);

			jsUtil.clickElementByJS(importScheduleButton);
			Thread.sleep(5000);
			log.info("Clicked on Import Button");

			chooseFile.sendKeys(System.getProperty("user.dir") + importFilePath);
			log.info("File Uploaded : "+importFilePath);
			Thread.sleep(3000);

			// geocoding ON
			if (geocodingClikableYesorNo.toLowerCase().trim().equals("yes")) {

				eleUtil.waitForElementVisibleAndToBeClickable(ClickOnGeocoding, AppConstants.DEFAULT_LONG_TIME_OUT);
			
				jsUtil.clickElementByJS(ClickOnGeocoding);
				log.info("Clicked on Geocoding");
				Thread.sleep(5000);

				if (geocoingStatusYesOrNo.toLowerCase().trim().equals("yes")) {
					WebElement SelectGeocodingYes = driver
							.findElement(By.xpath("//span[@class='mat-option-text'][contains(.,'Yes')]"));
					eleUtil.waitForElementVisibleAndToBeClickable(SelectGeocodingYes,
							AppConstants.DEFAULT_MEDIUM_TIME_OUT);
					jsUtil.clickElementByJS(SelectGeocodingYes);
					log.info("Select Geocoding - Yes");
				} else {
					WebElement SelectGeocodingNo = driver
							.findElement(By.xpath("//span[@class='mat-option-text'][contains(.,'No')]"));
					SelectGeocodingNo.click();
					log.info("Select Geocoding - No");
				}
			}
			Thread.sleep(5000);

			WebElement Continue = driver
					.findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(.,'play_arrow Continue')]"));
			eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_MEDIUM_TIME_OUT, 2, Continue);
			eleUtil.waitForElementVisibleAndToBeClickable(Continue, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			Continue.click();
			log.info("Clicked on Continue");
			Thread.sleep(10000);

			WebElement ImportButton2 = driver
					.findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(.,'play_arrow Import')]"));
			ImportButton2.click();
			log.info("Clicked on Import");

			Thread.sleep(5000);
			int after=0;
			int before=0;
			
			do {
				eleUtil.waitForElementVisibleAndToBeClickable(refreshButtonOnlyOnePlaceUse, AppConstants.DEFAULT_VERY_LONG_TIME_OUT);
				
				jsUtil.clickElementByJS(refreshButtonOnlyOnePlaceUse);
				log.info("Clicked on Refresh");
				Thread.sleep(10000);
				
				eleUtil.waitForElementVisible(precessedCount, AppConstants.DEFAULT_VERY_LONG_TIME_OUT);
				String textName=precessedCount.getText().trim().substring(21);
				
				String textNameIndexWise[]=textName.trim().split("/");				
				String textNameIndexZero=textNameIndexWise[0].trim();
				
				String finalIndexOne=textNameIndexWise[1].trim();
				after=Integer.parseInt(finalIndexOne);
				
				int a2=textNameIndexZero.length();	
				String finalIndexZero=textNameIndexZero.substring(10, a2);
				before=Integer.parseInt(finalIndexZero);
				
			} while (after>before);
			
			WebElement ClickOnFinish = driver.findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(.,'done Finish')]"));
			eleUtil.waitForElementVisibleAndToBeClickable(ClickOnFinish, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(ClickOnFinish);
			log.info("Clicked on Finish");
			Thread.sleep(5000);

			WebElement ConfirmationPopupYes = driver
					.findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(.,'Yes')]"));
			
			eleUtil.waitForElementVisibleAndToBeClickable(ConfirmationPopupYes, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			ConfirmationPopupYes.click();
			log.info("Clicked on Confirmation - Yes");
			//Thread.sleep(10000);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			WebElement scheduleNavigationImage2 = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			eleUtil.waitForElementVisibleAndToBeClickable(scheduleNavigationImage2, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(scheduleNavigationImage2);
			log.info("Clicked on Schedule Navigation");
			Thread.sleep(3000);
			
			List<WebElement> rowSize=driver.findElements(By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='"+classNameXpath+"']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div"));
			Thread.sleep(1000);
			int rowSizeAfter=rowSize.size();
			if(rowSizeAfter>0) {
				importScheduleVerify=verifiedAddedScheduleMessage;
			}
			
		} catch (Exception e) {
			System.out.println("Issue in Common.importSchedule " + e);
		}
		return importScheduleVerify;
	}

	public void openSchedule(String classNameXpath, String countryNameData) {
		try {
			WebElement scheduleNavigationImage = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			eleUtil.waitForElementVisibleAndToBeClickable(scheduleNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			scheduleNavigationImage.click();
			log.info("Clicked on Class Navigation");

			WebElement editSchedule = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/mat-action-row/div/app-schedule-button/div/button/span/span[text()='Edit']"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, editSchedule);
			jsUtil.scrollIntoViewTrue(editSchedule);
			
			eleUtil.waitForElementVisibleAndToBeClickable(editSchedule, AppConstants.DEFAULT_SHORT_TIME_OUT);
			editSchedule.click();
			log.info("Clicked on Edit Schedule");
			
			WebElement scheduleNavigationImage55 = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			eleUtil.waitForElementVisibleAndToBeClickable(scheduleNavigationImage55, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			scheduleNavigationImage55.click();

			WebElement rowAction = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div[@row-id='0']/div[@col-id='actions']/app-row-actions/button"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, rowAction);
			jsUtil.clickElementByJS(rowAction);
			log.info("Clicked on Row Action");
			
			eleUtil.waitForElementVisibleAndToBeClickable(rowActionOpenButton, AppConstants.DEFAULT_SHORT_TIME_OUT);
			jsUtil.clickElementByJS(rowActionOpenButton);
			log.info("Clicked on Open Schedule");


			WebElement clickOnSearchButton = driver.findElement(By.xpath("(//input[@aria-label='Search'])[last()]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_LONG_TIME_OUT, clickOnSearchButton);
			jsUtil.clickElementByJS(clickOnSearchButton);
			log.info("Clicked on Search");

			clickOnSearchButton.sendKeys(countryNameData);
			log.info("Sent value in search : "+countryNameData);

			Thread.sleep(8000);
			WebElement Click_oncountryname = driver
					.findElement(By.xpath("(//div[@class='suggestions-wrapper']/ul/li)[2]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_LONG_TIME_OUT, Click_oncountryname);
			jsUtil.clickElementByJS(Click_oncountryname);
			log.info("Clicked on Country Name");

			WebElement ClickOn_ReverseGeocodebtn = driver
					.findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(.,'Reverse Geocode')]"));
			eleUtil.waitForElementVisibleAndToBeClickable(ClickOn_ReverseGeocodebtn, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(ClickOn_ReverseGeocodebtn);
			log.info("Clicked on Reverse Geocoding");

			WebElement ClickOn_Savebtn = driver
					.findElement(By.xpath("(//span[@class='mat-button-wrapper'][contains(.,'Save')])[last()]"));
			eleUtil.waitForElementVisibleAndToBeClickable(ClickOn_Savebtn, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(ClickOn_Savebtn);

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, saveTerms);
			jsUtil.scrollIntoViewTrue(saveTerms);
			jsUtil.clickElementByJS(saveTerms);;

			WebElement scheduleNavigationImage2 = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			scheduleNavigationImage2.click();
			eleUtil.waitForElementVisibleAndToBeClickable(scheduleNavigationImage2, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

		} catch (Exception e) {
			System.out.println("Issue in Common.openSchedule " + e);
		}
	}

	public String createNewReportWithMapToolsStorms(String reportName, String classNameWithEntityName,
			String aggegationSelectData, String perilName, String coverageName, String stormNameData,
			String damageFactorData) {
		String verifySearchedReport=null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(HomePage_ReportLinkButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			HomePage_ReportLinkButton.click();
			log.info("Clicked on Report Button");
		
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyPlus_Button, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicyPlus_Button.click();
			log.info("Clicked on Add Report");
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			reportNavigationImage.click();
			log.info("Clicked on Report Navigation");
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, reportNameInputBox);
			reportNameInputBox.clear();
			reportNameInputBox.sendKeys(reportName);
			log.info("Enter Report Name : "+reportName);
			Thread.sleep(1000);
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, classEntityFieldReportPage);
			classEntityFieldReportPage.click();
			Thread.sleep(2000);

			WebElement classNameWithEntity = driver.findElement(By.xpath(
					"//span[@class='mat-option-text'][contains(.,'" + " " + classNameWithEntityName + " " + "')]"));
			classNameWithEntity.click();
			log.info("Select Class Name : "+classNameWithEntityName);
			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(1000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(perilFieldReportPage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			perilFieldReportPage.click();
			Thread.sleep(3000);

			WebElement selectPerilsName = driver.findElement(
					By.xpath("//span[@class=\"mat-option-text\"][contains(.,'" + " " + perilName + " " + "')]"));
			selectPerilsName.click();
			log.info("Select Peril Name : "+perilName);

			eleUtil.clickTab();
			Thread.sleep(1000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(coveragesFieldReportPage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			coveragesFieldReportPage.click();
			Thread.sleep(2000);

			WebElement selectCoverageName = driver.findElement(
					By.xpath("//span[@class=\"mat-option-text\"][contains(.,'" + " " + coverageName + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, selectCoverageName);
			selectCoverageName.click();
			log.info("Select Coverage Name : "+coverageName);
			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(2000);

			jsUtil.scrollIntoViewTrue(aggregationFieldReportPage);
			Thread.sleep(1000);
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, aggregationFieldReportPage);
			aggregationFieldReportPage.click();
			log.info("Clicked on Aggregation");
			Thread.sleep(2000);

			WebElement ClickOnPolicyType = driver.findElement(By
					.xpath("//span[@class='mat-option-text'][contains(.,'" + " " + aggegationSelectData + " " + "')]"));
			ClickOnPolicyType.click();
			log.info("Select Aggregation Data - "+aggegationSelectData);
			Thread.sleep(2000);

			eleUtil.clickTab();
			log.info("Clicked on Tab");
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			reportNavigationImage.click();
			log.info("Clicked on Report Navigation Image");
			
			eleUtil.waitForElementVisibleAndToBeClickable(PreviewButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PreviewButton.click();
			log.info("Clicked on Preview Button");
			
			eleUtil.waitForElementVisibleAndToBeClickable(runButton, AppConstants.DEFAULT_LONG_TIME_OUT);
			runButton.click();
			log.info("Clicked on Run Button");
			Thread.sleep(5000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			reportNavigationImage.click();
			log.info("Clicked on Report Navigation Image");
			Thread.sleep(1000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(mapToolsButton, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(mapToolsButton);
			log.info("Clicked on Map Tool Button");

			eleUtil.waitForElementVisibleAndToBeClickable(stormsButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(stormsButton);
			log.info("Clicked on Storms Button");
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, stormsNameInputBox);
			stormsNameInputBox.clear();
			stormsNameInputBox.sendKeys(stormNameData);
			log.info("Enter Storm Name : "+stormNameData);
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(reportNavigationImage);
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, damageFactorSetField);
			damageFactorSetField.click();
			log.info("Clicked on Damage Factor Button");
			Thread.sleep(2000);

			WebElement SelectHurricane = driver.findElement(
					By.xpath("//span[@class='mat-option-text'][contains(.,'" + " " + damageFactorData + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, SelectHurricane);
			SelectHurricane.click();
			log.info("Select Data - "+damageFactorData);
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.scrollIntoViewTrue(saveTerms);
			Thread.sleep(1000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(saveTerms, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			saveTerms.click();
			log.info("Clicked on Save Button");
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			reportNavigationImage.click();
			log.info("Clicked on Report Navigation Image");
			Thread.sleep(3000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			hubNavigation.click();
			log.info("Clicked on Hub Navigation Image");
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, searchReportInputBox);
			searchReportInputBox.click();
			log.info("Clicked on Search Input Box");
			searchReportInputBox.clear();

			searchReportInputBox.sendKeys(reportName);
			log.info("Enter Report Name : "+reportName);
			
			eleUtil.waitForElementVisible(searchedReportData, AppConstants.DEFAULT_LONG_TIME_OUT);
			verifySearchedReport = searchedReportData.getText();
			Thread.sleep(1000);
			log.info("Verify Searched Report Data");
			

		} catch (Exception e) {
			System.out.println("Issue in Common.createNewReportWithMapToolsStorms " + e);
		}
		return verifySearchedReport;
	}

	public String createNewReportWithMapToolsShapesEvent(String reportName, String classNameWithEntityName,
			String aggegationSelectData, String perilName, String coverageName, String shapeNameData,
			String damageFactorData, String eventTypeSelectData, String offsetValue) {
		String verifySearchedReport=null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(HomePage_ReportLinkButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			HomePage_ReportLinkButton.click();
			log.info("Clicked on Report Link from Home Page");
			
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyPlus_Button, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicyPlus_Button.click();
			log.info("Clicked on Add Report");
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			reportNavigationImage.click();
			log.info("Clicked on Report Navigation Image");
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, reportNameInputBox);
			reportNameInputBox.clear();
			reportNameInputBox.sendKeys(reportName);
			log.info("Enter Report Name : "+reportName);
			
			eleUtil.waitForElementVisibleAndToBeClickable(classEntityFieldReportPage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			classEntityFieldReportPage.click();
			log.info("Clicked on Class Grid");

			WebElement classNameWithEntity = driver.findElement(By.xpath(
					"//span[@class='mat-option-text'][contains(.,'" + " " + classNameWithEntityName + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, classNameWithEntity);
			classNameWithEntity.click();
			log.info("Select Class Option - "+classNameWithEntityName);

			eleUtil.clickTab();
			
			eleUtil.waitForElementVisibleAndToBeClickable(perilFieldReportPage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			perilFieldReportPage.click();
			log.info("Clicked on Peril Grid");

			WebElement selectPerilsName = driver.findElement(
					By.xpath("//span[@class=\"mat-option-text\"][contains(.,'" + " " + perilName + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, selectPerilsName);
			selectPerilsName.click();
			log.info("Select Peril Option - "+perilName);

			eleUtil.clickTab();
			
			eleUtil.waitForElementVisibleAndToBeClickable(coveragesFieldReportPage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			coveragesFieldReportPage.click();
			log.info("Clicked on Coverage Grid");

			WebElement selectCoverageName = driver.findElement(
					By.xpath("//span[@class=\"mat-option-text\"][contains(.,'" + " " + coverageName + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, selectCoverageName);
			selectCoverageName.click();
			log.info("Select Coverage Option - "+coverageName);

			eleUtil.clickTab();
			Thread.sleep(2000);

			jsUtil.scrollIntoViewTrue(aggregationFieldReportPage);
			Thread.sleep(1000);
			eleUtil.waitForElementVisibleAndToBeClickable(aggregationFieldReportPage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			aggregationFieldReportPage.click();
			log.info("Clicked on Aggregation Grid");

			WebElement ClickOnPolicyType = driver.findElement(By
					.xpath("//span[@class='mat-option-text'][contains(.,'" + " " + aggegationSelectData + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, ClickOnPolicyType);
			ClickOnPolicyType.click();
			log.info("Select Aggregation Option - "+aggegationSelectData);

			eleUtil.clickTab();
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			reportNavigationImage.click();
			log.info("Clicked on Report Navigation Image");
			
			eleUtil.waitForElementVisibleAndToBeClickable(mapToolsButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			mapToolsButton.click();
			log.info("Clicked on Map Tools Button");
			//Thread.sleep(6000);

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, eventTypeField);
			eventTypeField.click();
			log.info("Clicked on Event Type");
			//Thread.sleep(2000);

			WebElement eventTypeSelectDataValue = driver.findElement(By
					.xpath("//span[@class='mat-option-text'][contains(.,'" + " " + eventTypeSelectData + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, eventTypeSelectDataValue);
			eventTypeSelectDataValue.click();
			log.info("Select Event Type - "+eventTypeSelectData);
			Thread.sleep(2000);

			if (eventTypeSelectData.trim().equals("Shape")) {
				WebElement shapeName = driver.findElement(By.xpath("//div//input[@aria-label='Event Name']"));
				eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, shapeName);
				shapeName.clear();
				shapeName.sendKeys(shapeNameData);
				log.info("Enter Shape Name : "+shapeNameData);
			} else {
				eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, shapeNameInputBox);
				shapeNameInputBox.clear();
				shapeNameInputBox.sendKeys(shapeNameData);
				log.info("Enter Shape Name : "+shapeNameData);
			}

			if (eventTypeSelectData.equals("Hotspot")) {
				WebElement ClickOnOffset = driver.findElement(
						By.xpath("//div[@class='shape-data-entry-field-grid']/mat-form-field/div/div/div/input"));
				eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, ClickOnOffset);
				ClickOnOffset.sendKeys(offsetValue);
				log.info("Enter Offset Value : "+offsetValue);
				//Thread.sleep(1000);
			}
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, damageFactorSetField);
			damageFactorSetField.click();
			log.info("Clicked on Damage Grid");
			//Thread.sleep(2000);

			WebElement selectDamageFactorData = driver.findElement(
					By.xpath("//span[@class='mat-option-text'][contains(.,'" + " " + damageFactorData + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, selectDamageFactorData);
			selectDamageFactorData.click();
			log.info("Select Damage Factor Data - "+damageFactorData);
			//Thread.sleep(4000);

			eleUtil.waitForElementVisibleAndToBeClickable(PreviewButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(PreviewButton);
			log.info("Clicked on Preview Button");
			//Thread.sleep(2000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(runButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(runButton);
			log.info("Clicked on Run Button");
			//Thread.sleep(10000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.scrollIntoViewTrue(saveTerms);
			log.info("Scroll to - Save");
			Thread.sleep(3000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(saveTerms, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(saveTerms);
			log.info("Clicked on Save Report");
			//Thread.sleep(5000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			reportNavigationImage.click();
			Thread.sleep(2000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			hubNavigation.click();
			log.info("Clicked on Hub Navigation Image");

			WebElement reportNameInputBox = driver
					.findElement(By.xpath("//input[contains(@placeholder,'Report Name')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, reportNameInputBox);
			reportNameInputBox.click();
			reportNameInputBox.clear();
			reportNameInputBox.sendKeys(reportName);
			
			log.info("Enter Report Name : "+reportName);
			Thread.sleep(5000);
			
			eleUtil.waitForElementVisible(searchedReportData, AppConstants.DEFAULT_VERY_LONG_TIME_OUT);
			verifySearchedReport = searchedReportData.getText();
			Thread.sleep(1000);
			log.info("Verify Searched Report Data");

		} catch (Exception e) {
			System.out.println("Issue in Common.createNewReportWithMapToolsShapesEvent " + e);
		}
		return verifySearchedReport;
	}

	public String createUnnamedNewReportAndCopyReportName(String classNameWithEntityName, String aggegationSelectData,
			String perilName, String coverageName, String stormNameData, String damageFactorData) {
		String verifySearchedReport=null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(HomePage_ReportLinkButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			HomePage_ReportLinkButton.click();
			log.info("Clicked on Report Button from Home Page");
			
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyPlus_Button, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicyPlus_Button.click();
			log.info("Clicked on Add Report");
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			reportNavigationImage.click();
			log.info("Clicked on Report Navigation Image");
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, classEntityFieldReportPage);
			classEntityFieldReportPage.click();
			log.info("Clicked on Class Grid");
			Thread.sleep(2000);

			WebElement ClickOnProperty = driver.findElement(By.xpath(
					"//span[@class='mat-option-text'][contains(.,'" + " " + classNameWithEntityName + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, ClickOnProperty);
			ClickOnProperty.click();
			log.info("Select Class - "+classNameWithEntityName);
			Thread.sleep(1000);

			eleUtil.clickTab();

			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, perilFieldReportPage);
			perilFieldReportPage.click();
			log.info("Clicked on Peril Grid");
			Thread.sleep(2000);

			WebElement selectPerilsName = driver.findElement(
					By.xpath("//span[@class=\"mat-option-text\"][contains(.,'" + " " + perilName + " " + "')]"));
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, selectPerilsName);
			selectPerilsName.click();
			log.info("Select Peril - "+perilName);
			//Thread.sleep(6000);
			eleUtil.clickTab();
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);

			coveragesFieldReportPage.click();
			log.info("Clicked on Coverage Grid");
			Thread.sleep(2000);

			WebElement selectCoverageName = driver.findElement(
					By.xpath("//span[@class=\"mat-option-text\"][contains(.,'" + " " + coverageName + " " + "')]"));
			selectCoverageName.click();
			log.info("Select Coverage - "+coverageName);
			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(2000);

			WebElement DateOfEvent = driver
					.findElement(By.xpath("(//div[contains(@class,'mat-select-arrow ng-tns-c')])[4]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, DateOfEvent);
			DateOfEvent.click();
			log.info("Select Date of Event");
			Thread.sleep(3000);

			WebElement Option_BetweenDates = driver
					.findElement(By.xpath("//span[@class='mat-option-text'][contains(.,'Between Dates')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, Option_BetweenDates);
			Option_BetweenDates.click();
			log.info("Select Option - Between Dates");
			Thread.sleep(1000);

			WebElement ToDate = driver.findElement(By.xpath("//div//input[@data-placeholder='ToDate']"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, ToDate);
			ToDate.click();
			log.info("Clicked on To Date");
			Thread.sleep(1000);

			WebElement Date11 = driver.findElement(By.xpath("//button//div[contains(.,' 30 ')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, Date11);
			Date11.click();
			log.info("Select To Date");
			Thread.sleep(2000);

			jsUtil.scrollIntoViewTrue(aggregationFieldReportPage);
			Thread.sleep(1000);
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, aggregationFieldReportPage);
			aggregationFieldReportPage.click();
			log.info("Clicked on Aggregation Grid");
			Thread.sleep(2000);

			WebElement ClickOnPolicyType = driver.findElement(By
					.xpath("//span[@class='mat-option-text'][contains(.,'" + " " + aggegationSelectData + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, ClickOnPolicyType);
			ClickOnPolicyType.click();
			log.info("Select Aggregation Option Data - "+aggegationSelectData);
			Thread.sleep(2000);

			eleUtil.clickTab();
			//Thread.sleep(7000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			reportNavigationImage.click();
			log.info("Clicked on Report Navigation Image");
			//Thread.sleep(2000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(PreviewButton, AppConstants.DEFAULT_SHORT_TIME_OUT);
			PreviewButton.click();
			log.info("Clicked on Preview Button");
			//Thread.sleep(7000);

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, runButton);
			runButton.click();
			log.info("Clicked on Run Button");
			Thread.sleep(5000);

			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			reportNavigationImage.click();
			log.info("Clicked on Report Navigation Image");
			//Thread.sleep(5000);
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, mapToolsButton);
			mapToolsButton.click();
			log.info("Clicked on Map Tools Button");
			//Thread.sleep(6000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			reportNavigationImage.click();
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, stormsButton);
			stormsButton.click();
			log.info("Clicked on Storms Button");
			//Thread.sleep(6000);

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, stormsNameInputBox);
			stormsNameInputBox.clear();
			stormsNameInputBox.sendKeys(stormNameData);
			log.info("Enter Storm Name : "+stormNameData);
			Thread.sleep(3000);
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, damageFactorSetField);
			damageFactorSetField.click();
			log.info("Clicked on Damage FactorSet Grid");
			Thread.sleep(2000);

			WebElement SelectHurricane = driver.findElement(
					By.xpath("//span[@class='mat-option-text'][contains(.,'" + " " + damageFactorData + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, SelectHurricane);
			SelectHurricane.click();
			log.info("Select Damage Factor Option Data - "+damageFactorData);
			//Thread.sleep(6000);

			jsUtil.scrollIntoViewTrue(saveTerms);
			Thread.sleep(1000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(saveTerms, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			saveTerms.click();
			log.info("Clicked on Save Report");
			//Thread.sleep(5000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			reportNavigationImage.click();
			Thread.sleep(3000);

			WebElement ReportNameSelect = driver.findElement(By.xpath("//input[@aria-label='ReportName']"));
			ReportNameSelect.click();
			log.info("Select Report Name");

			// Select the Report name (System generated) using CTRL + A
			Thread.sleep(2000);
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("a");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			// Copy the Report name (System generated) using CTRL + C
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("c");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			log.info("Select Report Name");
			Thread.sleep(3000);
			
			
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			hubNavigation.click();
			log.info("Clicked on Hub Navigation Image");
			//Thread.sleep(3000);

			// reportNameInputBox.click();
			WebElement reportNameInputBox = driver
					.findElement(By.xpath("//input[contains(@placeholder,'Report Name')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, reportNameInputBox);
			reportNameInputBox.click();
			reportNameInputBox.clear();

			// Paste the Edit Report name using CTRL + v
			//Thread.sleep(3000);
			Actions actionss = new Actions(driver);
			actionss.keyDown(Keys.CONTROL);
			actionss.sendKeys("v");
			actionss.keyUp(Keys.CONTROL);
			actionss.build().perform();
			
			log.info("Enter Report Name");
			Thread.sleep(1000);
			
			eleUtil.waitForElementVisible(searchedReportData, AppConstants.DEFAULT_LONG_TIME_OUT);
			verifySearchedReport = searchedReportData.getText();
			Thread.sleep(1000);
			log.info("Verify Searched Report Data");			

		} catch (Exception e) {
			System.out.println("Issue in Common.createUnnamedNewReportAndCopyReportName " + e);
		}
		return verifySearchedReport;
	}

	public void editUnnamedReportAndSave() {
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(reportHeaderLinkFromPolicyPage, AppConstants.DEFAULT_LONG_TIME_OUT);
			reportHeaderLinkFromPolicyPage.click();
			log.info("Clicked on Report Header Link from Policy Page");
			//Thread.sleep(5000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			hubNavigation.click();
			log.info("Clicked on Hub Navigation Image");
			//Thread.sleep(3000);

			// reportNameInputBox.click();
			WebElement reportNameInputBox = driver
					.findElement(By.xpath("//input[contains(@placeholder,'Report Name')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, reportNameInputBox);
			reportNameInputBox.click();
			reportNameInputBox.clear();

			// Paste the Edit Report name using CTRL + v
			//Thread.sleep(3000);
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.CONTROL);
			actions.sendKeys("v");
			actions.keyUp(Keys.CONTROL);
			actions.build().perform();
			
			log.info("Enter Report Name");

			Thread.sleep(1000);

			WebElement ClcikOnReport = driver.findElement(By.xpath("(//div[@col-id='[RRP].Description'])[2]"));
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			eleUtil.waitForElementVisibleAndToBeClickable(ClcikOnReport, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(ClcikOnReport);
			log.info("Open Searched Report");

			//Thread.sleep(6000);
			WebElement ReportNameSelect = driver.findElement(By.xpath("//input[@aria-label='ReportName']"));
			eleUtil.waitForElementVisibleAndToBeClickable(ReportNameSelect, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			ReportNameSelect.sendKeys("Edit");
			log.info("Update Report Name");
			Thread.sleep(2000);

			WebElement ScrollToFilter = driver
					.findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(.,'Filter')]"));
			jsUtil.scrollIntoViewTrue(ScrollToFilter);
			log.info("Scroll to - Filter");

			Thread.sleep(2000);
			WebElement Save_EditReport = driver
					.findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(.,'saveSave')]"));
			eleUtil.waitForElementVisibleAndToBeClickable(Save_EditReport, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			Save_EditReport.click();
			log.info("Clicked on Save Report");

			//Thread.sleep(7000);
			WebElement No_Confirmation_ON_CreateNewReport = driver
					.findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(.,'No')]"));
			eleUtil.waitForElementVisibleAndToBeClickable(No_Confirmation_ON_CreateNewReport, AppConstants.DEFAULT_LONG_TIME_OUT);
			No_Confirmation_ON_CreateNewReport.click();
			log.info("Confirmation - No");

			Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_LONG_TIME_OUT);
			hubNavigation.click();
			Thread.sleep(2000);
			
			WebElement RefreshSearch = driver.findElement(By.xpath("//mat-icon[@role='img'][contains(.,'refresh')]"));
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_LONG_TIME_OUT);
			eleUtil.waitForElementVisibleAndToBeClickable(RefreshSearch, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(RefreshSearch);
			log.info("Clicked on Refresh Search");
			//Thread.sleep(5000);
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);

		} catch (Exception e) {
			System.out.println("Issure in Common.editReportAndSave " + e);
		}
	}

	public void editReportFromReportPage(String reportName) {
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			hubNavigation.click();
			log.info("Clicked on Hub Navigation");
			Thread.sleep(1000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(searchReportInputBox, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			searchReportInputBox.clear();
			Thread.sleep(1000);
			searchReportInputBox.sendKeys(reportName);
			log.info("Enter Report Name : "+reportName);
			Thread.sleep(1000);

			WebElement ClickOnPolicyType = driver
					.findElement(By.xpath("//div[@role='gridcell'][contains(text(),'" + reportName + "')]"));
			Thread.sleep(1000);
			jsUtil.clickElementByJS(ClickOnPolicyType);
			log.info("Select and Open Searched Report");
			Thread.sleep(5000);

			PreviewButton.click();
			log.info("Clicked on Preview Button");
			Thread.sleep(7000);

			runButton.click();
			log.info("Clicked on Run Button");
			Thread.sleep(10000);

			jsUtil.scrollIntoViewTrue(savePolicy);
			log.info("Scroll to - Save Button");
			Thread.sleep(2000);

			savePolicy.click();
			log.info("Clicked on Save Button");
			Thread.sleep(7000);

		} catch (Exception e) {
			System.out.println("Issue in Common.editReportFromReportPage " + e);
		}
	}

	public void deleteReportFromReportPage(String reportName) {
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			hubNavigation.click();
			log.info("Clicked on Hub Navigation");
			Thread.sleep(1000);

			eleUtil.waitForElementVisibleAndToBeClickable(searchReportInputBox, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			searchReportInputBox.clear();
			Thread.sleep(1000);

			searchReportInputBox.sendKeys(reportName);
			log.info("Enter Report Name : "+reportName);
			Thread.sleep(5000);
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, rowActionReportFirstRow);
			rowActionReportFirstRow.click();
			log.info("Clicked on First Row Action Button");
			Thread.sleep(4000);

			rowActionDeleteButton.click();	
			log.info("Clicked on Row Action - Delete Button");
			Thread.sleep(2000);

			confirmationYes.click();
			log.info("Confirmation - Yes");
			Thread.sleep(2000);

			confirmationOk.click();
			log.info("Confirmation - Ok");
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println("Issue in Common.deleteReportFromReportPage " + e);
		}
	}

	public String createNewReportWithFilterData(String reportName, String classNameWithEntityName,
			String aggegationSelectData, String perilName, String coverageName, String stormNameData,
			String damageFactorData, String countryName) {
		String verifySearchedReport=null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(HomePage_ReportLinkButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			HomePage_ReportLinkButton.click();
			log.info("Clicked on Report Link from Home Page");
			//Thread.sleep(7000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(PolicyPlus_Button, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			PolicyPlus_Button.click();
			log.info("Clicked on Add Report");
			//Thread.sleep(1000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			reportNavigationImage.click();
			log.info("Clicked on Report Navigation");
			Thread.sleep(2000);

			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, reportNameInputBox);
			reportNameInputBox.clear();
			reportNameInputBox.sendKeys(reportName);
			log.info("Enter Report Name : "+reportName);
			//Thread.sleep(1000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(classEntityFieldReportPage, AppConstants.DEFAULT_SHORT_TIME_OUT);
			classEntityFieldReportPage.click();
			//Thread.sleep(2000);

			WebElement ClickOnProperty = driver.findElement(By.xpath(
					"//span[@class='mat-option-text'][contains(.,'" + " " + classNameWithEntityName + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, ClickOnProperty);
			ClickOnProperty.click();
			log.info("Select Class - "+classNameWithEntityName);
			Thread.sleep(1000);

			eleUtil.clickTab();
			//Thread.sleep(7000);

			eleUtil.waitForElementVisibleAndToBeClickable(perilFieldReportPage, AppConstants.DEFAULT_SHORT_TIME_OUT);
			perilFieldReportPage.click();
			log.info("Clicked on Peril Grid");
			Thread.sleep(1000);

			WebElement selectPerilsName = driver.findElement(
					By.xpath("//span[@class=\"mat-option-text\"][contains(.,'" + " " + perilName + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, selectPerilsName);
			selectPerilsName.click();
			log.info("Select Peril Name - "+perilName);
			Thread.sleep(1000);

			eleUtil.clickTab();
			//Thread.sleep(2000);

			eleUtil.waitForElementVisibleAndToBeClickable(coveragesFieldReportPage, AppConstants.DEFAULT_SHORT_TIME_OUT);
			coveragesFieldReportPage.click();
			log.info("Clicked on Coverage Grid");
			//Thread.sleep(2000);

			WebElement selectCoverageName = driver.findElement(
					By.xpath("//span[@class=\"mat-option-text\"][contains(.,'" + " " + coverageName + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, selectCoverageName);
			selectCoverageName.click();
			log.info("Select Coverage Name - "+coverageName);
			Thread.sleep(1000);

			eleUtil.clickTab();
			Thread.sleep(1000);

			jsUtil.scrollIntoViewTrue(aggregationFieldReportPage);
			Thread.sleep(1000);
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, aggregationFieldReportPage);
			aggregationFieldReportPage.click();
			log.info("Clicked on Aggregation Grid");
			//Thread.sleep(1000);

			WebElement ClickOnPolicyType = driver.findElement(By
					.xpath("//span[@class='mat-option-text'][contains(.,'" + " " + aggegationSelectData + " " + "')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, ClickOnPolicyType);
			ClickOnPolicyType.click();
			log.info("Select Aggregation Option Data - "+aggegationSelectData);
			Thread.sleep(1000);

			eleUtil.clickTab();
			//Thread.sleep(7000);

			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			reportNavigationImage.click();
			Thread.sleep(1000);

			WebElement PolicyScroll = driver
					.findElement(By.xpath("//span[@class='mat-button-wrapper'][contains(.,' Filter ')]"));
			jsUtil.scrollIntoViewTrue(PolicyScroll);
			Thread.sleep(1000);
			jsUtil.clickElementByJS(PolicyScroll);
			log.info("Clicked on Filter");
			//Thread.sleep(3000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(Click_AddRule, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			Click_AddRule.click();
			log.info("Clicked on Add Rule");
			//Thread.sleep(1000);
			
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, CountryName);
			CountryName.clear();
			CountryName.sendKeys(countryName);
			log.info("Enter Country Name : "+countryName);
			//Thread.sleep(1000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(saveButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			saveButton.click();
			log.info("Clicked on Save Button");
			//Thread.sleep(5000);
			
			eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_MEDIUM_TIME_OUT, 2, PreviewButton);
			jsUtil.scrollIntoViewTrue(PreviewButton);
			Thread.sleep(1000);
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, PreviewButton);
			jsUtil.clickElementByJS(PreviewButton);
			log.info("Clicked on Preview Button");
			//Thread.sleep(5000);

			eleUtil.waitForElementVisibleAndToBeClickable(runButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(runButton);
			//Thread.sleep(5000);
			
			eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_MEDIUM_TIME_OUT, 2, saveTerms);
			jsUtil.scrollIntoViewTrue(saveTerms);
			Thread.sleep(1000);
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_SHORT_TIME_OUT, PreviewButton);
			jsUtil.clickElementByJS(saveTerms);
			log.info("Clicked on Save Report");
			//Thread.sleep(10000);

			eleUtil.waitForElementVisibleAndToBeClickable(reportNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			reportNavigationImage.click();
			Thread.sleep(2000);
			
			
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			hubNavigation.click();
			log.info("Clicked on Hub Navigation Image");
			//Thread.sleep(3000);

			// reportNameInputBox.click();
			WebElement reportNameInputBox = driver
					.findElement(By.xpath("//input[contains(@placeholder,'Report Name')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, reportNameInputBox);
			reportNameInputBox.click();
			reportNameInputBox.clear();
			reportNameInputBox.sendKeys(reportName);
			
			log.info("Enter Report Name : "+reportName);
			Thread.sleep(1000);
			
			eleUtil.waitForElementVisible(searchedReportData, AppConstants.DEFAULT_LONG_TIME_OUT);
			verifySearchedReport = searchedReportData.getText();
			Thread.sleep(1000);
			log.info("Verify Searched Report Data");

		} catch (Exception e) {
			System.out.println("Issue in Common.createNewReportWithFilterData " + e);
		}
		return verifySearchedReport;

	}

	public String copyNewPolicyFromPolicyPage(String newPolicyNumber, String scheduleCheckBoxStatusYesOrNo) {
		String verifyCreatedPolicy=null;
		try {	
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(hubNavigation);
			
			jsUtil.scrollIntoViewTrue(copyRenewButton);

			eleUtil.waitForElementVisibleAndToBeClickable(copyRenewButton, AppConstants.DEFAULT_SHORT_TIME_OUT);

			jsUtil.clickElementByJS(copyRenewButton);
			log.info("Clicked on Copy/Renew Button");			

			WebElement EnterNewPolicyReference = driver
					.findElement(By.xpath("//input[@formcontrolname='PolicyReference']"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, EnterNewPolicyReference);
			EnterNewPolicyReference.clear();
			EnterNewPolicyReference.sendKeys(newPolicyNumber);
			log.info("Enter Policy Number : "+newPolicyNumber);
			
			// check or uncheck schedule check box
			if(scheduleCheckBoxStatusYesOrNo.equalsIgnoreCase("Yes")) {
				List<WebElement> scheduleListFromCopyPage=driver.findElements(By.xpath("//div[@class='policy-copy-schedule ng-star-inserted']/div/mat-checkbox"));
				int size=scheduleListFromCopyPage.size();
				
				for(int i=1;i<=size;i++) {
					WebElement ele=driver.findElement(By.xpath("(//div[@class='policy-copy-schedule ng-star-inserted']/div/mat-checkbox)["+i+"]"));
					ele.click();
					log.info("Uncheck the Schedule Check box");
				}				
			}			
			
			WebElement ClickOnCopy2 = driver.findElement(By.xpath("//span[contains(.,'content_copy Copy')]"));
			eleUtil.waitForElementVisibleAndToBeClickable(ClickOnCopy2, AppConstants.DEFAULT_SHORT_TIME_OUT);
			jsUtil.clickElementByJS(ClickOnCopy2);
			log.info("Clicked on Copy Button");
			
			eleUtil.waitForElementVisibleAndToBeClickable(confirmationOk, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			confirmationOk.click();
			log.info("Confirmation - Ok");
			
			verifyCreatedPolicy=searchPolicyFromPolicyPageAndOpen(newPolicyNumber);

		} catch (Exception e) {
			System.out.println("Issue in Common.copyNewPolicyFromPolicyPage " + e);
		}
		return verifyCreatedPolicy;
	}

	public String renewPolicy(String policyNumber, String renewPolicyNumber) {
		String verifyRenewPolicy=null;
		try {
			searchPolicyFromPolicyPageAndOpen(policyNumber);
	
			jsUtil.scrollIntoViewTrue(copyRenewButton);
			log.info("Scroll to - Copy/Renew Button");

			eleUtil.waitForElementVisibleAndToBeClickable(copyRenewButton, AppConstants.DEFAULT_SHORT_TIME_OUT);

			jsUtil.clickElementByJS(copyRenewButton);
			log.info("Clicked on Copy/Renew Button");			

			WebElement EnterNewPolicyReference = driver
					.findElement(By.xpath("//input[@formcontrolname='PolicyReference']"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, EnterNewPolicyReference);
			EnterNewPolicyReference.clear();
			EnterNewPolicyReference.sendKeys(renewPolicyNumber);
			log.info("Enter Policy Number : "+renewPolicyNumber);			

			WebElement CheckRenew = driver.findElement(By.xpath("(//span[contains(.,'Renew')])[last()]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, EnterNewPolicyReference);
			jsUtil.clickElementByJS(CheckRenew);
			log.info("Check Renew - Check Box");

			WebElement Check_CopyExpiredSchedules = driver
					.findElement(By.xpath("//span[contains(.,'Copy Expired Schedules')]"));
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_MEDIUM_TIME_OUT, Check_CopyExpiredSchedules);
			jsUtil.clickElementByJS(Check_CopyExpiredSchedules);
			log.info("Check - Copy Expired Schedules");
			
			WebElement ClickOnRenew = driver.findElement(By.xpath("//span[contains(.,'autorenew Renew')]"));
			eleUtil.waitForElementVisibleAndToBeClickable(ClickOnRenew, AppConstants.DEFAULT_SHORT_TIME_OUT);
			jsUtil.clickElementByJS(ClickOnRenew);
			log.info("Clicked on Renew Button");

			eleUtil.waitForElementVisibleAndToBeClickable(confirmationOk, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			confirmationOk.click();
			log.info("Confirmation - Ok");

			verifyRenewPolicy=searchPolicyFromPolicyPageAndOpen(renewPolicyNumber);

		} catch (Exception e) {
			System.out.println("Issue in Common.renewPolicy " + e);
		}
		return verifyRenewPolicy;
	}

	public String quickQuote(String countyValue) {
		String actualPolicyQuickQuote=null;
		try {
			eleUtil.waitForElementVisibleAndToBeClickable(HomePage_PolicyLinkButton, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(HomePage_PolicyLinkButton);
			log.info("Click on Policy From Home Page");
			Thread.sleep(5000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(quickQuotePlus_Button, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(quickQuotePlus_Button);
			log.info("Clicked on Quick Quote Button");
			
			eleUtil.waitForElementPresenceWithFluentWait(AppConstants.DEFAULT_VERY_LONG_TIME_OUT, 2, quickQuoteAutomaticPolicyNumberEle);
			String quickQuoteAutoPolicy=quickQuoteAutomaticPolicyNumberEle.getText();
			String s[]=quickQuoteAutoPolicy.split(",");
			log.info("Auto Generated Policy Number : "+s[0]);
			
			eleUtil.waitForElementVisibleAndToBeClickable(searchButton, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(searchButton);
			log.info("Clicked on Search Button");
			
			eleUtil.waitForElementVisibleAndToBeClickable(countyInputGrid, AppConstants.DEFAULT_LONG_TIME_OUT);
			countyInputGrid.clear();
			countyInputGrid.sendKeys(countyValue);
			Thread.sleep(8000);
			log.info("Enter County Data : "+countyValue);
			
			eleUtil.waitForElementVisibleAndToBeClickable(addSingleScheduleData, AppConstants.DEFAULT_LONG_TIME_OUT);
			eleUtil.waitForElementToBeClickable(AppConstants.DEFAULT_LONG_TIME_OUT, addSingleScheduleData);

			jsUtil.clickElementByJS(addSingleScheduleData);
			log.info("Select Schedule Data");
			
			eleUtil.waitForElementVisibleAndToBeClickable(runButton, AppConstants.DEFAULT_LONG_TIME_OUT);
			eleUtil.waitForElementVisibleAndToBeClickable(runButton, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(runButton);
			log.info("Clicked on Run");
			Thread.sleep(59000);
			
			jsUtil.clickElementByJS(saveButton2);
			log.info("Clicked on Save");
			Thread.sleep(10000);
			
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_LONG_TIME_OUT);
			eleUtil.waitForElementVisibleAndToBeClickable(hubNavigation, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(hubNavigation);
			log.info("Clicked on Hub Navigation");
			
			actualPolicyQuickQuote=s[0];					
			
		} catch (Exception e) {
			System.out.println("Issue in Common.quickQuote "+e);
		}
		return actualPolicyQuickQuote;
	}
	
	public String copyScheduleFromPolicyPage(String classNameXpath, String ingridSearchPolicyNumberCopySchedule) {
		String successfulMessage=null;
		try {			
			WebElement scheduleNavigationImage = driver.findElement(
					By.xpath("(//span[@class='material-icons'][contains(.,'" + classNameXpath + "')])[1]"));
			eleUtil.waitForElementVisibleAndToBeClickable(scheduleNavigationImage, AppConstants.DEFAULT_LONG_TIME_OUT);
			jsUtil.clickElementByJS(scheduleNavigationImage);
			log.info("Clicked on Class Navigation");
			Thread.sleep(2000);
			
			WebElement selectAllCheckBox = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath
							+ "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='gridHeader']/div[@class='ag-pinned-left-header']/div/div[@col-id='row_selection']/div[@class='ag-labeled ag-label-align-right ag-checkbox ag-input-field ag-header-select-all']/div[@ref='eWrapper']"));
			eleUtil.waitForElementVisibleAndToBeClickable(selectAllCheckBox, AppConstants.DEFAULT_VERY_LONG_TIME_OUT);
			
			selectAllCheckBox.click();
			Thread.sleep(1000);
			log.info("Clicked on - Select All Check Box");

			WebElement rowAction = driver.findElement(
					By.xpath("//div[@class='class-icon-set-margin class-icon']/span[text()='" + classNameXpath + "']/ancestor::div[@class='schedule-grid ng-star-inserted']/expansion-panel/mat-expansion-panel/div/div/div/div/app-schedules/div/div/div/ag-grid-angular/div/div/div[@role='grid']/div[@ref='eBodyViewport']/div[@ref='leftContainer']/div[@row-id='0']/div[@col-id='show_hide_edit']/app-row-actions/button"));
			Thread.sleep(1000);
			eleUtil.waitForElementVisibleAndToBeClickable(rowAction, AppConstants.DEFAULT_SHORT_TIME_OUT);
			rowAction.click();
			Thread.sleep(1000);
			log.info("Clicked on Row Action Button");

			rowActionCopyScheduleButton.click();
			log.info("Clicked on Row Action Copy Schedule");
			
			eleUtil.waitForElementVisibleAndToBeClickable(copySchedulePopupFilterButton, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			jsUtil.clickElementByJS(copySchedulePopupFilterButton);
			log.info("Clicked on Filter Button for Copy Schedule");
			
			
			eleUtil.waitForElementVisibleAndToBeClickable(ingridPolicySeachCopySchedule, AppConstants.DEFAULT_SHORT_TIME_OUT);
			jsUtil.clickElementByJS(ingridPolicySeachCopySchedule);
			log.info("Ingrid Seach - Policy Number");
			ingridPolicySeachCopySchedule.click();
			ingridPolicySeachCopySchedule.sendKeys(ingridSearchPolicyNumberCopySchedule);
			log.info("Ingrid Search - Policy Number : "+ingridSearchPolicyNumberCopySchedule);
			
			Thread.sleep(8000);
			WebElement eleCheck=driver.findElement(By.xpath("(//input[@ref='eInput'])[last()]/parent::div"));
			eleUtil.waitForElementVisibleAndToBeClickable(eleCheck, AppConstants.DEFAULT_LONG_TIME_OUT);
			eleCheck.click();
			log.info("Select Policy");
			
			jsUtil.clickElementByJS(copyButtonForCopySchedule);
			log.info("Click on Copy");
			
			WebElement popupConfirmationOK=driver.findElement(By.xpath("(//app-alert-dialog/div)[3]/button"));
			eleUtil.waitForElementVisibleAndToBeClickable(popupConfirmationOK, AppConstants.DEFAULT_MEDIUM_TIME_OUT);
			
			WebElement popupConfirmationMessage=driver.findElement(By.xpath("(//app-alert-dialog/div)[2]/p"));
			successfulMessage=popupConfirmationMessage.getText();
			
			WebElement popupConfirmationOK2=driver.findElement(By.xpath("(//app-alert-dialog/div)[3]/button"));
			jsUtil.clickElementByJS(popupConfirmationOK2);
			log.info("Verify Success or Fail Message");
			log.info("Confirmation - OK");
					
		} catch (Exception e) {
			System.out.println("Issue in Common.copyScheduleFromPolicyPage "+e);
		}
		return successfulMessage;
	}
}