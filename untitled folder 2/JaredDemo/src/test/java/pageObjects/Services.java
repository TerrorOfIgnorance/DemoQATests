package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Services page
 * Implemented locating through xpath only when no other means applied.
 * @author jPayne
 */

public class Services extends BasePage {
	
	/**
	 * Services page specific heading and paragraph
	 */
	
	@FindBy(className = "entry-title")
	protected static WebElement servicesHeading;
	
	@FindBy(className = "entry-content")
	protected static WebElement servicesParagraph;
	
}

