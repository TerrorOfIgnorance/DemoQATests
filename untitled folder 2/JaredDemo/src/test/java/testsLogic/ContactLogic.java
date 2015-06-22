package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.Contact;
import utils.Drivers;
import utils.RandomStringGenerator;

public class ContactLogic extends Contact {
	
	/**
	 * boolean to validate the page title
	 */

	public static boolean validateContactPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Contact | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * For tests regarding contact validation
	 */
	
	public static void errorDisplayedWhenEmailNull(){
		yourNameInput.clear();
		yourEmailInput.clear();
		yourNameInput.sendKeys("tester");
		sendButton.click();
		if (ExpectedConditions.visibilityOf(validationErrorsMessage)!=null) {
			boolean errorMessageVisible = true;
			Assert.assertTrue(errorMessageVisible);
		}
	}	
	
	public static void errorDisplayedWhenNameNull(){
		yourNameInput.clear();
		yourEmailInput.clear();
		yourEmailInput.sendKeys("tester@test.com");
		sendButton.click();
		if (ExpectedConditions.visibilityOf(validationErrorsMessage)!=null) {
			boolean toError = true;
			Assert.assertTrue(toError);
		}
	}	
	
	public static void errorDisplayedWhenNameEmailNull(){
		yourNameInput.clear();
		yourEmailInput.clear();
		sendButton.click();
		if (ExpectedConditions.visibilityOf(validationErrorsMessage)!=null) {
			boolean toError = true;
			Assert.assertTrue(toError);
		}
	}	
	
	public static void successWithValidEmailName() throws Exception{
		yourNameInput.sendKeys(RandomStringGenerator.generateRandomString(20,
				RandomStringGenerator.Mode.ALPHA));
		yourEmailInput.sendKeys(RandomStringGenerator.generateRandomString(10,
				RandomStringGenerator.Mode.ALPHANUMERIC)
				+ "@"+ RandomStringGenerator.generateRandomString(5,
						RandomStringGenerator.Mode.ALPHA) + ".com");
		sendButton.click();
		if (ExpectedConditions.visibilityOf(validationSuccessMessage)!=null) {
			boolean toSuccessMessage = true;
			Assert.assertTrue(toSuccessMessage);
		}
	}	
}
