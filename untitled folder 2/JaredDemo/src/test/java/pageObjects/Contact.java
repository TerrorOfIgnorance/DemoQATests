package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Contact page
 * Implemented locating through xpath only when no other means applied.
 * @author jPayne
 */

public class Contact extends BasePage{

	/**
	 * Contact page specifics
	 */
	
	@FindBy(name = "your-name")
	protected static WebElement yourNameInput;
	
	@FindBy(name = "your-email")
	protected static WebElement yourEmailInput;
	
	@FindBy(name = "your-subject")
	protected static WebElement subjectInput;
	
	@FindBy(name = "your-message")
	protected static WebElement messageInput;
	
	@FindBy(xpath = ".//*[@id='wpcf7-f375-p28-o1']/form/p[5]/input")
	protected static WebElement sendButton;
	
	@FindBy(className = ".//*[@id='wpcf7-f375-p28-o1']/form/div[2]")
	protected static WebElement validationErrorsMessage;
	
	@FindBy(xpath = ".//*[@id='wpcf7-f375-p28-o1']/form/div[2]")
	protected static WebElement validationSuccessMessage;
	
}


