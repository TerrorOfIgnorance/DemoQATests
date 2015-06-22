package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Tabs page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */

public class Tabs extends BasePage {
	
	/**
	 * The horizontal tabs with corresponding paragraphs
	 */
	
	@FindBy(id = "ui-id-1")
	protected static WebElement tab1;
	
	@FindBy(id = "tabs-1")
	protected static WebElement tab1ParagraphDiv;
	
	@FindBy(id = "ui-id-2")
	protected static WebElement tab2;

	@FindBy(id ="tabs-2")
	protected static WebElement tab2ParagraphDiv;
	
	@FindBy(id = "ui-id-3")
	protected static WebElement tab3;

	@FindBy(id = "tabs-3")
	protected static WebElement tab3ParagraphDiv;

}