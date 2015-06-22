package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the About Us page
 * Implemented locating through xpath only when no other means applied.
 * @author jPayne
 */

public class AboutUs extends BasePage {

	/**
	 * About Us page specific heading and paragraph
	 */
	
	@FindBy(className = "entry-title")
	protected static WebElement aboutUsHeading;
	
	@FindBy(className = "entry-content")
	protected static WebElement aboutUsParagraph;
	
}

