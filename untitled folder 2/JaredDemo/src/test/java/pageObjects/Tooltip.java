package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Tooltip page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */

public class Tooltip extends BasePage{
	
	/**
	 * The main Tooltip menu in center of page (2 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement defaultFunctionalityTab;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement customAnimationDemoTab;// tab2

	/**
	 * Default Functionality tab's elements
	 */
	
	@FindBy(id = "age")
	protected static WebElement ageInput;
	
	@FindBy(xpath =".//*[@id='ui-tooltip-19']/div")
	protected static WebElement ageInputMessage;
			
	@FindBy(xpath = ".//*[@id='tabs-1']/div/p[1]/a")
	protected static WebElement tooltipsWidget;
	
	@FindBy(xpath = ".//*[@id='tabs-1']/div/p[1]/a")
	protected static WebElement tooltipsWidgetMessage;
	
	@FindBy(css = "a[href='http://jqueryui.com/themeroller/']")
	protected static WebElement themeRoller;
	
	@FindBy(xpath =".//*[@id='tabs-1']/div/p[2]/a")
	protected static WebElement themeRollerMessage;

	
	/**
	 * Custom animation demo tab's elements
	 */
	
	@FindBy(id = "show-option")
	protected static WebElement showOption;
	
	@FindBy(xpath =".//*[@id='show-option']")
	protected static WebElement showOptionMessage;
	
	@FindBy(id = "hide-option")
	protected static WebElement hideOption;
	
	@FindBy(xpath =".//*[@id='ui-tooltip-66']/div")
	protected static WebElement hideOptionMessage;
	
	@FindBy(id = "open-event")
	protected static WebElement openEvent;
	
	@FindBy(xpath =".//*[@id='ui-tooltip-67']/div")
	protected static WebElement openEventOptionMessage;
	
}

