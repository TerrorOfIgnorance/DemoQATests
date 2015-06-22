package testsLogic;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Registration;
import utils.Drivers;
import utils.RandomStringGenerator;
import utils.commUtil;

public class RegistrationLogic extends Registration {

	/**
	 * boolean to validate the page title
	 */

	public static boolean validateRegistrationPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Registration | Demoqa");
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * Visibility booleans
	 */

	public static boolean passwordStrengthIndicatorIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(passwordStrengthIndicator);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * Methods for filling in Registration form
	 */

	public static void validFillInFormWithExistingData() {
		firstNameField.sendKeys("tester");
		lastNameField.sendKeys("tester");
		readingRadio.click();
		phoneInput.sendKeys("1234567891");
		usernameInput.sendKeys("tester");
		emailInput.sendKeys("tester@testing.com");
		passwordInput.sendKeys("Testing101");
		confirmPasswordInput.sendKeys("Testing101");
		try {
			submitButton.click();
		} catch (Exception noSubmitButton) {
			System.out
					.println("validFillInFormWithExistingData Failed because the submit button is missing or non-functional");
		}
		WebDriverWait wait = new WebDriverWait(Drivers.driver, 10);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOf(errorSuccessMessage));
		Assert.assertNotNull(element);
	}

	public static void validFillInFormWithRandomData() throws Exception {
		firstNameField.sendKeys(RandomStringGenerator.generateRandomString(10,
				RandomStringGenerator.Mode.ALPHA));
		lastNameField.sendKeys(RandomStringGenerator.generateRandomString(10,
				RandomStringGenerator.Mode.ALPHA));
		readingRadio.click();
		phoneInput.sendKeys(RandomStringGenerator.generateRandomString(10,
				RandomStringGenerator.Mode.NUMERIC));
		usernameInput.sendKeys(RandomStringGenerator.generateRandomString(10,
				RandomStringGenerator.Mode.ALPHA));
		emailInput.sendKeys(RandomStringGenerator.generateRandomString(10,
				RandomStringGenerator.Mode.ALPHANUMERIC)
				+ "@"+ RandomStringGenerator.generateRandomString(5,
						RandomStringGenerator.Mode.ALPHA) + ".com");
		passwordInput.sendKeys("Testing101");
		confirmPasswordInput.sendKeys("Testing101");
		try {
			submitButton.click();
		} catch (Exception noSubmitButton) {
			System.out
					.println("validFillInFormWithRandomData Failed because the submit button is missing or non-functional");
		}
		WebDriverWait wait = new WebDriverWait(Drivers.driver, 10);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOf(thankYouSuccessMessage));
		Assert.assertNotNull(element);
	}
	
	/**
	 * When submit is clicked do the error messages appear
	 */

	public static boolean fieldErrorMessagesDisplayed() {
		try {
			submitButton.click();
		} catch (Exception noSubmitButton) {
			System.out
					.println("validFillInForm Failed because the submit button is missing or non-functional");
		}
		if (
		ExpectedConditions.visibilityOf(namesErrorMessage) != null &&
		ExpectedConditions.visibilityOf(hobbyErrorMessage)!= null &&
		ExpectedConditions.visibilityOf(phoneNumberErrorMessage)!= null &&
		ExpectedConditions.visibilityOf(emailErrorMessage)!= null &&
		ExpectedConditions.visibilityOf(passwordErrorMessage)!= null &&
		ExpectedConditions.visibilityOf(confirmPasswordErrorMessage)!= null ){
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Logic for testing the profile picture upload
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
		public static boolean validUploadedPicture() throws IOException, InterruptedException{
			browseForPicButton.click();
		 Runtime.getRuntime().exec("C:\\Users\\jpayne\\Desktop\\photoUpload2.exe");
		 Thread.sleep(4000);
		if(!(browseForPicButton.getText().equalsIgnoreCase("No file selected."))){
			Thread.sleep(3000);
			return true;
		}
		Thread.sleep(3000);
		return false;
		}
}
