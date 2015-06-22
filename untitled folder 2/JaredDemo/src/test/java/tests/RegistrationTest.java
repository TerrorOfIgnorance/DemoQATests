package tests;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.RegistrationLogic;
import utils.Drivers;

public class RegistrationTest extends BasePageTest{
	
	pageObjects.Registration registration = PageFactory.initElements(Drivers.driver, pageObjects.Registration.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/registration/");
	}

	@Test
	public void testRegistrationPageTitle() {
		RegistrationLogic.validateRegistrationPageTitle();
	}
	
	/** 
	 * Visibility Tests
	 */

	@Test
	public void passwordStrengthIndicatorIsDisplayed() {
		assertTrue(RegistrationLogic.passwordStrengthIndicatorIsDisplayed());
	}
	
	/**
	 * Form Validation Testing 
	 */
	
	@Test
	public void testvalidFillInFormWithExistingData() {
		RegistrationLogic.validFillInFormWithExistingData();
	}
	@Test
	public void testvalidFillInFormWithRandomData() throws Exception {
		RegistrationLogic.validFillInFormWithRandomData();
	}
	/**
	 * Testing if the error messages all displayed when fields are null and submit is clicked
	 */
	
	@Test
	public void fieldErrorMessagesDisplayed() {
		assertTrue(RegistrationLogic.fieldErrorMessagesDisplayed());
	}
	
	/**
	 * Test for picture upload (using autoIT)
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	
/*	@Test
	public void testValidUploadedPicture() throws IOException, InterruptedException {
		assertTrue(RegistrationLogic.validUploadedPicture());
	}*/
	

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
