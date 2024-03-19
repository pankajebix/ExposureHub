package base;

import org.openqa.selenium.WebDriver;

import ehub.com.baseLibrary.BaseClass;

public class BaseTest extends BaseClass {

	public static WebDriver driver;

	public void setup() {
		driver = initilization();
	}
}
