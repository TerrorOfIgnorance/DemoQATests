package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for Registration Page
 * Implemented locating through xpath only when no other means applied
 * @author jPayne
 *
 */

public class Registration extends BasePage {

	/**
	 * Registration Form Inputs and Elements
	 */
	
	@FindBy(name = "first_name")
	protected static WebElement firstNameField;

	@FindBy(name = "last_name")
	protected static WebElement lastNameField;

	@FindBy(xpath = ".//*[@id='pie_register']/li[2]/div/div/input[1]")
	protected static WebElement singleRadio;

	@FindBy(xpath = ".//*[@id='pie_register']/li[2]/div/div/input[2]")
	protected static WebElement marriedRadio;

	@FindBy(xpath = ".//*[@id='pie_register']/li[2]/div/div/input[3]")
	protected static WebElement divorcedRadio;

	@FindBy(xpath = ".//*[@id='pie_register']/li[3]/div/div/input[1]")
	protected static WebElement danceRadio;

	@FindBy(xpath = ".//*[@id='pie_register']/li[3]/div/div/input[2]")
	protected static WebElement readingRadio;

	@FindBy(xpath = ".//*[@id='pie_register']/li[3]/div/div/input[3]")
	protected static WebElement cricketRadio;

	@FindBy(id = "dropdown_7")
	protected static WebElement countryDropDown;

	@FindBy(id = "mm_date_8")
	protected static WebElement monthDOBDropDown;

	@FindBy(id = "dd_date_8")
	protected static WebElement dayDOBDropDown;

	@FindBy(id = "yy_date_8")
	protected static WebElement yearDOBDropDown;

	@FindBy(id = "phone_9")
	protected static WebElement phoneInput;

	@FindBy(id = "username")
	protected static WebElement usernameInput;

	@FindBy(id = "email_1")
	protected static WebElement emailInput;

	@FindBy(id = "profile_pic_10")
	protected static WebElement browseForPicButton;

	@FindBy(id = "description")
	protected static WebElement aboutYourselfInput;

	@FindBy(id = "password_2")
	protected static WebElement passwordInput;

	@FindBy(id = "confirm_password_password_2")
	protected static WebElement confirmPasswordInput;

	@FindBy(name = "pie_submit")
	protected static WebElement submitButton;
	
	@FindBy(id = "piereg_passwordStrength")
	protected static WebElement passwordStrengthIndicator;

	/** 
	 * Error messages for the invalid Fields
	 */
	
	@FindBy(xpath = ".//*[@id='pie_register']/li[1]/div[1]/div[2]/span")
	protected static WebElement namesErrorMessage;
	
	@FindBy(xpath = ".//*[@id='pie_register']/li[3]/div/div[2]/span")
	protected static WebElement hobbyErrorMessage;
	
	@FindBy(xpath = ".//*[@id='pie_register']/li[6]/div/div/span")
	protected static WebElement phoneNumberErrorMessage;
	
	@FindBy(xpath = ".//*[@id='pie_register']/li[8]/div/div/span")
	protected static WebElement emailErrorMessage;

	@FindBy(xpath =".//*[@id='pie_register']/li[11]/div/div/span")
	protected static WebElement passwordErrorMessage;

	@FindBy(xpath =".//*[@id='pie_register']/li[12]/div/div/span")
	protected static WebElement confirmPasswordErrorMessage;
	
	/**
	 * Registration success message and error messages
	 */
	
	@FindBy(className = "piereg_message")
	protected static WebElement thankYouSuccessMessage;
	
	@FindBy(className = "piereg_login_error")
	protected static WebElement errorSuccessMessage;
	
}
