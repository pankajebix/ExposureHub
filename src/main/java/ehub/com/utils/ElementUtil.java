package ehub.com.utils;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public String getCurrentURL() {
		String currentURL = driver.getCurrentUrl();
		return currentURL;
	}

	public String getCurrentTitle() {
		String currentTitle = driver.getTitle();
		return currentTitle;
	}

	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

	public WebElement getElement(By locator, int timeOut) {
		return waitForElementVisible(locator, timeOut);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendKeys(By locator, String value) {
		WebElement element = getElement(locator);
		element.clear();
		element.sendKeys(value);
	}

	public void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public void doActionsSendKeys(WebElement ele, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(ele, value).build().perform();
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doActionsCick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
	
	public void doActionsCick(WebElement ele) {
		Actions act = new Actions(driver);
		act.click(ele).build().perform();
	}
	
	// Mouse Actions
	public void doActionsDoubleCick(WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).build().perform();
	}
	
	public void doActionsContextCick(WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).build().perform();
	}
	
	public void doActionsClickAndHold(WebElement ele) {
		Actions act = new Actions(driver);
		act.clickAndHold(ele).build().perform();
	}
	
	public void doActionsDragAndDrop(WebElement sourceElement, WebElement targetElement) {
		Actions act = new Actions(driver);
		act.dragAndDrop(sourceElement, targetElement).build().perform();
	}
	
	public void doActionsDragAndDrop(WebElement sourceElement, int xOffset, int yOffset) {
		Actions act = new Actions(driver);
		act.dragAndDropBy(sourceElement, xOffset, yOffset).build().perform();
	}
	
	public void doActionsMoveToElement(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}	
	//  Mouse Actions end 

	public String doElementGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public String getElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public void getElementAttributes(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
		}
	}
	
	public void getElementAttributes(List<WebElement> eleList, String attrName) {
		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(attrName);
			System.out.println(attrVal);
		}
	}

	public int getTotalElementsCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("total elements for : " + locator + "--->" + eleCount);
		return eleCount;
	}
	
	public int getTotalElementsCount(List <WebElement> eleList) {
		int eleCount = eleList.size();
		System.out.println("total elements for : " + eleList + "--->" + eleCount);
		return eleCount;
	}

	public List<String> getElementsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();// size=0
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}
	
	public List<String> getElementsTextList(List<WebElement> eleList) {
		List<String> eleTextList = new ArrayList<String>();// size=0
		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}

	// *************************Select based drop down utils****************//

	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectDropDownByIndex(WebElement ele, int index) {
		Select select = new Select(ele);
		select.selectByIndex(index);
	}

	public void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public void doSelectDropDownByValue(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByValue(value);
	}

	public void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public void doSelectDropDownByVisibleText(WebElement ele, String text) {
		Select select = new Select(ele);
		select.selectByVisibleText(text);
	}

	public List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public List<WebElement> getDropDownOptionsList(WebElement ele) {
		Select select = new Select(ele);
		return select.getOptions();
	}

	public List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}
	
	public List<String> getDropDownOptionsTextList(WebElement ele) {
		List<WebElement> optionsList = getDropDownOptionsList(ele);
		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}

	public void selectDropDownValue(By locator, String expValue) {
		List<WebElement> optionsList = getDropDownOptionsList(locator);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(expValue)) {
				e.click();
				break;
			}
		}
	}
	
	public void selectDropDownValue(WebElement ele, String expValue) {
		List<WebElement> optionsList = getDropDownOptionsList(ele);
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(expValue)) {
				e.click();
				break;
			}
		}
	}

	public int getTotalDropDownOptions(By locator) {
		int optionsCount = getDropDownOptionsList(locator).size();
		System.out.println("total options ==> " + optionsCount);
		return optionsCount;
	}
	
	public int getTotalDropDownOptions(WebElement ele) {
		int optionsCount = getDropDownOptionsList(ele).size();
		System.out.println("total options ==> " + optionsCount);
		return optionsCount;
	}

	public void doSearch(By suggListLocator, String suggName) {
		List<WebElement> suggList = getElements(suggListLocator);
		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(suggName)) {
				e.click();
				break;
			}
		}
	}

	// ************************Wait Utils **********************//
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that an element, known to be present on the DOM
	 * of a page, is visible. Visibility means that the element is not only
	 * displayed but also has a height and width that is greater than 0.
	 * 
	 * @param WebElement
	 * @param timeOut
	 * @return the (same) WebElement once it is visible
	 */
	public WebElement waitForElementVisible(WebElement ele, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOf(ele));
	}

	/**
	 * An expectation for checking that all elements present on the web page that
	 * match the locator are visible. Visibility means that the elements are not
	 * only displayed but also have a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public List<WebElement> waitForElementsVisible(WebElement ele, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElements(ele));
	}

	/**
	 * An expectation for checking that there is at least one element present on a
	 * web page.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public List<WebElement> waitForElementsPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	/**
	 * 
	 * @param timeOut
	 * @return
	 */
	public Alert waitForAlertPresence(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public String getAlertText(int timeOut) {
		return waitForAlertPresence(timeOut).getText();
	}

	public void acceptAlert(int timeOut) {
		waitForAlertPresence(timeOut).accept();
	}

	public void dismissAlert(int timeOut) {
		waitForAlertPresence(timeOut).dismiss();
	}

	public void alertSendKeys(int timeOut, String value) {
		waitForAlertPresence(timeOut).sendKeys(value);
	}

	public String waitForTitleContainsAndFetch(int timeOut, String titleFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleContains(titleFractionValue));
		return driver.getTitle();
	}

	public String waitForTitleIsAndFetch(int timeOut, String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();
	}

	public String waitForURLContainsAndFetch(int timeOut, String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlContains(urlFractionValue));
		return driver.getCurrentUrl();
	}

	public String waitForURLIsAndFetch(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlToBe(urlValue));
		return driver.getCurrentUrl();
	}

	public boolean waitForURLContains(int timeOut, String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.urlContains(urlFractionValue));

	}

	public void waitForFrameAndSwitchToItByIDOrName(int timeOut, String idOrName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}

	public void waitForFrameAndSwitchToItByIndex(int timeOut, int frameIndex) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}

	public void waitForFrameAndSwitchToItByFrameElement(int timeOut, WebElement frameElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}

	public void waitForFrameAndSwitchToItByFrameLoctor(int timeOut, By frameLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	/**
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it.
	 * 
	 * @param timeOut
	 * @param locator
	 */
	public void clickWhenReady(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	public WebElement waitForElementToBeClickable(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public WebElement waitForElementToBeClickable(int timeOut, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void doClickWithActionsAndWait(int timeOut, By locator) {
		WebElement ele = waitForElementToBeClickable(timeOut, locator);
		Actions act = new Actions(driver);
		act.click(ele).build().perform();
	}
	
	public void doClickWithActionsAndWait(int timeOut, WebElement ele) {
		waitForElementToBeClickable(timeOut, ele);
		Actions act = new Actions(driver);
		act.click(ele).build().perform();
	}

	public WebElement waitForElementPresenceWithFluentWait(int timeOut, int pollingTime, By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class)
				.pollingEvery(Duration.ofSeconds(pollingTime)).withMessage("...element is not found on the page....");

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public WebElement waitForElementPresenceWithFluentWait(int timeOut, int pollingTime, WebElement ele) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class)
				.pollingEvery(Duration.ofSeconds(pollingTime)).withMessage("...element is not found on the page....");

		return wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public void waitForAlertWithFluentWait(int timeOut, int pollingTime) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.ignoring(NoAlertPresentException.class).pollingEvery(Duration.ofSeconds(pollingTime))
				.withMessage("...Alert is not found on the page....");

		wait.until(ExpectedConditions.alertIsPresent());

	}

	public void isClickableWebElement(WebElement ele, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public void switchFrameToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public void switchFrameByIdOrName(String id) {
		driver.switchTo().frame(id);
	}

	public void implicitlyWait(int timeOut) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
	}

	public void clickTab() {
		try {
			Actions ClickOutSide = new Actions(driver);
			Thread.sleep(2000);
			ClickOutSide.sendKeys(Keys.TAB).build().perform();

		} catch (Exception e) {
			System.out.println("Issue in ElementUtil.clickTab " + e);
		}
	}

	public void waitForElementVisibleAndToBeClickable(WebElement ele, int timeOut) {
		waitForElementVisible(ele, timeOut);
		waitForElementToBeClickable(timeOut, ele);
	}
	
	public String retryWebElementGetText(WebElement ele, int attemptsCount) {
		String actual = null;
		try {
			int attempts = 0;
			while (attempts < attemptsCount) {
				try {
					actual = ele.getText();

				} catch (StaleElementReferenceException e) {
				}
				attempts++;
			}
			return actual;
		} catch (Exception e) {
			System.out.println("Issue in ElementUtil.retryWebElementGetText " + e);
		}
		return actual;
	}
	
	/**
	 * Capture screenshot of specific web element: Earlier, users can take a
	 * screenshot of the entire page as there was no provision to take the
	 * screenshot of the specific web element. But with Selenium 4, users can take
	 * the screenshot of a specific web element.
	 *
	 * @param Webelement ele
	 * @param dstFilepath
	 */
	public void takeScreenshotOfSpecificElement(WebElement ele, String dstFilePath) {
		try {
			File srcFile = ele.getScreenshotAs(OutputType.FILE);
			File dstFile = new File(dstFilePath);
			FileUtils.copyFile(srcFile,dstFile);
			
		} catch (Exception e) {
			System.out.println("Issue in ElementUtil.takeScreenshotOfSpecificElement "+e);
		}		
	}

}
