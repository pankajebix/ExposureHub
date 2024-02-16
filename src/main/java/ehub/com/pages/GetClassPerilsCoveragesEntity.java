package ehub.com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ehub.com.constants.AppConstants;

public class GetClassPerilsCoveragesEntity {
	
	private WebDriver driver;
	CommonLocatorsAndMethod common;
	
	public String className;
	public String getclassNamefromExcel;

	public GetClassPerilsCoveragesEntity(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		common = new CommonLocatorsAndMethod(driver);
	}
	
	public void login() {
			common.login(AppConstants.username, AppConstants.password);
	}
	
	public void getClassDetails() {
		try {
			common.HomePage_PolicyLinkButton.click();
			Thread.sleep(5000);

			common.PolicyPlus_Button.click();
			Thread.sleep(5000);

			JavascriptExecutor jse14 = (JavascriptExecutor) driver;
			jse14.executeScript("scroll(0,3000)");

			common.classField.click();
			Thread.sleep(3000);
			
			List<WebElement> classesList= driver.findElements(By.xpath("//*[@class='mat-option-text']"));
			System.out.println("Total Class is :- "+classesList.size());
			for(int i = 0;i<=classesList.size()-1;i++)
			{
				className = classesList.get(i).getText();
				int j=i+2;
				if(!common.excUtil.isSheetExist("Classes"))
				{
					common.excUtil.addSheet("Classes");
				}
				common.excUtil.setCellData("Classes", "Class", j, className);
			}

			common.eleUtil.clickTab();	
			Thread.sleep(1000);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void getPerilsDetails() {
		try {
			common.PerilsField.click();
			Thread.sleep(1000);
			
			List<WebElement> perilsList = driver.findElements(By.xpath("//mat-option[starts-with(@id,'mat-option')]"));
			for(int i=0;i<=perilsList.size()-1;i++)
			{
				String perilsName = perilsList.get(i).getText();
				int j=i+2;
				if(!common.excUtil.isSheetExist("Perils"))
				{
					common.excUtil.addSheet("Perils");
				}				
				common.excUtil.setCellData("Perils", "Perils", j, perilsName);
			}
	
			common.eleUtil.clickTab();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void getCoveragesDetails() {
		try {
			common.coveragesField.click();
			Thread.sleep(1000);
			
			List<WebElement> coveragesList = driver.findElements(By.xpath("//mat-option[starts-with(@id,'mat-option')]"));
			for(int i=0;i<=coveragesList.size()-1;i++)
			{
				String coveragesName= coveragesList.get(i).getText();
				int j=i+2;
				if(!common.excUtil.isSheetExist("Coverages"))
				{
					common.excUtil.addSheet("Coverages");
				}
				common.excUtil.setCellData("Coverages", "Coverages", j, coveragesName);
			}
			common.eleUtil.clickTab();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
