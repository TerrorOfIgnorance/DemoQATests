package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Autocomplete page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */

public class Autocomplete extends BasePage {

	/**
	 * The main autocomplete menu in center of page (5 tabs)
	 */

	@FindBy(id = "ui-id-4")
	protected static WebElement defaultFunctionalityTab;// tab1

	@FindBy(id = "ui-id-5")
	protected static WebElement multipleValuesTab;// tab2

	@FindBy(id = "ui-id-6")
	protected static WebElement categoriesTab;// tab3
	
	/**
	 * Default functionality tab's elements
	 */
	
	@FindBy(id = "tagss")
	protected static WebElement tagsInput;
	
	@FindBy(xpath =".//*[@id='ui-id-1']/li[contains(.,'ActionScript')]")
	protected static WebElement dropDownActionScript;
	
	@FindBy(xpath =".//*[@id='ui-id-1']/li[contains(.,'AppleScript')]")
	protected static WebElement dropDownAppleScript;
	
	/**
	 * Multiple Values tab's elements
	 */
	
	@FindBy(id = "tagsss")
	protected static WebElement tagProgrammingLanguagesInput;
	
	@FindBy(xpath =".//*[@id='ui-id-2']/li[contains(.,'ColdFusion')]")
	protected static WebElement dropDownColdFusion;
	
	@FindBy(xpath =".//*[@id='ui-id-2']/li[contains(.,'Haskell')]")
	protected static WebElement dropDownHaskell;
	
	/**
	 * Categories tab's elements
	 */
	
	@FindBy(id = "searcha")
	protected static WebElement categoriesSearchInput;
	
	@FindBy(xpath=".//*[@id='ui-id-3']/li[contains(.,'annhhx10')]")
	protected static WebElement dropDownAnnhhx10;

}

