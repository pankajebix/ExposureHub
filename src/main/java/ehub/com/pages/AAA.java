package ehub.com.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class AAA {
	
	public static void main(String[] args) throws IOException {
//		System.out.println("dd");
//		
////		Excelutility	excUtil=new Excelutility(System.getProperty("user.dir")+AppConstants.pathofExcelDataAsPerEnv);
////		System.out.println(excUtil.getCellData("policyNumber", "Value", 4));
////		System.out.println(excUtil.getCellData("policyNumber", "Value", 5));
////		
////		excUtil.setCellData("Classes", "Class", 2, "Pankaj");
////		excUtil.setCellData("Classes", "Class", 3, "Neeraj");
//		
//		Boolean a=false;
//		
//		Assert.assertTrue(a);
		
		WebDriver driver = null;
		driver=new ChromeDriver();
		driver.get("https://test-v2-eh.ebixexchange.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement screenshot =driver.findElement (By.xpath("//input[@data-placeholder='User Id']"));
		
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(screenshot));		
	}	
}
