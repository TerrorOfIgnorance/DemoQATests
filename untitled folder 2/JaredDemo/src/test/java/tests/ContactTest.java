package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.ContactLogic;
import utils.Drivers;

public class ContactTest extends BasePageTest {
	
	pageObjects.Contact contact = PageFactory.initElements(Drivers.driver, pageObjects.Contact.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/contact/");
	}
	@Test
	public void testContactPageTitle() {
		ContactLogic.validateContactPageTitle();
	
	}

	/**
	 * Tests for contact validation
	 */
	
	@Test
	public void errorDisplayedWhenEmailNull() {
		ContactLogic.errorDisplayedWhenEmailNull();
	}

	@Test
	public void errorDisplayedWhenNameNull() {
		ContactLogic.errorDisplayedWhenNameNull();
	}
	
	@Test
	public void errorDisplayedWhenNameEmailNull() {
		ContactLogic.errorDisplayedWhenNameEmailNull();
	}
	
	@Test
	public void successWithValidEmailName() throws Exception {
		ContactLogic.successWithValidEmailName();
	}
	
	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}