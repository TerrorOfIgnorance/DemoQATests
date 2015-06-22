package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.ServicesLogic;
import utils.Drivers;

public class ServicesTest extends BasePageTest{

	pageObjects.Services services = PageFactory.initElements(Drivers.driver,
			pageObjects.Services.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@Before
	public void getSite(){
		Drivers.driver.get("http://demoqa.com/services/");
	}
	
	@Test
	public void testAboutUsPageTitle() {
		Drivers.driver.get("http://demoqa.com/services/");
		ServicesLogic.validateServicesPageTitle();
	}

	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsHeadingIsDisplayed() {
		assertTrue(ServicesLogic.servicesHeadingIsDisplayed());
	}

	@Test
	public void aboutUsParagraphIsDisplayed() {
		assertTrue(ServicesLogic.servicesParagraphIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
