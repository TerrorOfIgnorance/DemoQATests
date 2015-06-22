package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * The page object for the Accordian Widget page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */
public class Accordion extends BasePage {

	/**
	 * The main accordion menu in center of page (3 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement defaultFunctionalityTab;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement customizeIconsTab;// tab2

	@FindBy(id = "ui-id-3")
	protected static WebElement fillSpaceTab;// tab3
	
	/**
	 * Default Functionality tab's elements
	 */
	
	@FindBy(id = "ui-accordion-accordion-header-0")
	protected static WebElement section1headerTab1;
	
	@FindBy(id = "ui-accordion-accordion-panel-0")
	protected static WebElement section1panelTab1;
	
	@FindBy(id = "ui-accordion-accordion-header-1")
	protected static WebElement section2headerTab1;
	
	@FindBy(id = "ui-accordion-accordion-panel-1")
	protected static WebElement section2panelTab1;
	
	@FindBy(id = "ui-accordion-accordion-header-2")
	protected static WebElement section3headerTab1;
	
	@FindBy(id = "ui-accordion-accordion-panel-2")
	protected static WebElement section3panelTab1;
	
	@FindBy(id = "ui-accordion-accordion-header-3")
	protected static WebElement section4headerTab1;
	
	@FindBy(id = "ui-accordion-accordion-panel-3")
	protected static WebElement section4panelTab1;
	
	/**
	 * Custom Icons tab's elements
	 */
	
	@FindBy(id = "ui-accordion-accordion_icons-header-0")
	protected static WebElement section1headerTab2;
	
	@FindBy(xpath=".//*[@id='ui-accordion-accordion_icons-header-0']/span")
	protected static WebElement section1Arrow;
	
	@FindBy(id = "ui-accordion-accordion_icons-panel-0")
	protected static WebElement section1panelTab2;
	
	@FindBy(id = "ui-accordion-accordion_icons-header-1")
	protected static WebElement section2headerTab2;
	
	@FindBy(xpath=".//*[@id='ui-accordion-accordion_icons-header-1']/span")
	protected static WebElement section2Arrow;
	
	@FindBy(id = "ui-accordion-accordion_icons-panel-1")
	protected static WebElement section2panelTab2;
	
	@FindBy(id = "ui-accordion-accordion_icons-header-2")
	protected static WebElement section3headerTab2;
	
	@FindBy(xpath=".//*[@id='ui-accordion-accordion_icons-header-2']/span")
	protected static WebElement section3Arrow;
	
	@FindBy(id = "ui-accordion-accordion_icons-panel-2")
	protected static WebElement section3panelTab2;
	
	@FindBy(id = "ui-accordion-accordion_icons-header-3")
	protected static WebElement section4headerTab2;
	
	@FindBy(xpath=".//*[@id='ui-accordion-accordion_icons-header-3']/span")
	protected static WebElement section4Arrow;
	
	@FindBy(id = "ui-accordion-accordion_icons-panel-3")
	protected static WebElement section4panelTab2;
	
	@FindBy(id = "toggle")
	protected static WebElement toggleButton;
	
	/**
	 * Fill Space tab's elements
	 */
	
	@FindBy(id = "ui-accordion-accordion_fill-header-0")
	protected static WebElement section1headerTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-panel-0")
	protected static WebElement section1panelTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-header-1")
	protected static WebElement section2headerTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-panel-1")
	protected static WebElement section2panelTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-header-2")
	protected static WebElement section3headerTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-panel-2")
	protected static WebElement section3panelTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-header-3")
	protected static WebElement section4headerTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-panel-3")
	protected static WebElement section4panelTab3;
	
}

