package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Resizable page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */

public class Resizable extends BasePage {

	/**
	 * The main resizable menu in center of page (5 tabs)
	 */
	
	@FindBy(id = "ui-id-1")
	protected static WebElement defaultFunctionalityTab;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement animateTab;// tab2

	@FindBy(id = "ui-id-3")
	protected static WebElement constrainResizeAreaTab;// tab3

	@FindBy(id = "ui-id-4")
	protected static WebElement helperTab;// tab4

	@FindBy(id = "ui-id-5")
	protected static WebElement maxMinSizeTab;// tab5
	
	/**
	 * Default functionality tab's divs 
	 */
	
	@FindBy(xpath = ".//*[@id='tabs-1']/div")
	protected static WebElement centralActionDivTab1;
	
	@FindBy(id = "resizable")
	protected static WebElement resizableDiv;
	
	@FindBy(xpath = ".//*[@id='resizable']/div[1]")
	protected static WebElement rightDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizable']/div[2]")
	protected static WebElement bottomDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizable']/div[3]")
	protected static WebElement cornerDivClickedToResize;
	
	/**
	 * Animate tab's divs 
	 */
	
	@FindBy(xpath = ".//*[@id='tabs-2']/div")
	protected static WebElement centralActionDivTab2;
	
	@FindBy(id = "resizableani")
	protected static WebElement resizableAnimateDiv;
	
	@FindBy(xpath = ".//*[@id='resizableani']/div[1]")
	protected static WebElement rightAnimateDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizableani']/div[2]")
	protected static WebElement bottomAnimateDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizableani']/div[3]")
	protected static WebElement cornerAnimateDivClickedToResize;
	
	/**
	 * Constrain resize area tab's divs 
	 */
	
	@FindBy(id = "container1")
	protected static WebElement constrainDiv;
	
	@FindBy(id = "resizableconstrain")
	protected static WebElement resizableConstrainBoxDiv;
	
	@FindBy(xpath = ".//*[@id='resizableconstrain']/div[1]")
	protected static WebElement rightConstrainDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizableconstrain']/div[2]")
	protected static WebElement bottomConstrainDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizableconstrain']/div[3]")
	protected static WebElement cornerConstrainDivClickedToResize;
	
	/**
	 * Helper tab's divs 
	 */
	
	@FindBy(id = "resizable_helper")
	protected static WebElement resizableHelperDiv;
	
	@FindBy(xpath = ".//*[@id='resizable_helper']/div[1]")
	protected static WebElement rightHelperDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizable_helper']/div[2]")
	protected static WebElement bottomHelperDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizable_helper']/div[3]")
	protected static WebElement cornerHelperDivClickedToResize;
	
	/**
	 * Max/Min size tab's divs 
	 */
	
	@FindBy(xpath = ".//*[@id='tabs-5']/div")
	protected static WebElement centralActionDivTab5;
	
	@FindBy(id = "resizable_max_min")
	protected static WebElement resizableMaxMinDiv;
	
	@FindBy(xpath = ".//*[@id='resizable_max_min']/div[1]")
	protected static WebElement rightMaxMinDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizable_max_min']/div[2]")
	protected static WebElement bottomMaxMinDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizable_max_min']/div[3]")
	protected static WebElement cornerMaxMinDivClickedToResize;

}

